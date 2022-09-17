package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sreejyothy\\Desktop\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/\r\n");
			driver.manage().window().maximize();
			
			//div[@class='nav-search-scope nav-sprite']
			WebElement k=driver.findElement(By.id("searchDropdownBox"));
		String l=	k.getAttribute("title");
			System.out.println(l);
	}

}
