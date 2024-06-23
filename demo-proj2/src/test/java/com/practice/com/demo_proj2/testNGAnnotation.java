package com.practice.com.demo_proj2;

import org.testng.annotations.Test;

public class testNGAnnotation {
	
	@Test(priority = 1)
    public void searchTest() {
        System.out.println("Search is Started");
    }

    @Test(priority = 2)
    public void addtoCartTest() {
           System.out.println("Added to Cart");
    }
    
    @Test(priority = 3)
    public void checkOutTest() {
         System.out.println("CheckOut is done");
    }
    
    @Test(priority = 4)
    public void paymentTest() {
        System.out.println("Payment is DONE");
    }

    @Test
    public void orderTest() {
        System.out.println("Order is Placed");
    }


	
	

}
