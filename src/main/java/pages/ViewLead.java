package pages;

import wrappers.LeafTapsWrappers;

public class ViewLead extends LeafTapsWrappers {
	
	public ViewLead (){
		if(verifyTitle("My Home | opentaps CRM")==false){
			reportStep("This is not My Home Page", "Fail");
		}
		
	}
	public CreateLeadPage MyLeadPage(){
		clickByLink("Create Lead");
		return new CreateLeadPage();
	}

}
