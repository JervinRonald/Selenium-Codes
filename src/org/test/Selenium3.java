package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.flipkart.com/");
		String S = d.getCurrentUrl();
		System.out.println(S);
	}
}
