package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PubCatPOM {
private WebDriver driver; 
	
	public PubCatPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(text(),'Posts')]")
	private WebElement cposts;
	
	@FindBy(xpath="//p[contains(text(),'Post published.')]")
	private WebElement pubMsg;
	
	@FindBy(id="title")
	private WebElement addTitle; 
	
	@FindBy(id="content")
	private WebElement addContent; 
	
	
	@FindBy(linkText="Add New")
	private WebElement addPost;
	
	@FindBy(id="publish")
	private WebElement publish; 
	
	public void clickPosts() {
		this.cposts.click();
	}
	
	public void clickAddPosts() {
		this.addPost.click(); 
	}
	
	
	public void sendTitle(String addTitle) {
		this.addTitle.clear(); 
		this.addTitle.sendKeys(addTitle); 
	}
	
	public void sendContent(String addContent) {
		this.addContent.clear(); 
		this.addContent.sendKeys(addContent); 
	}
	
    public void clickPublishPost() {
		
		this.publish.click();
		try {
			assertEquals(this.pubMsg.getText(),"Post published. View post");
			System.out.println(this.pubMsg.getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
