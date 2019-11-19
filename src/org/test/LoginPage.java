package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Baseclass {
public LoginPage() {
	PageFactory.initElements(d, this);
}
@FindBy (className="zlogin-apps")
private WebElement txtlogin;
@FindBy (name="lid")
private WebElement txtid;
@FindBy (name="pwd")
private WebElement txtpass;
@FindBy (id="signin_submit")
private WebElement txtsignin;

public WebElement getTxtlogin() {
	return txtlogin;
}
public WebElement getTxtid() {
	return txtid;
}
public WebElement getTxtpass() {
	return txtpass;
}
public WebElement getTxtsignin() {
	return txtsignin;
}
}
