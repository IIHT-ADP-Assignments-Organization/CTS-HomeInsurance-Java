package com.home.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.home.models.Policy;
import com.home.models.Residance;
import com.home.models.User;
@Component
public class AdminServiceDaoImpl implements AdminServiceDao {
	@Autowired
	SessionFactory sessionfactory;

	public boolean signUp(String userName, String password, String reEnterPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean signIn(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean signOut() {
		// TODO Auto-generated method stub
		return false;
	}

	public User searchUser(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Policy viewPolicy(String policyKey) {
		// TODO Auto-generated method stub
		return null;
	}

	public Policy renewPolicy(String policyKey) {
		// TODO Auto-generated method stub
		return null;
	}

	public Policy cancellPolicy(String policyKey) {
		// TODO Auto-generated method stub
		return null;
	}

	public Residance RetrieveQuote(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
