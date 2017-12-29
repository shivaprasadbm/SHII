package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class HomePage extends LeafTapsWrappers{
	
	public HomePage (RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(verifyTitle("Opentaps Open Source ERP + CRM")==false){			
			reportStep("This is not My Home Page", "Fail");
		}
		
	}
	public HomePage verifyUserName(String data){
		verifyTextContainsByXpath("//h2[text()[contains(.,'Demo')]]", data);
		return this;
	}
	public LoginPage clickLogout(){
		clickByClassName("decorativeSubmit");
		return new LoginPage(driver, test);
		
	}
	public MyHomePage clickCrm(){
		clickByXpath("//a[contains(text(),'CRM/SFA')]");
		return new MyHomePage();
	}
	

}
