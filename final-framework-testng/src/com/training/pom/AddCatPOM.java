package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCatPOM {
	public WebDriver driver; 
	
	public AddCatPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[contains(text(),'Posts')]")
	private WebElement clkposts;
	
	@FindBy(linkText="Categories")
	private WebElement catgy;
	
	@FindBy(id="tag-name")
	private WebElement tname;
	
	@FindBy(id="tag-slug")
	private WebElement tslug;
	
	@FindBy(id="tag-description")
	private WebElement tdsc;
	
	@FindBy(id="submit")
	private WebElement clkAddCatgy;
	
	public void clickPosts() {
		this.clkposts.click();
	}
	
	public void clickCatgy() {
		this.catgy.click();
	}
	
	

	public void sendCatgyName(String tname) {
		this.tname.clear();
		this.tname.sendKeys(tname);
	}
	
	public void sendCatgySlug(String tslug) {
		this.tslug.clear();
		this.tslug.sendKeys(tslug);
	}
	
	public void sendCatgyDesc(String tdsc) {
		this.tdsc.clear();
		this.tdsc.sendKeys(tdsc);
	}
	

	public void clkAddCatgy() {
		this.clkAddCatgy.click();
		
	}	
	
}
