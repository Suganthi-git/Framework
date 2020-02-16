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
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.TC068LoanDetailPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC068LoanDetails {
	private WebDriver driver;
	private String baseUrl;
	private TC068LoanDetailPOM loanDetailPOM;
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
		loanDetailPOM = new TC068LoanDetailPOM(driver);
		baseUrl = properties.getProperty("base1URL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test(dataProvider = "excel-inputs", dataProviderClass = LoanDataProviders.class)
	public void loanDetailsTest(String entSalesPrice, String entDownPayment,String entYears,String entInterest ) {
		loanDetailPOM.GetMouseoverPlot();
		loanDetailPOM.sendSalesPrice(entSalesPrice);
		loanDetailPOM.sendDownPayment(entDownPayment);
		loanDetailPOM.sendYears(entYears);
		loanDetailPOM.sendInterest(entInterest);
		loanDetailPOM.clickCalculate();
		loanDetailPOM.NotificationMessage();
	
		//screenShot.captureScreenShot(userName);

	}
}
