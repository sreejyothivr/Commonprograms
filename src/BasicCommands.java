import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreejyothy\\Desktop\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html");
		String text=driver.getTitle();
		System.out.println(text);
		String url=driver.getCurrentUrl();
		System.out.println(url);*/
		
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\sreejyothy\\Desktop\\Selenium\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
		WebDriver driver2=new FirefoxDriver();
		driver2.get("https://www.google.com/");
		String appTitle=driver2.getTitle();
		System.out.println(appTitle);*/
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\sreejyothy\\Desktop\\Selenium\\edgedriver_win64 (1)\\msedgedriver.exe");
	    WebDriver driver=new EdgeDriver();
		//driver.get("https://www.google.com/");
	    driver.navigate().to("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4b3e4wrxds_b&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=294102729729&hvpos=&hvnetw=g&hvrand=5081578589522487369&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299102&hvtargid=kwd-311187680635&hydadcr=5841_1914865&gclid=CjwKCAjwt7SWBhAnEiwAx8ZLauGmANfERGeoKKccA2R6LDZLXQ423dbI-M_1UB01_BAkaxchIszMkRoC_ocQAvD_BwE");
		String appTitle2=driver.getTitle();
		System.out.println(appTitle2);
		//driver.close();
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().deleteAllCookies();
		driver.quit();
		
	//input[@id='loginform-username']
		//button[@type='submit']
		
		
		
		}

}
