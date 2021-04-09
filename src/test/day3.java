package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	/*
	@BeforeClass
	public void bfclass()
	{
		System.out.println("I will executed before class");
	}
	*/

	@Parameters({"URL","API Key/Username"})
	@Test
	public void weblogincarloan(String Urlname,String un)
	{
		//Selenium code
		System.out.println("Web Login Car");
		System.out.println(Urlname);
		System.out.println(un);
	}

	@Test(dataProvider="getData")
	public void mobilelogincarloan(String username,String password)
	{
		//Appium code
		System.out.println("Mobile Login Car");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods= {"mobilelogincarloan","weblogincarloan"})
	public void APIlogincarloan()
	{
		//Rest API Automation
		System.out.println("API Login Car");
		
	}
	
	@Test(groups= {"Smoke"})
	public void mobilesignincarloan()
	{
		//Appium code
		System.out.println("Mobile Sign in Car");
	}
	
	@Test(enabled=false)
	public void mobilesignoutcarloan()
	{
		//Appium code
		System.out.println("Mobile Sign out Car");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination-username password - good credit history
		//2nd- username password- no credit history
		//3rd- fradulent credit history
		Object[][] data=new Object[3][2];
		//1st set
		data[0][0]="firstset username";
		data[0][1]="first password";
		//columns in the row nothing but values for that particular combination row
		
		
		//2nd set
		data[1][0]="secondset username";
		data[1][1]="second password";
		
		//3rd set
		data[2][0]="thirdset username";
		data[2][1]="third password";
		return data;
	}
	


}
