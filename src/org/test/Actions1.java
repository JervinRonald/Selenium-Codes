package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.flipkart.com/");
		WebElement B = d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		WebElement E = d.findElement(By.xpath("//span[text()='Electronics']"));
		WebElement P = d.findElement(By.xpath("//a[text()='Power Banks']"));
		Actions a=new Actions(d);
		B.click();
		a.moveToElement(E).perform();
		a.moveToElement(P).perform();
		P.click();
	}		
}
