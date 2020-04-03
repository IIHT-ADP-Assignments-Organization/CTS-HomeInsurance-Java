package com.home.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.home.dao.AdminServiceDao;
import com.home.models.Policy;
import com.home.models.Residance;
import com.home.models.User;
@Component
@Service("AdminService")
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminServiceDao adminserviceDao;
	@Transactional
	public boolean signUp(String userName, String password, String reEnterPassword) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
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
