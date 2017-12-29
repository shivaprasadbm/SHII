package pages;

import wrappers.LeafTapsWrappers;

public class Viewleadpage extends LeafTapsWrappers{

	public Viewleadpage() {
		if(verifyTitle("View Lead | opentaps CRM")==false){			
			reportStep("This is not My Login Page", "Fail");
		}
	}
	
	public void verifyPage() {
		verifyTextContainsById("viewLead_firstName_sp", "shiva");
	}

}
