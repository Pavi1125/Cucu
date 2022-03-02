package com.BaseClass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass_Adactin {
	// WebDriver Methods
		// Browser launch
		public static WebDriver driver;
		public static WebDriver get_Browser(String type) {
			if (type.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Driver updated\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (type.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//driver//geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (type.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "//driver//edgedriver.exe");
				driver = new EdgeDriver();
			}
			// maximize
			driver.manage().window().maximize();
			return driver;
		}
		// get url
		public static void getUrl(String url) {
			driver.get(url);
		}
		// get title
		public static void getTitle(String title) {
			String t = driver.getTitle();
			System.out.println("Title: " + t);
		}
		// get Current url
		public static void getCurrentUrl(String c) {
			String c1 = driver.getCurrentUrl();
			System.out.println("Current Url" + c1);
		}
		// close
		public static void close() {
			driver.close();
		}
		// quit
		public static void quit() {
			driver.quit();
		}
		// navigation methods
		// to
		public static void navigate(String type, String url) {
			if (type.equalsIgnoreCase("to")) {
				driver.navigate().to(url);
			} else if (type.equalsIgnoreCase("back")) {
				driver.navigate().back();
			} else if (type.equalsIgnoreCase("forward")) {
				driver.navigate().back();
			} else if (type.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			}
		}
		// Webelement methods
		// click
		public static void click(WebElement element) {
			element.click();
		}
		// sendKeys
		public static void input(WebElement element, String value) {
			element.sendKeys(value);
		}
		// clear
		public static void clear(WebElement element) {
			element.clear();
		}
		// getText
		public static void getText(WebElement element) {
			String t = element.getText();
			System.out.println(t);
		}
		// get attribute value
		public static void aValue(WebElement element) {
			String a = element.getAttribute("Value");
			System.out.println(a);
		}
		// get attribute placeholder
		public static void aPlaceholder(WebElement element) {
			String a = element.getAttribute("Placeholder");
			System.out.println(a);
		}
		// isDisplayed
		public static void Displayed(WebElement element) {
			boolean d = element.isDisplayed();
			System.out.println("Displayed" + d);
		}
		// isEnabled
		public static void Enabled(WebElement element) {
			boolean e = element.isEnabled();
			System.out.println("Enabled" + e);
		}
		// isSelected
		public static void Selected(WebElement element) {
			boolean s = element.isSelected();
			System.out.println("Selected" + s);
		}
		// Selenium concepts
		// dropdown
		public static void dropdown(String type, WebElement element,String value) {
			Select s = new Select(element);
			// is Multiple
			if (type.equalsIgnoreCase("isMultiple")) {
				boolean m = s.isMultiple();
				System.out.println("Multiple dropdown: " + m);
			}
			// get first selected option
			else if (type.equalsIgnoreCase("FirstSelectedOption")) {
				WebElement f = s.getFirstSelectedOption();
				System.out.println("First selected option: " + f.getText());
			}
			// get all selected option
			else if (type.equalsIgnoreCase("AllSelectedOption")) {
				List<WebElement> a = s.getAllSelectedOptions();
				for (int i = 0; i < a.size(); i++) {
					System.out.println("All selected Options: " + a.get(i).getText());
				}
			}
			// to select all the options at one shot
			else	if (type.equalsIgnoreCase("SelectAll")) {
				List<WebElement> o = s.getOptions();
				for (int i = 0; i <= o.size(); i++) {
					s.selectByIndex(i);
				}
			}
			// getoptions
			if (type.equalsIgnoreCase("getOptions")) {
				List<WebElement> g = s.getOptions();
				for (WebElement w : g) {
					System.out.println("Options in dropdown: " + w.getText());
				}
			}
			// select
			if (type.equalsIgnoreCase("index")) {
				int index1 = Integer.parseInt(value);
				s.selectByIndex(index1);
			} else if (type.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			} else if (type.equalsIgnoreCase("text")) {
				s.selectByVisibleText(value);
			}
		}
		// java script executor
		// up
		public static void scroll_up() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-200)");
		}
		// down
		public static void scroll_down() {
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,200)");
		}
		// scroll into particular element
		public static void scroll(WebElement element) {
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("arguments[0].scrollIntoView();", element);
		}
		// take screenshot
		public static void takeScreenshot(String path) throws Throwable {
			TakesScreenshot ts = (TakesScreenshot) driver;// narrowing
			File Source = ts.getScreenshotAs(OutputType.FILE);// used to capture screenshot
			File Destination = new File(path);
//			FileUtils.copyFile(Source, Destination);
		}
		// actions
		public static void actions(String actionName, WebElement element, WebElement Source, WebElement Target) {
			Actions a = new Actions(driver);
			if (actionName.equalsIgnoreCase("moveto")) {
				a.moveToElement(element).build().perform();
			} else if (actionName.equalsIgnoreCase("clickon")) {
				a.click(element).build().perform();
			} else if (actionName.equalsIgnoreCase("rightClick")) {
				a.contextClick(element).build().perform();
			} else if (actionName.equalsIgnoreCase("doubleClick")) {
				a.doubleClick(element).build().perform();
			} else if (actionName.equalsIgnoreCase("dragAndDrop")) {
				a.dragAndDrop(Source, Target).build().perform();
			} else if (actionName.equalsIgnoreCase("clickAndHold")) {
				a.clickAndHold(Source).build().perform();
//			}else if (actionName.equalsIgnoreCase("moveAndDrop")) {
//				a.moveAndDrop(Target).build().perform();
			}
		}
		// robot
		public static void robot(String action) throws Throwable {
			Robot r = new Robot();
			if (action.equalsIgnoreCase("pressDown")) {
				r.keyPress(KeyEvent.VK_DOWN);
			} else if (action.equalsIgnoreCase("releaseDown")) {
				r.keyRelease(KeyEvent.VK_DOWN);
			} else if (action.equalsIgnoreCase("pressEnter")) {
				r.keyPress(KeyEvent.VK_ENTER);
			} else if (action.equalsIgnoreCase("releaseEnter")) {
				r.keyRelease(KeyEvent.VK_ENTER);
			} else if (action.equalsIgnoreCase("pressup")) {
				r.keyPress(KeyEvent.VK_UP);
			} else if (action.equalsIgnoreCase("releaseup")) {
				r.keyRelease(KeyEvent.VK_UP);
			}
		}
		// wait
		// implicit
		public static void implicitWait(int seconds, TimeUnit format) {
			driver.manage().timeouts().implicitlyWait(seconds,format);
		}
		// explicit
		public static void explicitWait(int seconds, WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, seconds);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		// fluent
		public static void fluentWait(int seconds, int Pollingseconds, TimeUnit format) {
			Wait wait = new FluentWait(driver).withTimeout(30, format).pollingEvery(10, format);
		}
	//Thread.sleep
		public static void sleep(int seconds) throws Throwable {
			Thread.sleep(seconds);
		}
		// window handling
		public static void windowHandling(String type) {
			if (type.equalsIgnoreCase("getWindowHandle")) {
				String current_ID = driver.getWindowHandle();
				System.out.println("Window Handle" + current_ID);
			} else if (type.equalsIgnoreCase("getWindowHandles")) {
				Set<String> All_ID = driver.getWindowHandles();
				System.out.println("Window Handles" + All_ID);
			}
		}
		// frames
		public static void frames(String type, WebElement element, WebElement First_Frame, WebElement Second_Frame) {
			if (type.equalsIgnoreCase("toFrame")) {
				driver.switchTo().frame(element);
			} else if (type.equalsIgnoreCase("backfromframe")) {
				driver.switchTo().defaultContent();
			} else if (type.equalsIgnoreCase("toFirst")) {
				driver.switchTo().frame(First_Frame);
			} else if (type.equalsIgnoreCase("toSecond")) {
				driver.switchTo().frame(Second_Frame);
			}

		}
	}
	
