package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCommentPOM {
	

	public WebDriver driver; 
			
	public CreateCommentPOM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath="//div[@id='post-8161']//a[@class='read-more']")
	@FindBy(xpath="//div[@id='post-8130']//a[contains(text(),'Read More')]")
	private WebElement clkReadMore;
	
	@FindBy(xpath="//a[@class='page larger'][contains(text(),'2')]")
	private WebElement clkPage2;
	
	@FindBy(xpath="//p[contains(text(),'Post published.')]")
	private WebElement pubMsg;
	
	@FindBy(xpath="//li[@id='menu-item-617']//a[contains(text(),'Blog')]")
	private WebElement clkBlog;
	
	//@FindBy(linkText="Blog")
	//private WebElement clkBlog;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/section[1]/div[2]/form[1]/p[2]/textarea[1]")
	private WebElement entComment;
	
	@FindBy(id="submit")
	private WebElement clkPostComment;
	
	@FindBy(id="author")
	private WebElement entAuthor;
	
	@FindBy(id="email")
	private WebElement entEmail;
	
	public void clickBlog() throws InterruptedException {
		System.out.println("Am in Blog");
		Thread.sleep(3000);
		//Actions act = new Actions(driver);
		//act.moveToElement(clkBlog).click().build().perform();
		this.clkBlog.click();
	}
	
	public void clickPage2() throws InterruptedException {
		Thread.sleep(3000);
		//Actions act1 = new Actions(driver);
		//act1.moveToElement(clkPage2).click().build().perform();
		this.clkPage2.click();
	}
	
	public void clickReadMore() throws InterruptedException {
		Thread.sleep(3000);
		this.clkReadMore.click();
	}
	
	public void sendComment(String entComment) {
		this.entComment.clear(); 
		this.entComment.sendKeys(entComment); 
	}
	
	public void sendAuthor(String entAuthor) {
		this.entAuthor.clear(); 
		this.entAuthor.sendKeys(entAuthor); 
	}
	
	public void sendEmail(String entEmail) {
		this.entEmail.clear(); 
		this.entEmail.sendKeys(entEmail); 
	}
	
	
	public void clickPostComment() throws InterruptedException {
		Thread.sleep(3000);
		this.clkPostComment.click();
	}

}
