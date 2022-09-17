package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTesting {
	
	@DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
		return new Object[][] {{2, 3,5}, {5, 7,8},{10,15,5},{20,22,44}};
}
	
	@Test(dataProvider= "data-provider")
	//@Test(dataProvider="data-provider",dataProviderClass=BasicAnotations.class)
	public void testCase01(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

}
