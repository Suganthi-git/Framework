package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC068LoanDetailPOM {
	private WebDriver driver; 
	
	public TC068LoanDetailPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Plots')]")
	private WebElement MouseOPlot;
	
	@FindBy(xpath="//div[@id='wpmm-megamenu']//a[contains(text(),'Donec quis')]")
	private WebElement clkDonec;
	
	@FindBy(xpath="//input[@id='amount']")
	private WebElement entSalesPrice;
	
	@FindBy(xpath="//input[@id='downpayment']")
	private WebElement entDownPayment;
	
	@FindBy(xpath="//input[@id='years']")
	private WebElement entYears;
	
	@FindBy(xpath="//input[@id='interest']")
	private WebElement entInterest;
	
	@FindBy(xpath="//button[@class='button calc-button']")
	private WebElement clkCalculate;
	
	@FindBy(xpath="//div[@class='notification success']")
	private WebElement notifyMsg;
	
	public void GetMouseoverPlot() {
		Actions act1=new Actions(driver);
		act1.moveToElement(MouseOPlot).build().perform();
		this.clkDonec.click(); 
	}
	
	
	public void sendSalesPrice(String entSalesPrice) {
		this.entSalesPrice.clear();
		this.entSalesPrice.sendKeys(entSalesPrice);
	}
	
	public void sendDownPayment(String entDownPayment) {
		this.entDownPayment.clear(); 
		this.entDownPayment.sendKeys(entDownPayment); 
	}
	
	public void sendYears(String entYears) {
		this.entYears.clear(); 
		this.entYears.sendKeys(entYears); 
	}
	
	public void sendInterest(String entInterest) {
		this.entInterest.clear(); 
		this.entInterest.sendKeys(entInterest); 
	}
	

	public void clickCalculate() {
		this.clkCalculate.click(); 
	}
	
	public void NotificationMessage() {
		System.out.println(this.notifyMsg.getText());
	}
}
