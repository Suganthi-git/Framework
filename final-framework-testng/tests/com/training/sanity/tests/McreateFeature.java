package com.training.sanity.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.pom.CreateFeaturePOM;
import com.training.pom.CreatepropertyPOM;

public class McreateFeature extends LoginTests {
	public CreateFeaturePOM createFeaturePOM;
	
	  
    @BeforeClass
    public void setupPublishPost() {
    	createFeaturePOM = new CreateFeaturePOM(driver);
    }
    
	
	@Test(priority=1)
	public void publishNewFeature() throws InterruptedException {
		System.out.println("Am in MCreateFeature class");
	
		createFeaturePOM.clickProperties();
		createFeaturePOM.clickAddNew();
		
		createFeaturePOM.clickAddFeature();
		createFeaturePOM.sendFeature("Test12 Feature");
		createFeaturePOM.selParFeature();
		createFeaturePOM.subAddNewFeature();

		driver.navigate().refresh();
		
		System.out.println("After refresh");
		Thread.sleep(3000);
		createFeaturePOM.chkaddedFeature();
		createFeaturePOM.sendTitle("PropertyLaunches1");
		createFeaturePOM.sendContent("PropertyLaunched CT1");
		createFeaturePOM.clickPublishProperties();
	}
	

}
