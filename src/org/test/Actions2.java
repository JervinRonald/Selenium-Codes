package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://greenstech.in/selenium-course-content.html");
		WebElement C = d.findElement(By.className("activeLink"));
		WebElement S = d.findElement(By.xpath("//span[text()='Software Testing Training ']"));
		WebElement SE = d.findElement(By.xpath("//span[text()='Selenium Training']"));
		Actions a=new Actions(d);
		a.moveToElement(C).perform();
		a.moveToElement(S).perform();
		a.moveToElement(SE).perform();
		SE.click();
}
}