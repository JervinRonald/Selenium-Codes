package org.test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://www.greenstechnologys.com/");
	TakesScreenshot T=(TakesScreenshot)d;
	File S=T.getScreenshotAs(OutputType.FILE);
	File D=new File("F:\\Image\\Greens.jpg");
	FileUtils.copyFile(S,D);
}
}
