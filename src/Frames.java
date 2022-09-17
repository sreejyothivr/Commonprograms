import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\sreejyothy\\Desktop\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/frames\r\n");
	driver.manage().window().maximize();
	//switch to the frame using id
//	driver.switchTo().frame("frame1");
	//driver.switchTo().frame(1);
	
	WebElement frame=driver.findElement(By.xpath("//iframe[@id='frame1']"));
	driver.switchTo().frame(frame);
	String k=driver.findElement(By.id("sampleHeading")).getText();
	System.out.println(k);
	driver.switchTo().parentFrame();
	//driver.switchTo().defaultContent();
	
	
	
}}
