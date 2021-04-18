package com.sportyshoes.service;

import java.util.List;


import com.sportyshoes.model.Users;


public interface UsersService {

	public List<Users> getUsers();
	public Users getUsers(int id);
	public List<Users> getUsersByUsername(String username);
	
	
}
