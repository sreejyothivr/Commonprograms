package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebElementCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sreejyothy\\Desktop\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
//SENDKEYS
		WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("Jyothi");
		WebElement passWord = driver.findElement(By.id("loginform-password"));
		passWord.sendKeys("Qburst@12345");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		loginButton.click();
		// CLEAR
		userName.clear();
		// GETTAGNAME
		String username = userName.getTagName();
		System.out.println(username);
		// GETATTRIBUTE
		String attribute = userName.getAttribute("type");
		System.out.println(attribute);

		// CSSVALUE
		String loginColor = loginButton.getCssValue("background-color");
		System.out.println(loginColor);
		String fontSize = loginButton.getCssValue("font-size");
		System.out.println(fontSize);
		driver.close();
		
		
		

	}

}
