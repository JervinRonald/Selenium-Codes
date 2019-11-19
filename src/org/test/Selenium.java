package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://www.snapdeal.com");
	d.manage().window().maximize();
	String S = d.getCurrentUrl();
	System.out.println(S);
	String T = d.getTitle();
	System.out.println(T);
	WebElement txt =d.findElement(By.xpath("//a[text()='Gift Cards']"));
	String T1=txt.getText();
	System.out.println(T1);
	}

}
