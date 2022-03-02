package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	public WebDriver driver;
	@FindBy(id="first_name")
	private WebElement fname;
	public Book_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCc() {
		return cc;
	}
	public WebElement getG() {
		return g;
	}
	public WebElement getH() {
		return h;
	}
	public WebElement getI() {
		return i;
	}
	public WebElement getJ() {
		return j;
	}
	public WebElement getBo() {
		return bo;
	}
	@FindBy(id="last_name")
	private WebElement lname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cc;
	@FindBy(id="cc_type")
	private WebElement g;
	@FindBy(id="cc_exp_month")
	private WebElement h;
	@FindBy(id="cc_exp_year")
	private WebElement i;
	@FindBy(id="cc_cvv")
	private WebElement j;
	@FindBy(id="book_now")
	private WebElement bo;

}
