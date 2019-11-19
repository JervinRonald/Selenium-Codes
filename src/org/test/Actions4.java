package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.snapdeal.com/");
		WebElement M = d.findElement(By.xpath("//body[@data-pagename='HomePage']"));
		Actions a=new Actions(d);
		a.moveToElement(M).perform();
}
}