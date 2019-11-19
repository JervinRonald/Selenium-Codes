package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.amazon.in/");
	d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone6s");
	d.findElement(By.className("nav-input")).click();
	d.findElement(By.className("s-image")).click();
	String pw = d.getWindowHandle();
	System.out.println(pw);
	Set<String> aw = d.getWindowHandles();
	System.out.println(aw);
	for (String x : aw) {
		if(!(x.equals(pw))) {
			d.switchTo().window(x);
		}
	}
	d.findElement(By.id("add-to-cart-button")).click();
}
}
