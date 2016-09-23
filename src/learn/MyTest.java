package learn;

import org.testng.annotations.Test;

import solutions.*;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class MyTest {
  @Test
  public void f() {
	  int[] input = new int[]{1,3,4,58,9,11};	  
	  boolean res = false;
	  Solution255 s = new Solution255();
	  Assert.assertEquals(s.verifyPreorder(input), res);
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
