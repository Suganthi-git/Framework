package com.training.sanity.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.pom.AddCatPOM;
import com.training.pom.AddpostPOM;

public class AddNewCategory extends LoginTests {
	public AddCatPOM addCatPOM;
	
	 @BeforeClass
	    public void setupCatgy() {
	    	addCatPOM = new AddCatPOM(driver); 
	    }
	 
		@Test(priority=1)
		public void addNewCategory() throws InterruptedException {
			System.out.println("Am in ADDNEWCATGY class");
			Thread.sleep(30000);
			addCatPOM.clickPosts();
			addCatPOM.clickCatgy();
			addCatPOM.sendCatgyName("ACategory3");
			addCatPOM.sendCatgySlug("ACategory3 slug");
			addCatPOM.sendCatgyDesc("ACat3 Desc is added");
			addCatPOM.clkAddCatgy();
			driver.navigate().refresh();
			screenShot.captureScreenShot("NewCategory");
		
		}


}
