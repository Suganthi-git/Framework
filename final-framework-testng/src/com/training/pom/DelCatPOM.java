package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DelCatPOM {
	public WebDriver driver; 
	
	public DelCatPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[contains(text(),'Posts')]")
	private WebElement clkposts;
	
	@FindBy(xpath="//p[contains(text(),'Categories deleted.')]")
	private WebElement delMsg;
	
	@FindBy(linkText="Categories")
	private WebElement catgy;
	
	@FindBy(id="cb-select-786")
	private WebElement chkDelCatgy;
	
	@FindBy(id="bulk-action-selector-top")
	private WebElement SelBlkActn;
	
	@FindBy(id="doaction")
	private WebElement clkApply;
	
	
	public void clickPosts() {
		this.clkposts.click();
	}
	
	
	public void ChecBulkDeleteItm() {
	  
	  Select selfromBulkActn = new Select(this.SelBlkActn); 
	  selfromBulkActn.selectByVisibleText("Delete");	
	  }

	public void clickCatgy() {
		this.catgy.click();
	}
	
	public void clickSelDelCatgy() {
		this.chkDelCatgy.click();
	}
	public void clickApply() {
		this.clkApply.click();
	}
	
	public void verifyDelMsg() {
		System.out.println(this.delMsg.getText());
	}
	

}
