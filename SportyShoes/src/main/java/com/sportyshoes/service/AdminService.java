package com.sportyshoes.service;


import com.sportyshoes.model.Admin;



public interface AdminService {

	public Admin getAdminPassword();
	public void changePassword(String password);
	
}
