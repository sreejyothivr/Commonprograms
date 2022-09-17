package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Timesheet {

		public static void main(String[] args) throws InterruptedException, AWTException 
		{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sreejyothy\\Desktop\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait-Define only once in pgm
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.navigate().to("https://www.qabible.in/payrollapp/site/login ");
		driver.get("https://www.qabible.in/payrollapp/site/login ");
		driver.manage().window().maximize();
		driver.findElement(By.id("loginform-username")).sendKeys("carol");
		driver.findElement(By.id("loginform-password")).sendKeys("1q2w3e4r");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Delay
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(5000));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("TimeSheet")));
		//Thread.sleep(2000);
		
		//Fluent wiat
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(30))//maximum time
		        .pollingEvery(Duration.ofSeconds(5))//polling intervel
		        .ignoring(NoSuchElementException.class);

		WebElement timesheet=driver.findElement(By.xpath("//a[@href='/payrollapp/timesheet/index']"));
		timesheet.click();
		WebElement createtimesheet=driver.findElement(By.xpath("//a[@href='/payrollapp/timesheet/create']"));
		createtimesheet.click();
		//Thread.sleep(6000);
	WebElement click=	driver.findElement(By.xpath("//div[@class='btn btn-primary btn-file']"));
	//	Thread.sleep(4000);
		Robot rob=new Robot();
		Actions a=new Actions(driver);
		a.moveToElement(click).click().perform();
	
		StringSelection ss = new StringSelection("C:\\Users\\sreejyothy\\Desktop\\file.jpg");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	     rob.delay(250);

	     rob.keyPress(KeyEvent.VK_CONTROL);
	     rob.keyPress(KeyEvent.VK_V);
	     rob.keyRelease(KeyEvent.VK_V);
	     rob.keyRelease(KeyEvent.VK_CONTROL);
	     rob.keyPress(KeyEvent.VK_ENTER);
	     rob.delay(250);
	     rob.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//button[@title='Upload selected files']")).click();
	     Thread.sleep(3000);
	     /*  WebElement branchob=driver.findElement(By.id("timesheet-branch_id"));
	   Select branch=new Select(branchob);
	     branch.selectByIndex(1);
	     WebElement clientob=driver.findElement(By.id("select2-timesheet-client_id-container"));
	     clientob.click();
	     Select client=new Select(clientob);
	     Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@tabindex='0']")).sendKeys("Suraj");
	     
	 rob.keyPress(KeyEvent.VK_ENTER);	*/
		//driver.close();
		
	}

}
