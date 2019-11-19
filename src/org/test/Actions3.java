package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://greenstech.in/selenium-course-content.html");
		WebElement C = d.findElement(By.className("activeLink"));
		WebElement O = d.findElement(By.xpath("//span[text()='Oracle Training ']"));
		WebElement S = d.findElement(By.xpath("//span[text()='Oracle SQL Training']"));
		Actions a=new Actions(d);
		a.moveToElement(C).perform();
		a.moveToElement(O).perform();
		a.moveToElement(S).perform();
		S.click();
		WebElement T = d.findElement(By.xpath("//h1[text()='ORACLE SQL TRAINING IN CHENNAI']"));
		String T1=T.getText();
		System.out.println(T1);
}
}
