package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://toolsqa.com/automation-practice-table/");
	List<WebElement> R = d.findElements(By.tagName("tr"));
	for(int i=0;i<R.size();i++) {
	List<WebElement> C = R.get(i).findElements(By.tagName("td"));
	for(int j=0;j<C.size();j++) {
		String S = C.get(j).getText();
		System.out.println(S);
	}
}
}
}
