package com.home.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.home.models.Policy;
import com.home.models.Property;
import com.home.models.Quote;
import com.home.models.Residance;
@Component
public class CustomerServiceDaoImpl implements CustomerServiceDao {
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

	public Policy viewPolicy(String policyKey) {
		// TODO Auto-generated method stub
		return null;
	}

	public Policy buyPoilcy() {
		// TODO Auto-generated method stub
		return null;
	}

	public Quote applyQuote(Residance residance, Property property) {
		// TODO Auto-generated method stub
		return null;
	}

	public Residance retrieveQuote(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
