package com.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public WebDriver driver;
	@FindBy(id="username")
	private WebElement Uname;
	@FindBy(id="password")
	private WebElement Pass;
	@FindBy(id="login")
	private WebElement Login;
	public Login(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getUname() {
		return Uname;
	}
	public WebElement getPass() {
		return Pass;
	}
	public WebElement getLogin() {
		return Login;
	}
	
	

}
