package pages;


import wrappers.LeafTapsWrappers;

public class LeadsPage extends LeafTapsWrappers {
	
	public LeadsPage (){
		if(verifyTitle("My Leads | opentaps CRM")==false){
			reportStep("This is not My Lead Page", "Fail");
		}
		
	}
	public CreateLeadPage clickCreateLead(){
		clickByXpath("//a[contains(text(),'Create Lead')]");
		return new CreateLeadPage();
	}
	//public void 
	

}
