package pages;

import wrappers.LeafTapsWrappers;

public class Myleadspage extends LeafTapsWrappers  {

	public Myleadspage() {
		if(verifyTitle("My Leads | opentaps CRM")==false){
			reportStep("This is not My Login Page", "Fail");
		}
	}
	
	public Createlead createLead() {
		clickByLink("Create Lead");
		return new Createlead();
	}
	
	public void findLead() {
		clickByLink("Find Leads");
	}
}
