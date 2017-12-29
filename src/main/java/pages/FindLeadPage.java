package pages;

import wrappers.LeafTapsWrappers;

public class FindLeadPage extends LeafTapsWrappers{
	
	public FindLeadPage(){
		if(verifyTitle("My Leads | opentaps CRM")==false){
			reportStep("This is not My Lead Page", "Fail");
		}
		
	}
	public FindLeadPage enterLeadFirstName(){
		clickByXpath("(//input[@name='firstName'])[3]");
		return this;
	}
	public FindLeadPage clickFindLeads(){
		clickByXpath("//td[@class='x-btn-center']");
		return this;
		
	}

}
