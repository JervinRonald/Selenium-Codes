package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.zoho.com/sites/login.html");
		d.manage().window().maximize();
		WebElement W = d.findElement(By.className("zlogin-apps"));
		W.click();
		WebElement W1 = d.findElement(By.name("lid"));
		W1.sendKeys("Jervin");
		d.findElement(By.name("pwd")).sendKeys("Jervin123");
		WebElement W2 = d.findElement(By.id("signin_submit"));
		W2.click();
}
}