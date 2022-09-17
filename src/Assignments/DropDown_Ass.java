package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Ass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sreejyothy\\Desktop\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();
		
		WebElement passenger=driver.findElement(By.name("passCount"));
		Select s=new Select(passenger);
		s.selectByIndex(2);
		WebElement Departingfrom=driver.findElement(By.name("fromPort"));
		Select m=new Select(Departingfrom);
		m.selectByValue("London");
		WebElement airLine=driver.findElement(By.name("airline"));
		Select k=new Select(airLine);
		k.selectByVisibleText("Blue Skies Airlines");
		
		
	}

}
