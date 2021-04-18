package com.sportyshoes.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import com.sportyshoes.model.Users;
import com.sportyshoes.service.UsersService;

@Component
public class UserController {
	
	@Autowired
	private UsersService usersService;

	@GetMapping("/userList")
	public ModelAndView initUserList() {
		ModelAndView modelAndView = new ModelAndView("userList");
		List<Users> users = this.usersService.getUsers();
		modelAndView.addObject("users",users);
		return modelAndView;
	}
	
	@GetMapping("/filteredUserList")
	public ModelAndView searchResult(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView("userList");
		List<Users> users = this.usersService.getUsersByUsername(request.getParameter("like"));
		modelAndView.addObject("users", users);
		return modelAndView;
	}
}