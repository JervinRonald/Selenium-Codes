package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://www.greenstechnologys.com/");
	WebElement dn = d.findElement(By.id("head-wrapper"));
	JavascriptExecutor j=(JavascriptExecutor)d;
	j.executeScript("arguments[0].scrollInfoView(true)",dn);
	}
}
