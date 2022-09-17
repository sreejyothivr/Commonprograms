package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertassignment {
	WebDriver driver;

	@Test(priority=2)
	public void background_color_search()
{

	WebElement client=driver.findElement(By.xpath("//a[@href='/payrollapp/client/index']"));
	client.click();
	WebElement search=driver.findElement(By.xpath("//button[@type='submit']"));
	String search_bgcolor=search.getCssValue("background-color");
	String searchExpecetd="rgba(51, 122, 183, 1)";
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(search_bgcolor, searchExpecetd);
	
		soft.assertAll();
	}
@Test(priority=3)
public void toolTipValidation()
{
	 WebElement deduction=driver.findElement(By.xpath("//a[@href='/payrollapp/deduction/index']"));
	 deduction.click();
	 WebElement eyeicon=driver.findElement(By.xpath("//table[@class='table table-striped table-bordered']//tbody//tr[20]//td[7]//a[@aria-label='View']"));
	// System.out.println(eyeicon.getAttribute("title"));
	 String title_actual=eyeicon.getAttribute("title");
	 String title_expected="View";
	 Assert.assertEquals(title_actual, title_expected,":The title is not like as we expected");
	 
}

@Test(priority=1)
	public void search_reset_text() {
		WebElement workers = driver.findElement(By.xpath("//a[@href='/payrollapp/worker/index']"));
		workers.click();
		WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
		String actual = search.getText();
		String expected = "Search";
		Assert.assertEquals(actual, expected, ": The The search straings are not as we expected");
		WebElement reset = driver.findElement(By.xpath("//button[@type='reset']"));
		String actual2 = reset.getText();
		String expected2 = "Reset";
		Assert.assertEquals(actual2, expected2, ": The Reset strings are not as we expected");

	}

	@BeforeMethod
	public void beforemethod() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sreejyothy\\Desktop\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement passWord = driver.findElement(By.id("loginform-password"));
		passWord.sendKeys("1q2w3e4r");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	
	  @AfterMethod public void aftermethod()
	  { driver.close();
	  }
	 

}
