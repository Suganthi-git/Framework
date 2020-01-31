package com.training.sanity.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.pom.AddpostPOM;
import com.training.pom.LoginPOM;

public class AddPostToTrash extends LoginTests {
	
	    public AddpostPOM addPostPOM;
	
//	AddPostToTrash obj1 = new AddPostToTrash();
	    
	    @BeforeClass
	    public void setup() {
	    	addPostPOM = new AddpostPOM(driver); 
	    }
        
		@Test(priority=1)
		public void movePostToTrash() throws InterruptedException {
			System.out.println("Am in ADDPostTOTrash class");
			Thread.sleep(30000);
//			obj1.addPostPOM.clickPosts();
//			obj1.addPostPOM.clickAllPosts();
//			obj1.addPostPOM.mouseHoverPost();
//			obj1.addPostPOM.postUndo();
			addPostPOM.clickPosts();
			addPostPOM.clickAllPosts();
			addPostPOM.mouseHoverPost();
		//	loginPOM.sendPassword("admin@123");
		//	loginPOM.clickLoginBtn(); 
		//	screenShot.captureScreenShot("First");
		}


}
