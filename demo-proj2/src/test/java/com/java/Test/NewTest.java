package com.java.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void first() {
	 System.out.println("1st Test case"); 
  }
  
  @Test
  public void second() {
	 System.out.println(" Second Test case"); 
  }
  
  @BeforeMethod
  public void beforeMethod() {
	 
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("Before CLASS");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("after CLASS");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Before TESTT");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After TESTT");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("Before Suite START");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("after Suite START");
  }

}
