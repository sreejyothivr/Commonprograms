import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sreejyothy\\Desktop\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php\r\n");
		driver.manage().window().maximize();
	//	WebElement clickme_btn=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
	//	clickme_btn.click();
		//driver.switchTo().alert().accept();
//	String text=driver.switchTo().alert().getText();
//	System.out.println("The text inside the pop up is: "+text);
	//	driver.switchTo().alert().dismiss();
		WebElement click_prompt_box=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
				click_prompt_box.click();
				Thread.sleep(2000);
				driver.switchTo().alert().sendKeys("jyothi");
		//driver.close();
	}

}
