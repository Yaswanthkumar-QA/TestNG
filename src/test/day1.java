package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	

	
	
	
	@Parameters({"URL"})
	@Test
	public void Demo(String url)
	{
		
		System.out.println("Hello");
		System.out.println(url);
		
		
	}
	
	
	@Test
	public void Demo2()
	{
		System.out.println("Bye");
	}

}
