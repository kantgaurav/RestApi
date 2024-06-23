package com.java.Test;

import org.testng.annotations.Test;


public class RunTCMultipleTimes {
	@Test(invocationCount = 3)	
private void test() {

System.out.print("Test method");
	}

}
