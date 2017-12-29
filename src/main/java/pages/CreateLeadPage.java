package pages;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers{
	
	
	public CreateLeadPage (){
		if(verifyTitle("My Home | opentaps CRM")==false){
			reportStep("This is not My Home Page", "Fail");
		}
		
	}
	public CreateLeadPage enterCompanyName(){
		enterById("createLeadForm_companyName", "Company1");
		return this;
	}
	
	public CreateLeadPage enterFirstName(){
		enterById("createLeadForm_firstName", "Subhasis");
		return this;
		
	}
	public CreateLeadPage enterLastName(){
		enterById("createLeadForm_lastName","Pati");
		return this;
	}
	public ViewLead clickCreateLead(){
		clickByName("submitButton");
		return new ViewLead();	
	}
	

}
