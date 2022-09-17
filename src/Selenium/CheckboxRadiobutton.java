package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxRadiobutton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sreejyothy\\Desktop\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php\r\n");
		driver.manage().window().maximize();
		/*
		 * WebElement checkbox1=driver.findElement(By.id("gridCheck")); boolean
		 * b=checkbox1.isSelected(); System.out.println(b); checkbox1.click(); boolean
		 * b2=checkbox1.isSelected(); System.out.println(b2);
		 */

		WebElement checkboxx1 = driver.findElement(By.id("check-box-one"));
		WebElement checkboxx2 = driver.findElement(By.id("check-box-two"));
		checkboxx1.click();
		boolean b1 = checkboxx1.isSelected();
		System.out.println(b1);
		checkboxx2.click();
		boolean b2 = checkboxx1.isSelected();
		System.out.println(b2);
		WebElement selectallbutton = driver.findElement(By.id("button-two"));
		String backgroundcolour = selectallbutton.getCssValue("background-color");
		System.out.println("Background colour is " + backgroundcolour);

		String fontColor = selectallbutton.getCssValue("color");
		System.out.println("Font colour is " + fontColor);

		String tagnameSelectallbutton = selectallbutton.getTagName();
		System.out.println("The tag name of select all button is " + tagnameSelectallbutton);

		String att_val_seleAll = selectallbutton.getAttribute("class");
		System.out.println("The attribute value of classname is " + att_val_seleAll);
		driver.findElement(By.xpath("//a[@href='radio-button-demo.php']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href='radio-button-demo.php']")).click();
		WebElement radio1 = driver.findElement(By.id("inlineRadio1"));
		radio1.click();
		boolean b3 = radio1.isSelected();
		System.out.println(b3);

		 driver.close();
	}

}
