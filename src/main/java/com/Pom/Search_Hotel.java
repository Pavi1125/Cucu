package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public WebDriver driver;
	@FindBy(id="location")
	private WebElement a;
	
	public Search_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getA() {
		return a;
	}
	public WebElement getB() {
		return b;
	}
	public WebElement getC() {
		return c;
	}
	public WebElement getD() {
		return d;
	}
	public WebElement getE() {
		return e;
	}
	public WebElement getF() {
		return f;
	}
	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(id="hotels")
	private WebElement b;
	@FindBy(id="room_type")
	private WebElement c;
	@FindBy(id="room_nos")
	private WebElement d;
	@FindBy(id="adult_room")
	private WebElement e;
	@FindBy(id="child_room")
	private WebElement f;
	@FindBy(id="Submit")
	private WebElement submit;
	

}
