package ElementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkersPage {
	WebDriver driver;

	public WorkersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// By profileName=By.xpath("//a[@class='dropdown-toggle']");

	@FindBy(xpath="//button[@type='submit']")
	WebElement search;
	
	@FindBy(xpath="//button[@type='reset']")
	WebElement reset;
	
	
	@FindBy(xpath="//a[@href='/payrollapp/worker/index']")
	WebElement workerss;

	

	public String searchbuttondisplay() {
		return search.getText();
	}
	public String resetbuttondisplay() {
		return reset.getText();
	}
	
	public void workerspagetab() {
		workerss.click();;
		
	
	}
	
	
}




