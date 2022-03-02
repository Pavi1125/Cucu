package com.Test_Runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.BaseClass.BaseClass_Adactin;
import com.Pom.Book_Hotel;
import com.Pom.Booking_confirmation;
import com.Pom.Hotel_continue;
import com.Pom.Login;
import com.Pom.Search_Hotel;
import com.Property_File.Configuration_Helper;
import com.SDP.Adactin_SDP;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\MY PC\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\com\\Test_Runner\\Adactin.feature"},
		         glue= {""})


public class TestRunner_Adactin extends BaseClass_Adactin {

	public static WebDriver driver;
	public static Adactin_SDP as=new Adactin_SDP(driver);
	@BeforeClass
	public static void setup() {
		BaseClass_Adactin.get_Browser("chrome");
	}
	@AfterClass
	public static void teardown() {
		driver.close();

	}
	
	

}

	

