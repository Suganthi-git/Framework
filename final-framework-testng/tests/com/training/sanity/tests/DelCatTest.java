package com.training.sanity.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.pom.AddCatPOM;
import com.training.pom.DelCatPOM;

public class DelCatTest extends LoginTests {
	
	public DelCatPOM delCatPOM;
	
	 @BeforeClass
	    public void setupDelCatgy() {
		 delCatPOM = new DelCatPOM(driver); 
	    }
	 
		@Test(priority=1)
		public void DeleteNewCategory() throws InterruptedException {
			System.out.println("Am in DelCATGY class");
			Thread.sleep(30000);
			delCatPOM.clickPosts();
			delCatPOM.clickCatgy();
			delCatPOM.clickSelDelCatgy();
			delCatPOM.ChecBulkDeleteItm();
			delCatPOM.clickApply();
			delCatPOM.verifyDelMsg();
		}
}
