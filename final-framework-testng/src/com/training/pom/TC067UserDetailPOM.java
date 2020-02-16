package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC067UserDetailPOM {
private WebDriver driver; 
	
	public TC067UserDetailPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Plots')]")
	private WebElement MouseOPlot;
	
	@FindBy(xpath="//div[@id='wpmm-megamenu']//a[contains(text(),'Donec quis')]")
	private WebElement clkDonec;
	
	@FindBy(xpath="//input[@name='your-name']")
	private WebElement entName;
	
	@FindBy(xpath="//input[@name='your-email']")
	private WebElement entEmail;
	
	@FindBy(xpath="//input[@name='your-subject']")
	private WebElement entSubject;
	
	@FindBy(xpath="//textarea[@name='your-message']")
	private WebElement entMsg;
	
	@FindBy(xpath="//input[@class='wpcf7-form-control wpcf7-submit']")
	private WebElement clkSend;
	
	public void GetMouseoverPlot() {
		Actions act1=new Actions(driver);
		act1.moveToElement(MouseOPlot).build().perform();
		this.clkDonec.click(); 
	}
	
	
	public void sendName(String entName) {
		this.entName.clear();
		this.entName.sendKeys(entName);
	}
	
	
	public void sendEmail(String entEmail) {
		this.entEmail.clear();
		this.entEmail.sendKeys(entEmail);
	}
	
	public void sendSubject(String entSubject) {
		this.entSubject.clear();
		this.entSubject.sendKeys(entSubject);
	}
	
	public void sendMessage(String entMsg) {
		this.entMsg.clear();
		this.entMsg.sendKeys(entMsg);
	}
	
	public void ClickSendbtn() {
		this.clkSend.click();
	}
	
	
}
