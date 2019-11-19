package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement> R = d.findElements(By.tagName("tr"));
		for (WebElement X : R) {
			List<WebElement> C = X.findElements(By.tagName("td"));
			for (WebElement Y : C) {
				String S = Y.getText();
				if(S.equals("4")) {
					System.out.println(S);
				}
			}
		}
}
}
