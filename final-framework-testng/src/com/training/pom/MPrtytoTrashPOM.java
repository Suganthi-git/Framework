package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MPrtytoTrashPOM {
	

public WebDriver driver; 
	
	public MPrtytoTrashPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[contains(text(),'Properties')]")
	private WebElement clkproperty;
	
	@FindBy(xpath="//p[contains(text(),'1 post moved to the Trash.')]")
	private WebElement undoMsg;
	
	@FindBy(xpath="//strong[contains(text(),'Property Launches MT1')]")
	private WebElement trashMsg;
	
	@FindBy(linkText="Add New")
	private WebElement clkAddnew;
	
	@FindBy(linkText="Move to Trash")
	private WebElement clkMoveTrash;
	
	@FindBy(xpath="//a[contains(text(),'Trash ')]")
	private WebElement clkTrash;
	
	@FindBy(id="title")
	private WebElement tiTle;
	
	@FindBy(id="content")
	private WebElement conTent;
	
	@FindBy(xpath="//label[contains(text(),' Central Bangalore')]")
	private WebElement chkRegion;
	
	@FindBy(xpath="//label[contains(text(),' New Launches')]")
	private WebElement chkFeature;
	
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
	
	public void clickFeature() {
		this.chkFeature.click();
	}
	
	public void clickRegion() {
		this.chkRegion.click();
	}
	
	public void clickMoveToTrash() {
		this.clkMoveTrash.click();
	}
	
	public void handleAlert() {
		   Alert prompt = driver.switchTo().alert();
		   prompt.accept();
	}
	
	public void verifyUndoMsg() {
		System.out.println(this.undoMsg.getText());
	}
	
	public void clickTrash() {
		//this.clkTrash.click();
		
		Actions act = new Actions(driver);
		act.moveToElement(clkTrash).click().build().perform();
		try {
			assertEquals(this.trashMsg.getText(),"Property Launches MT1");
			System.out.println("Found successfully in Trash");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
}
