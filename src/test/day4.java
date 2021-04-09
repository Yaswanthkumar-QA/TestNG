package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"URL"})
	@Test
	public void webloginHomeloan(String urlname)
	{
		//Selenium code
		System.out.println("Web Login Home");
		System.out.println(urlname);
	}
	
	
	@Test(groups= {"Smoke"})
	public void mobileloginhomeloan()
	{
		//Appium code
		System.out.println("Mobile Login Home");
	}
	
	@Test
	public void LoginAPIloginhomeloan()
	{
		//Rest API Automation
		System.out.println("Rest API Login Home");
	}
	

}
