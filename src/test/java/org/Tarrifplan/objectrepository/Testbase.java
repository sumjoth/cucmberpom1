package org.Tarrifplan.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
	static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\\\\\\\\\\\\\\\Selenium\\\\\\\\\\\\\\\\Company\\\\\\\\\\\\\\\\driver\\\\\\\\\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void custom(WebElement element) {
		element.click();
	}

	public static void type(WebElement element, String fname) {
		element.sendKeys(fname);
	}

	public static void type1(WebElement element, String lname) {
		element.sendKeys(lname);
	}

	public static void type2(WebElement element, String email) {
		element.sendKeys(email);
	}

	public static void type5(WebElement element) {
		element.click();
	}

	/*
	 * public static void quitBrowser() { driver.quit(); driver.close(); }
	 */

}
