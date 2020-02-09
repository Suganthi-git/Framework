package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogCommentPOM {
private WebDriver driver; 
	
	public LogCommentPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_login")
	private WebElement userName; 
	
	@FindBy(id="user_pass")
	private WebElement password;
	
	
	@FindBy(name="login")
	private WebElement loginBtn;
	
	@FindBy(xpath="//div[contains(text(),'Comments')]")
	private WebElement clkComments;
	
	@FindBy(xpath="//table//tr[@id='comment-2123']")
	private WebElement mouseOComment;

	
	@FindBy(xpath="//tr[@id='comment-2123']//a[@class='vim-r comment-inline'][contains(text(),'Reply')]")
	private WebElement clkReply;
	
	@FindBy(xpath="//textarea[@id='replycontent']")
	private WebElement entText;
	
	@FindBy(xpath="//span[@id='replybtn']")
	private WebElement clkReplyBtn;
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}	
	
	public void clickComment() {
		this.clkComments.click(); 
	}	
	
	public void MouseOverComment() {
		Actions act = new Actions(driver);
		act.moveToElement(mouseOComment).build().perform();
		this.clkReply.click(); 
	}	
	
	public void sendReplyComment(String entText) {
		this.entText.clear();
		this.entText.sendKeys(entText);
	}
	
	public void clickReplyButton() {
		this.clkReplyBtn.click(); 
	}	


}
