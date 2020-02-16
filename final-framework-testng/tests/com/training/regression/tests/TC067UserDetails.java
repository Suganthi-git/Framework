package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoanDataProviders;
import com.training.dataproviders.UserDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.TC067UserDetailPOM;
import com.training.pom.TC068LoanDetailPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC067UserDetails {
	private WebDriver driver;
	private String baseUrl;
	private TC067UserDetailPOM userDetailPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		userDetailPOM = new TC067UserDetailPOM(driver);
		baseUrl = properties.getProperty("base1URL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test(dataProvider = "db-inputs", dataProviderClass = UserDataProviders.class)
	public void UserDetailsTest(String userEName, String userEmail,String userSubject,String userMsg ) {
		userDetailPOM.GetMouseoverPlot();
		userDetailPOM.sendName(userEName);
		userDetailPOM.sendEmail(userEmail);
		userDetailPOM.sendSubject(userSubject);
		userDetailPOM.sendMessage(userMsg);
		userDetailPOM.ClickSendbtn();
		//screenShot.captureScreenShot(userName);
	}

}
