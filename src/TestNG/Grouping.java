package TestNG;

import org.testng.annotations.Test;

public class Grouping {
  @Test(groups= {"Critical"})
  public void Testcase1() {
	  System.out.println("Test case1");
	  
  }
  @Test(groups= {"Normal"})
  public void Testcase2() {
	  System.out.println("Test case2");
	  
  }
  @Test(groups= {"Critical"})
  public void Testcase3() {
	  System.out.println("Test case3");
	  
  }
  @Test
  public void Testcase4() {
	  System.out.println("Test case4");
	  
  }
  
  
}
