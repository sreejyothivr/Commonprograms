package TestNG;

import org.testng.annotations.Test;


//pgm 1
public class BasicsCommands {
	
  @Test(priority=2)
  public void testCase01() {
	  System.out.println("Testcase 1 eexecuted");
	  
  } 

  @Test(priority=1)
  public void testCase02() {
	  System.out.println("Testcase 2 eexecuted");
  }
  
  @Test
  public void testCase03() {
	  System.out.println("Testcase 3 eexecuted");
  }
  
  @Test
  public void testCase04() {
	  System.out.println("Testcase 4 eexecuted");
  }
  
  
}
