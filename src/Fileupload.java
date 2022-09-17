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



public class Fileupload {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sreejyothy\\Desktop\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/upload/\r\n");
		driver.manage().window().maximize();
		Robot rob=new Robot();
		//rob.keyPress(KeyEvent.VK_ALT);
		//rob.keyRelease(KeyEvent.VK_ALT);
		WebElement click=driver.findElement(By.id("uploadfile_0"));
		Actions a=new Actions(driver);
		a.moveToElement(click).click().perform();
	
		StringSelection ss = new StringSelection("C:\\Users\\sreejyothy\\Pictures\\Screenshots\\Screenshot (139).jpg");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	     rob.delay(250);

	     rob.keyPress(KeyEvent.VK_CONTROL);
	     rob.keyPress(KeyEvent.VK_V);
	     rob.keyRelease(KeyEvent.VK_V);
	     rob.keyRelease(KeyEvent.VK_CONTROL);
	     rob.keyPress(KeyEvent.VK_ENTER);
	     rob.delay(250);
	     rob.keyRelease(KeyEvent.VK_ENTER);
	     
	     
	}

}
