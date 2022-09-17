package ElementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// By profileName=By.xpath("//a[@class='dropdown-toggle']");

	@FindBy(xpath="//a[@class='dropdown-toggle']")
	WebElement profileName;

	

	public String displayProfileName() {
		return profileName.getText();
	}
}
