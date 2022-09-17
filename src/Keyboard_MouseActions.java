import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_MouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sreejyothy\\Desktop\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons\r\n");
		Actions a=new Actions(driver);
		WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
	//	a.doubleClick(doubleclick).perform();
		//a.doubleClick().perform();
		
		WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
	//	a.contextClick(rightclick).perform();
		//a.contextClick().perform();
		a.moveToElement(doubleclick).perform();
		
		a.sendKeys(Keys.BACK_SPACE).perform();
		
		a.sendKeys(Keys.ARROW_DOWN).perform();
		
		
		
		
		
		
	}

}
