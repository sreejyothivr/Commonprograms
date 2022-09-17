import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HtmlTable {
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\sreejyothy\\Desktop\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/table-pagination.php\r\n");
	driver.manage().window().maximize();
	//table[@id='dtBasicExample']//tbody//tr[5]//td[2]
	
	
	List<WebElement> list_elements=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[3]"));
	
	for(int i=0;i<list_elements.size();i++)
	{
		System.out.println(list_elements.get(i).getText());
	}
	


}}
