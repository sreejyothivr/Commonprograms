package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class FileUpload2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sreejyothy\\Desktop\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		        driver.get("https://demo.guru99.com/selenium/upload/");
		        driver.manage().window().maximize();
		        Robot r=new Robot();
		        WebElement click=driver.findElement(By.id("uploadfile_0"));
		        Actions a=new Actions(driver);
		        a.moveToElement(click).click().perform();
		        Thread.sleep(2000);
		        StringSelection ss=new StringSelection("C:\\Users\\sreejyothy\\Desktop\\Tooltip.java");
		        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		        r.delay(250);

		        r.keyPress(KeyEvent.VK_CONTROL);
		        r.keyPress(KeyEvent.VK_V);
		        r.keyRelease(KeyEvent.VK_V);
		        r.keyRelease(KeyEvent.VK_CONTROL);
		        r.keyPress(KeyEvent.VK_ENTER);
		        r.delay(250);
		        r.keyRelease(KeyEvent.VK_ENTER);
																																																																																
	}

}
