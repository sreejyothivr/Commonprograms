package ElementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// By userName=By.id("loginform-username");
	@FindBy(id = "loginform-username")
	WebElement userName;
	
	@FindBy(id="loginform-password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbutton;
	
	


	//By password = By.id("loginform-password");
	//By loginbutton = By.xpath("//button[@type='submit']");

	public void getusername(String name) {
		userName.sendKeys(name);
		//carol
	}

	public void getpassword(String pswd) {
	password.sendKeys(pswd);
	//"1q2w3e4r"

	}

	public void clickloginButton() {

		loginbutton.click();
	}
	
	public void performLogin()
	{
		getusername("carol");
		getpassword("1q2w3e4r");
		clickloginButton() ;
	}
}
