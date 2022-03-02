package com.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Pom.Book_Hotel;
import com.Pom.Booking_confirmation;
import com.Pom.Hotel_continue;
import com.Pom.Login;
import com.Pom.Search_Hotel;

public class Adactin_SDP {
	public WebDriver driver;
	private Book_Hotel bh;
	private Booking_confirmation bc;
	private Hotel_continue hc;
	private Login l;
	private Search_Hotel Sh;

	public Adactin_SDP(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public Book_Hotel getbh() {
		bh = new Book_Hotel(driver);
		return bh;
	}

	public Booking_confirmation getbc() {
		bc = new Booking_confirmation(driver);
		return bc;
	}

	public Hotel_continue gethc() {
		hc = new Hotel_continue(driver);
		return hc;
	}

	public Login getl() {
		l = new Login(driver);
		return l;
	}

	public Search_Hotel getSh() {
		Sh = new Search_Hotel(driver);
		return Sh;
	}

	public WebDriver getdriver() {
		return driver;
	}
}