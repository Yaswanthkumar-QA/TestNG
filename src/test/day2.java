package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test(groups= {"Smoke"})
	public void ploan()
	{
		System.out.println("Good");
	}
	
	
	@BeforeTest													// This test case execute first
	public void prerequisite()
	{
		System.out.println("It is first output");
	}

}
