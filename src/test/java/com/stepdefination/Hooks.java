package com.stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public static WebDriver driver;

	@Before
	public void method() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\\\\\\\Selenium\\\\\\\\Company\\\\\\\\driver\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.get("http://demo.guru99.com/telecom/");
		System.out.println("Before");

	}

	@After
	public void method1() {
		System.out.println("After");
		// driver.close();
		// driver.quit();
	}

}
