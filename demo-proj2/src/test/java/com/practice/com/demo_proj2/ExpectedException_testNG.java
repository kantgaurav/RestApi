package com.practice.com.demo_proj2;

import org.testng.annotations.Test;

public class ExpectedException_testNG {
	
	@Test(description = "Adding to Cart", priority= 1, expectedExceptions = ArithmeticException.class)
	public void addToCart() {
	
		System.out.println("Adding to cART ");
		
		int i= 1/0;
		
		
	}

}
