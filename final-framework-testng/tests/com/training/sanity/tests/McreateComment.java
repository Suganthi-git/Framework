package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.CreateCommentPOM;
import com.training.pom.LogCommentPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class McreateComment {
	public CreateCommentPOM createCommentPOM;
	public WebDriver driver;
	public LogCommentPOM logCommentPOM;
	public String baseUrl;
	//public AddpostPOM addPostPOM;
	public static Properties properties;
	public ScreenShot screenShot;
	
	  
    @BeforeTest
    public void setupPublishComment() throws IOException {
    	properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		createCommentPOM = new CreateCommentPOM(driver);
		baseUrl = properties.getProperty("base1URL");
		screenShot = new ScreenShot(driver);  
		driver.get(baseUrl);
    }
	
	 @AfterTest
	public void tearDown() throws Exception {
	//	Thread.sleep(1000);
	// 	driver.quit();
	}
	
	@Test(priority=0)
	public void publishNewComment() throws InterruptedException {
		System.out.println("Hello");
		createCommentPOM.clickBlog();
		System.out.println("Hello1");
		createCommentPOM.clickPage2();
		System.out.println("Hello2");
		createCommentPOM.clickReadMore();
		System.out.println("Hello3");
		createCommentPOM.sendComment("good comments");
		createCommentPOM.sendAuthor("Suganthi");
		createCommentPOM.sendEmail("Suganthi123@gmail.com");
		createCommentPOM.clickPostComment();
	
	}
	
	@BeforeMethod
    public void setupAdminLogin() throws IOException {
    	properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		logCommentPOM = new LogCommentPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);  
		driver.get(baseUrl);
    }
	
	@Test(priority=1,dependsOnMethods= {"publishNewComment"})
	public void loginadmin() {
		logCommentPOM.sendUserName("admin");
		logCommentPOM.sendPassword("admin@123");
		logCommentPOM.clickLoginBtn();
		logCommentPOM.clickComment();
		logCommentPOM.MouseOverComment();
		logCommentPOM.sendReplyComment("Replied");
		logCommentPOM.clickReplyButton();
	}

}
