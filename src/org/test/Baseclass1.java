package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass1 {
	static WebDriver d;
	public static void BrowserLaunch(String URL) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Laptop\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		d= new ChromeDriver();
		d.get(URL);
	}
	public static void Click(WebElement W) {
		W.click();
	}
	public static void Type(WebElement W, String ST) {
		W.sendKeys(ST);
	}
}
