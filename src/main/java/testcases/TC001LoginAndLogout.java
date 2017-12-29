package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC001LoginAndLogout extends LeafTapsWrappers {
	
	@BeforeClass
	public void setData(){
		testCaseName ="TC001";
		testDescription= "Login to the leaptap";
		authors = "Vinay";
		category = "Smoke";
		dataSheetName = "TC001";
		browserName = "Chrome";
		
	}
	
	
	@Test(dataProvider ="fetchData")
	public void login(String uName, String pwd, String verifyUName){
		/*LoginPage lg = new LoginPage();
		lg.enterUserName(uname);
		lg.enterPassword(pwd);*/
		
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.verifyUserName(verifyUName)
		.clickLogout();
				
		
	}

}
