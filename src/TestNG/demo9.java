package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class demo9 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
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

			
			WebElement client=driver.findElement(By.xpath("//a[@href='/payrollapp/client/index']"));
			client.click();
			WebElement search=driver.findElement(By.xpath("//button[@type='submit']"));
			String search_bgcolor=search.getCssValue("background-color");
			System.out.println(search_bgcolor);
			String searchExpecetd="rgba(51, 122, 183, 1)";
			SoftAssert soft=new SoftAssert();
			soft.assertEquals(search_bgcolor, searchExpecetd);
		}

	}

