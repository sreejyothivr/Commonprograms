package ElementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {
	WebDriver driver;

	public ClientPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//a[@href='/payrollapp/client/index']")
	WebElement clienttab;
	@FindBy(xpath="//button[@type='submit']")
			WebElement searchtabcolor;		

	

	

	public void selectclienttab() {
		clienttab.click();
	
	}
	
	public String searchButtonColor() {
		return searchtabcolor.getCssValue("background-color");
	}
	
	
}



