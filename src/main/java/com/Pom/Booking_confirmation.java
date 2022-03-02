package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_confirmation {
	public WebDriver driver;
	@FindBy(id="my_itinerary")
	private WebElement iter;

	public Booking_confirmation(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getIter() {
		return iter;
	}

}
