package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_continue {
	public WebDriver driver;
	@FindBy(id="radiobutton_0")
	private WebElement u;
	public Hotel_continue(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getU() {
		return u;
	}
	public WebElement getR() {
		return r;
	}
	@FindBy(id="continue")
	private WebElement r;
	

}
