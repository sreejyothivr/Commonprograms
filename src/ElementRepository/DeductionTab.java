package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeductionTab {
	WebDriver driver;

	public DeductionTab(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//a[@href='/payrollapp/deduction/index']")
	WebElement deductiontab;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']//tbody//tr[20]//td[7]//a[@aria-label='View']")
	WebElement eyeicon;

	

	public void select_deductiontab() {
		deductiontab.click();
	
	}
	
	public String eyeicon_Title_Validation()
	{
		return eyeicon.getAttribute("title");
	}
	
}
