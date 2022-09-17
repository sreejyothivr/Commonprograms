package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ElementRepository.DashboardPage;
import ElementRepository.LoginPage;

public class LoginTestcase {
	
	WebDriver driver;
	@Test
	public void testlogin_func_Verification()
	{
		LoginPage lp=new LoginPage(driver);
		lp.performLogin();
		lp.clickloginButton();
		DashboardPage dp=new DashboardPage(driver);
		String actual=dp.displayProfileName();
		String expected="CAROL THOMAS";
		Assert.assertEquals(actual, expected,"User login is not working as we expected");
		
	}
	
	
	@BeforeMethod
	public void beforemethod() 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sreejyothy\\Desktop\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	@AfterMethod 
	public void aftermethod()
	  { 
		driver.close();
	  }

	
}
