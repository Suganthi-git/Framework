package com.training.sanity.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.pom.CreatepropertyPOM;


public class McreateProperty extends LoginTests {
	  public CreatepropertyPOM createpropertyPOM;

	    
	    @BeforeClass
	    public void setupPublishPost() {
	    	createpropertyPOM = new CreatepropertyPOM(driver);
	    }
	    
		//@Test(priority=1,dependsOnMethods= {"validLoginTest"})
		@Test(priority=1)
		public void publishNewPost() throws InterruptedException {
			System.out.println("Am in MCreateProperty class");
			//Thread.sleep(30000);
			createpropertyPOM.clickProperties();
			createpropertyPOM.clickAddNew();
			//Thread.sleep(30000);
			createpropertyPOM.sendTitle("PropertyLaunches1");
			createpropertyPOM.sendContent("PropertyLaunched CT1");
			createpropertyPOM.clickAddFeature();
			createpropertyPOM.clickAddRegion();
			//Thread.sleep(3000);
			createpropertyPOM.clickPublishProperties();
		}
		

}
