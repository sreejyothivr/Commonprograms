package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BasicAssertionwithoutbrowser {
	WebDriver driver;

	@Test
	public void verifyLoginbuttonText() {

		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		String actual = loginbutton.getText();
		String expected = "LOGINoo";
		// Assert.assertEquals(actual, expected," :Login button text not expected");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual, expected, " :Login button text not expected ");
		System.out.println("if assertion is soft Assertion,the remaing code will get executed");
		soft.assertAll();

	}

	@Test
	public void remembermeCheckBoxValidation() {

		WebElement checkbox = driver.findElement(By.xpath("//input[@id='loginform-rememberme']"));
		checkbox.click();
		boolean expected = false;
		boolean actual = checkbox.isSelected();
		Assert.assertEquals(actual, expected, " :The rememeberme checkbox is selected");

	}
	@BeforeMethod
	
	public void beforemethod() {
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sreejyothy\\Desktop\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
			driver = new ChromeDriver();
	
		driver.get("https://www.qabible.in/payrollapp/site/login\n");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void aftermethod() {
		driver.close();
	}

}
