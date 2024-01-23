package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

@Listeners (RS_ListenersDemo.class)

public class RS_Sample {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest etest;
	
	@BeforeClass
	public void sampleClass() {
		System.out.println("Before sample class"+Thread.currentThread().getId());
	}
	
	@BeforeMethod
	public void configsetup() {
		String reportpath=System.getProperty("user.dir")+"\\report\\index.html";
		ExtentSparkReporter report=new ExtentSparkReporter(reportpath);
		report.config().setReportName("Jan2024 Project");
		report.config().setDocumentTitle("Jan2024 Test report Title");
		
		extent =new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("TestName", "Regression");
		extent.setSystemInfo("Created By", "Rashmi Salunke");
		extent.setSystemInfo("Date of creation", "19th Jan 2024");
		extent.setSystemInfo("Checked By", "Naveen B");
		
		
	}
	
	@Parameters({"i","j"})
	@Test (enabled=false)
	public void testA(int a ,int b) {
		System.out.println("Test A " + a +" and "+ b +" " +Thread.currentThread().getId());
	}
	
	@Test
	public void testB() {
		etest=extent.createTest("testB Started");
		System.out.println("Test B "+Thread.currentThread().getId());
	}
	
	@Test
	public void testC() {
		etest=extent.createTest("testC Started");
		System.out.println("Test C "+Thread.currentThread().getId());
	}
	
	@DataProvider (name="logindata")
	public Object dataforSample() {
		Object[][] data=new Object[2][2];
		data[0][0]="rashmi";
		data[0][1]="rashu";
		
		data[1][0]="shrity";
		data[1][1]="aghfshgd";
		return data;	
	}
	
	@Test(dataProvider="logindata")
	public void datatest(String name,String surname) {
		etest=extent.createTest("datatest Started");
		System.out.println(name+" will be "+ surname);
	}
	
	@AfterMethod
	public void close() {
//		driver.close();
		extent.flush();
		
	}
	
	@AfterClass
	public void asampleClass() {
		System.out.println("After sample class");
	}
}
