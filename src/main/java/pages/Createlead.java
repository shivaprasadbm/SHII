package pages;

import wrappers.LeafTapsWrappers;

public class Createlead extends  LeafTapsWrappers  {

	public Createlead() {
		super();
		if(verifyTitle("Create Lead | opentaps CRM")==false) {
			reportStep("This is not My Home Page", "Fail");
		}
	}

	public Createlead companyName() {
		enterByName("companyName", "moolya");
		return new Createlead();
	}


	public Createlead firstName() {
		enterByName("firstName", "shiva");
		return new Createlead();
	}


	public Createlead lastName() {
		enterByName("lastName", "prasad");
		return new Createlead();
	}


	public Viewleadpage submitButton() {
		clickByName("submitButton");
		return new Viewleadpage();
	}
}
