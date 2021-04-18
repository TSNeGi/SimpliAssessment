package com.sportyshoes.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;
import com.sportyshoes.model.Users;
import com.sportyshoes.repository.UsersRepository;



@Service("usersService")
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersRepository shopperRepository;
	

	@Override
	public List<Users> getUsers() {
		return this.shopperRepository.findAll(Sort.by(Sort.Direction.ASC, "username"));
	}

	@Override
	public List<Users> getUsersByUsername(String username) {
		return this.shopperRepository.findUsersByUsername(username);
	}

	@Override
	public Users getUsers(int id) {
		return this.shopperRepository.getOne(id);
	}

	
	
}
