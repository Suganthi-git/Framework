package com.training.sanity.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.pom.AddpostPOM;
import com.training.pom.PubCatPOM;

public class PublishPostTc02 extends LoginTests {
	
    public PubCatPOM pubCatPOM;
	
//AddPostToTrash obj1 = new AddPostToTrash();
    
    @BeforeClass
    public void setupPublishPost() {
    	pubCatPOM = new PubCatPOM(driver); 
    }
    
	//@Test(priority=1,dependsOnMethods= {"validLoginTest"})
	@Test(priority=1)
	public void publishNewPost() throws InterruptedException {
		System.out.println("Am in pubPostTOTrash class");
		Thread.sleep(30000);
		pubCatPOM.clickPosts();
		pubCatPOM.clickAddPosts();
		Thread.sleep(30000);
		pubCatPOM.sendTitle("PostLaunches4");
		pubCatPOM.sendContent("PostLaunched CT4");
		pubCatPOM.clickPublishPost();
	}
	

}
