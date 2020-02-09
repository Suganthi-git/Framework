package com.training.sanity.tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.pom.CreateFeaturePOM;
import com.training.pom.CreateRegionPOM;

public class McreateRegion extends LoginTests{
	public CreateRegionPOM createRegionPOM;
	

	  
    @BeforeClass
    public void setupPublishPost() {
    	createRegionPOM = new CreateRegionPOM(driver);
    }
    
	
	@Test(priority=1)
	public void publishNewFeature() throws InterruptedException {
		System.out.println("Am in MCreateRegion class");
	
		createRegionPOM.clickProperties();
		createRegionPOM.clickAddNew();
		
		createRegionPOM.clickAddRegion();
		createRegionPOM.sendRegion("Electronic City");
		createRegionPOM.selParFeature();
		createRegionPOM.subAddNewRegion();
		driver.navigate().refresh();
		
		System.out.println("After refresh");
		Thread.sleep(3000);
		createRegionPOM.chkaddedRegion();
		createRegionPOM.sendTitle("PropertyLaunches RG1");
		createRegionPOM.sendContent("PropertyLaunched RG1");
		createRegionPOM.clickPublishProperties();
	}

}
