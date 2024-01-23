package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class RS_ListenersDemo implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" Test started ");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" Test passed ");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" Test failed ");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+ " Test skipped ");
	}
	
	

}
