package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatepropertyPOM {
public WebDriver driver; 
	
	public CreatepropertyPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//div[contains(text(),'Properties')]")
	private WebElement clkproperty;
	
	@FindBy(xpath="//p[contains(text(),'Post published.')]")
	private WebElement pubMsg;
	
	@FindBy(linkText="Add New")
	private WebElement clkAddnew;
	
	@FindBy(id="title")
	private WebElement tiTle;
	
	
	@FindBy(id="content")
	private WebElement conTent;
	
	@FindBy(id="in-property_feature-494")
	private WebElement chkBoxFeature1;
	
	@FindBy(id="in-property_feature-690")
	private WebElement chkBoxFeature2;
	
	@FindBy(id="in-region-42")
	private WebElement chkBoxRegion1;
	
	@FindBy(id="in-region-57")
	private WebElement chkBoxRegion2;
	
	@FindBy(id="publish")
	private WebElement clkPublish;
	
	public void clickProperties() {
		this.clkproperty.click();
	}
	
	public void clickAddNew() {
		this.clkAddnew.click(); 
	}
	
	
	public void sendTitle(String tiTle) {
		this.tiTle.clear(); 
		this.tiTle.sendKeys(tiTle); 
	}
	
	public void sendContent(String conTent) {
		this.conTent.clear(); 
		this.conTent.sendKeys(conTent); 
	}
	
	public void clickAddFeature() {
		this.chkBoxFeature1.click(); 
		this.chkBoxFeature2.click();
	}
	
	public void clickAddRegion() {
		this.chkBoxRegion1.click(); 
		this.chkBoxRegion2.click(); 
	}
	
	
    public void clickPublishProperties() throws InterruptedException {
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(clkPublish).click().build().perform();
		
		//this.clkPublish.click();
		try {
			assertEquals(this.pubMsg.getText(),"Post published. View post");
			System.out.println(this.pubMsg.getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
