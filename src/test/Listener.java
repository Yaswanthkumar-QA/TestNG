package test;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

public class Listener implements ITestListener {
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I successfully executed Listeners pass code");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("I failed executed Listeners pass code"+result.getName());
	}
}
