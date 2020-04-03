package com.home.services;

import com.home.models.Policy;
import com.home.models.Property;
import com.home.models.Quote;
import com.home.models.Residance;

public interface CustomerService {
	
		boolean signUp(String userName,String password,String reEnterPassword);
		boolean signIn(String userName,String password);
		boolean signOut();
		Policy viewPolicy(String policyKey);
	 Policy buyPoilcy();
	 Quote applyQuote(Residance residance,Property property);
	 Residance retrieveQuote(long userId);
	
}
