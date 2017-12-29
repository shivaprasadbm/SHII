package pages;

import com.google.common.base.Verify;

import wrappers.LeafTapsWrappers;

public class MyHomePage extends LeafTapsWrappers {
	
	public MyHomePage (){
		if(verifyTitle("My Home | opentaps CRM")==false){
			reportStep("This is not My Home Page", "Fail");
		}
		
	}
	public LeadsPage clickLeads(){
		clickByXpath("//a[contains(text(),'Leads')]");
		return new LeadsPage();
	}
	public FindLeadPage clickFindLead(){
		clickByXpath("//a[contains(text(),'Find Leads')]");
		return new FindLeadPage();
	}

}
