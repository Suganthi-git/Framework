package com.training.sanity.tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.pom.MPrtytoTrashPOM;

public class MmovetoTrash  extends LoginTests{
	public MPrtytoTrashPOM  moveToTrashPOM;

	
	 @BeforeClass
	    public void setupDelCatgy() {
		 moveToTrashPOM = new MPrtytoTrashPOM(driver); 
	    }
	 
    
		@Test(priority=1)
		public void MoveToTrshProperty() throws InterruptedException {
			System.out.println("Am in Move to Trash Property class");
			//Thread.sleep(30000);
			
			moveToTrashPOM.clickProperties();
			moveToTrashPOM.clickAddNew();
			moveToTrashPOM.sendTitle("Property Launches MT1");
			moveToTrashPOM.sendContent("Property Launches MT2");
			moveToTrashPOM.clickRegion();
			moveToTrashPOM.clickFeature();
			moveToTrashPOM.clickMoveToTrash();
			moveToTrashPOM.handleAlert();
			moveToTrashPOM.verifyUndoMsg();
			moveToTrashPOM.clickTrash();
			
			}

}
