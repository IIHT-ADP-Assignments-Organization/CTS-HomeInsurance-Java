package com.home.services;

import com.home.models.Policy;
import com.home.models.Residance;
import com.home.models.User;

public interface AdminService {
	boolean signUp(String userName,String password,String reEnterPassword);
	boolean signIn(String userName,String password);
	boolean signOut();
	User searchUser(String userName);
	Policy viewPolicy(String policyKey);
	Policy renewPolicy(String  policyKey);
	Policy cancellPolicy(String policyKey);
	Residance RetrieveQuote(long userId);

}
