package TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityInTestNG {
  @Test(priority = 0)
  public void A() {
	  System.out.println("This is from A");
  }
  @Test(priority = 0) //skip 
  public void B() {
	  
	  throw new SkipException("No need to Run");
	  //System.out.println("This is from B");
  }
  @Test(priority ='a')
  public void first() {
	  System.out.println("This is from first");
  }
  @Test(priority = 4)
  public void D() {
	  System.out.println("This is from D");
  }
  @Test(priority ='A')
  public void E() {
	  System.out.println("This is from E");
  }
}
