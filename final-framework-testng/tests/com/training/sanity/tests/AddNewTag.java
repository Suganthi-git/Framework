package com.training.sanity.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.pom.AddCatPOM;
import com.training.pom.AddTagPOM;

public class AddNewTag extends LoginTests{
	public AddTagPOM addTagPOM;
	
	 @BeforeClass
	    public void setupTag() {
	    	addTagPOM = new AddTagPOM(driver); 
	    }
	 
		@Test(priority=1)
		public void addNewCategory() throws InterruptedException {
			System.out.println("Am in ADDNEWCATGY class");
			Thread.sleep(30000);
			addTagPOM.clickPosts();
			addTagPOM.clickTags();
			addTagPOM.sendTagName("ATag2");
			addTagPOM.sendTagSlug("ATag2 slug");
			addTagPOM.sendTagDesc("ATag Desc is added");
			addTagPOM.clkAddTag();
			driver.navigate().refresh();
			screenShot.captureScreenShot("NewTag");
		
		}


}
