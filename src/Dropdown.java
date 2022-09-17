import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generatSystem.setProperty("webdriver.chrome.driver",
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sreejyothy\\Desktop\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php\r\n");
		driver.manage().window().maximize();
		WebElement dropdown_menu = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		dropdown_menu.click();
		Select s = new Select(dropdown_menu);
//	s.selectByVisibleText("Yellow");
		WebElement firstelement = s.getFirstSelectedOption();
		String first_ele = firstelement.getText();
		System.out.println(first_ele);
//	s.selectByIndex(3);
		s.selectByValue("Red");

		WebElement dropdown_2 = driver.findElement(By.id("multi-select-field"));
		Select j = new Select(dropdown_2);
		j.selectByIndex(1);
		j.selectByIndex(2);

		List<WebElement> a = j.getAllSelectedOptions();

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i).getText());
		}
		
		

	}
}
