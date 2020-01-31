package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTagPOM {
	public WebDriver driver; 
	
	public AddTagPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[contains(text(),'Posts')]")
	private WebElement clkposts;
	
	@FindBy(linkText="Tags")
	private WebElement cTag;
	
	@FindBy(id="tag-name")
	private WebElement tname;
	
	@FindBy(id="tag-slug")
	private WebElement tslug;
	
	@FindBy(id="tag-description")
	private WebElement tdsc;
	
	@FindBy(id="submit")
	private WebElement clkAddTag;
	
	public void clickPosts() {
		this.clkposts.click();
	}
	
	public void clickTags() {
		this.cTag.click();
	}
	
	

	public void sendTagName(String tname) {
		this.tname.clear();
		this.tname.sendKeys(tname);
	}
	
	public void sendTagSlug(String tslug) {
		this.tslug.clear();
		this.tslug.sendKeys(tslug);
	}
	
	public void sendTagDesc(String tdsc) {
		this.tdsc.clear();
		this.tdsc.sendKeys(tdsc);
	}
	

	public void clkAddTag() {
		this.clkAddTag.click();
		
	}	
	

}
