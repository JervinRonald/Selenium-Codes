package org.test;

public class Execution extends Baseclass {
	public static void main(String[] args) {
		BrowserLaunch("https://www.zoho.com/sites/login.html");
		LoginPage l=new LoginPage();
		Click(l.getTxtlogin());
		Type(l.getTxtid(),"Jervin");
		Type(l.getTxtpass(),"Jervin123");
		Click(l.getTxtsignin());
}
}
