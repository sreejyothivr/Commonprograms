package Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ElementRepository.ClientPage;
import ElementRepository.DeductionTab;
import ElementRepository.LoginPage;
import ElementRepository.WorkersPage;

public class Assignmenttestcase {
	
	private static final String String = null;

	LoginPage lp;
	
		WebDriver driver;
		@Test(priority=2)
		public void clientTabButtoncolorValidation()
		{

			lp=new LoginPage(driver);
			lp.performLogin();
//		lp.getusername(name);
//		lp.getpassword(pswdd);
		lp.clickloginButton();	
			ClientPage cp=new ClientPage(driver);
		cp.selectclienttab();
		String actual_search_btn_color=cp.searchButtonColor();
		String expected_search_btn_color="rgba(51, 122, 183, 1)";
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actual_search_btn_color,expected_search_btn_color);
		soft.assertAll();
		}
		
		@Test(priority=3)
		public void deductiontabtitleValidation()
		{

			lp=new LoginPage(driver);
			lp.performLogin();
		lp.clickloginButton();	
			DeductionTab dt=new DeductionTab(driver);
			dt.select_deductiontab();
			String title_actual=dt.eyeicon_Title_Validation();
			 String title_expected="View";
			 Assert.assertEquals(title_actual, title_expected,":The title is not like as we expected");
		}
		
		
		@Test(priority=1)
		
		public void workerspageStringValidation()
		{ 
			lp=new LoginPage(driver);
			lp.performLogin();
		lp.clickloginButton();	
			WorkersPage wp=new WorkersPage(driver);
			wp.workerspagetab();
			String actualsearch=	wp.searchbuttondisplay();
			String actualreset=wp.resetbuttondisplay();
			String expectedreset="Search";
			String Expectedreset="Reset";
			Assert.assertEquals(actualsearch,expectedreset ,"Strings of search is not as per requirement");
			Assert.assertEquals(actualreset,Expectedreset,"String reset is not as per the requirement");
					
		}
				
		@BeforeMethod
		public void beforemethod() 
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sreejyothy\\Desktop\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.qabible.in/payrollapp/site/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			

		}
		
		@AfterMethod 
		public void aftermethod()
		  { 
			driver.close();
		  }

		
	}



