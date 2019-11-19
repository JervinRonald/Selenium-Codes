package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecutionClass extends Baseclass {
public static void main(String[] args) {
	BrowserLaunch("https://www.zoho.com/sites/login.html");
	WebElement B = d.findElement(By.className("zlogin-apps"));
	Click(B);
	WebElement U = d.findElement(By.name("lid"));
	Type(U,"Jervin");
	WebElement P= d.findElement(By.name("pwd"));
	Type(P,"Jervin123");
	WebElement C = d.findElement(By.id("signin_submit"));
	Click(C);
}
}
