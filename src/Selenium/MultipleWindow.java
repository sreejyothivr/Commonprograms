package Selenium;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sreejyothy\\Desktop\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows\r\n");
		driver.manage().window().maximize();
		WebElement newwindow = driver.findElement(By.id("tabButton"));
		newwindow.click();
		String parrentwindow = driver.getWindowHandle();
		System.out.println(parrentwindow);

		Set<String> Allwindows = driver.getWindowHandles();
		System.out.println(Allwindows);
		for (String childwindow : Allwindows) {
			if (!parrentwindow.equals(childwindow)) {
				driver.switchTo().window(childwindow);
				String m = driver.findElement(By.id("sampleHeading")).getText();
				System.out.println(m);
			}
		}
driver.switchTo().window(parrentwindow);
	}

}
