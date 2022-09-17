import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sreejyothy\\Desktop\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.xpath("//li[@data-id='5']//a[@class='button button-orange']"));
	WebElement target=driver.findElement(By.xpath("//div[@class='ui-widget-content']//ol[@class='field14 ui-droppable ui-sortable']"));
	Actions a= new Actions(driver);
	a.dragAndDrop(source, target).perform();
	WebElement source2=driver.findElement(By.xpath("//li[@class='block15 ui-draggable']//a[@class='button button-orange']"));
	WebElement target2=driver.findElement(By.xpath("//ol[@id='loan']"));
	a.dragAndDrop(source2, target2).perform();
}}
