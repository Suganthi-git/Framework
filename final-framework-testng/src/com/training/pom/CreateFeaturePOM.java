package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateFeaturePOM {

	public WebDriver driver; 
			
	public CreateFeaturePOM(WebDriver driver) {
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
	
	@FindBy(id="property_feature-add-toggle")
	private WebElement addFeature;
	
	@FindBy(id="newproperty_feature")
	private WebElement newFeature;
	
	@FindBy(id="newproperty_feature_parent")
	private WebElement parFeature;
	
	@FindBy(id="property_feature-add-submit")
	private WebElement subAddFeature;
	
	
	@FindBy(id="poststuff")
	private WebElement refreshFeature;
	
	//Creating id for the checkbox item added in run time
	@FindBy(xpath="//li[@id='property_feature-873']/following-sibling::li")
	//@FindBy(id="in-property_feature-798")
	private WebElement chkBoxFeature1;
	
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
		this.addFeature.click();
	}
	
	public void sendFeature(String newFeature) {
		this.newFeature.clear();
		this.newFeature.sendKeys(newFeature);
	}
	
	public void selParFeature() {
		Select selfromFeature = new Select(parFeature);
		selfromFeature.selectByVisibleText("      Bst1");
	}
	
	public void subAddNewFeature() {
		this.subAddFeature.click();
		}
	
	public void refFeature(String tiTle) throws InterruptedException {
		System.out.println("Am in refresh");
		
		this.tiTle.sendKeys(Keys.F5);
		Thread.sleep(3000);
	}
	
	public void chkaddedFeature() {
		Actions act1 = new Actions(driver);
		act1.moveToElement(this.chkBoxFeature1).click().build().perform();
		System.out.println("Check the feature check box");
		//this.chkBoxFeature1.click();
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
