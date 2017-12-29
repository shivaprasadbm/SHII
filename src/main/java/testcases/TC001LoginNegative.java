package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC001LoginNegative extends LeafTapsWrappers {
	
	@BeforeClass
	public void setData(){
		testCaseName = "TC002 Login Negative";
		testDescription = "Login test case with negative scenario";
		authors = "Lata";
		category = "Sanity";
		dataSheetName = "TC002";
		browserName = "Chrome";
	}
	
	@Test(dataProvider = "fetchData")
	public void loginForFailure(String uName,String pwd, String data){
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.failedLogin()
		.verifyErrorMsg(data);
	}
	

}
