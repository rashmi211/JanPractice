package test;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pojo.RS_LounchBrowser;
import pom.RS_LoginPage;
import utility.RS_Parameterization;


public class RS_LoginPageTest extends RS_BaseClass {
	@BeforeTest
	public void testlevel() {
		System.out.println("Run before test ");
	}
	@BeforeClass
	public void test() {
		System.out.println("Before class login");
	}

	@BeforeMethod
	public void openchorme() {
		 driver=RS_LounchBrowser.lounchbrowser();	
	}
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest() {
		RS_LoginPage loginpage=new RS_LoginPage(driver);
		String title=loginpage.validateLoginPageTitle(driver);
		Assert.assertEquals(title, "Swag Labs");	
	}
	
	@Test(priority=2)
	public void verifyUserAbletoLoginwithCorrectCredentialsTest() throws EncryptedDocumentException, IOException {
		RS_LoginPage loginpage=new RS_LoginPage(driver);
		String username=RS_Parameterization.getdata(1, 0);
		loginpage.enterUserName(username);
		String password=RS_Parameterization.getdata(1, 1);
		loginpage.enterPassword(password);
		loginpage.clickOnLoginButton();	
		String hometitle=loginpage.validateHomePageTitle(driver);
		Assert.assertEquals(hometitle, "Swag Labs");
	}
	
	@Parameters({"i","j","k"})
	@Test(priority=3)
	public void useParameterhere(int a,int b,String k){
		System.out.println(a+b+"have"+ k);
		
	}
	@AfterClass
	public void atest() {
		System.out.println("After class login");
	}
	
	@AfterTest
	public void testlevelaftr() {
		System.out.println("Run after test ");
	}
}
