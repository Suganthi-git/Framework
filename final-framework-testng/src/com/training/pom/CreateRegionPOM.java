package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateRegionPOM {
public WebDriver driver; 
	
	public CreateRegionPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(text(),'Properties')]")
	private WebElement clkproperty;
	
	@FindBy(xpath="//p[contains(text(),'Post published.')]")
	private WebElement pubMsg;
	
	@FindBy(linkText="Add New")
	private WebElement clkAddnew;
	
	@FindBy(id="region-add-toggle")
	private WebElement clkAddNewRgn;
	
	@FindBy(id="region-add-submit")
	private WebElement clkAddNewRgnBtn;
	
	@FindBy(id="newregion")
	private WebElement entNewRegion;
	
	@FindBy(id="newregion_parent")
	private WebElement parRgn;
	
	@FindBy(id="region-add-submit")
	private WebElement subAddRgn;
	
	@FindBy(id="title")
	private WebElement tiTle;
	
	@FindBy(id="content")
	private WebElement conTent;
	
	@FindBy(id="publish")
	private WebElement clkPublish;
	
	//Creating id for the checkbox item added in run time
	//@FindBy(xpath="//li[@id='region-745']/preceding-sibling::li")
	//@FindBy(id="in-property_feature-798")
	@FindBy(xpath="//label[contains(text(),'Electronic City')]")
	private WebElement chkBoxRgn1;
	
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
	
	
	public void clickAddRegion() {
		this.clkAddNewRgn.click();
	}
	
	public void sendRegion(String entNewRegion) {
		this.entNewRegion.clear();
		this.entNewRegion.sendKeys(entNewRegion);
	}
	
	public void selParFeature() {
		Select selfromRgn = new Select(parRgn);
		selfromRgn.selectByValue("61");
		//selfromRgn.selectByVisibleText(" West Bangalore");
	}
	
	
	public void chkaddedRegion() {
		Actions act1 = new Actions(driver);
		act1.moveToElement(this.chkBoxRgn1).click().build().perform();
		System.out.println("Check the Region check box");
	
	}
	
	public void subAddNewRegion() {
		this.subAddRgn.click();
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
