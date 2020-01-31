package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddpostPOM {
	private WebDriver driver; 
	
	public AddpostPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(text(),'Posts')]")
	private WebElement cposts;
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/div[3]")
	
	
	@FindBy(xpath="//p[contains(text(),'Post published.')]")
	private WebElement pubMsg;
	
	@FindBy(xpath="//tr[@id='post-7910']")
	private WebElement postRow1;
	
	@FindBy(linkText="Add New")
	private WebElement addPost;
	
	@FindBy(linkText="All Posts")
	private WebElement allPost;
	
	@FindBy(linkText="Trash")
	private WebElement trash;
	
	@FindBy(xpath="//*[contains(text(),'1 post moved to the Trash')]")
	private WebElement undoMsg;
	
	

	
	@FindBy(id="in-category-735")
	private WebElement aaLaunch; 
	
	@FindBy(id="in-category-710")
	private WebElement aReva;
	
	@FindBy(id="new-tag-post_tag")
	private WebElement tagPost;
	
	public void clickPosts() {
		this.cposts.click();
	}
	
	public void clickAllPosts() {
		this.allPost.click(); 
	}
	

	public void checkaaLaunch() {
		this.aaLaunch.click(); 
	}

	public void checkaReva() {
		this.aReva.click(); 
	}
	

	public void mouseHoverPost() {
		Actions act = new Actions(driver);
		act.moveToElement(postRow1).build().perform();
		this.trash.click();
		try {
			assertEquals(this.undoMsg.getText(),"1 post moved to the Trash. Undo");
			System.out.println(this.undoMsg.getText());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
