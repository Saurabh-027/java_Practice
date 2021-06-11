package com.validation;

public class AdminValidation {

	public void Sysout() {
		System.out.println("hello validation page");

	}
	public boolean adminvalidation(String adminid)
	{
		
		if(adminid.equals("789654"))
		{
			return true;
		}
		return false;
	}
	
}
