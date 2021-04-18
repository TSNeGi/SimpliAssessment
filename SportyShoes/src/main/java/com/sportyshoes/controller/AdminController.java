package com.sportyshoes.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.sportyshoes.service.AdminService;



@RestController

public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@GetMapping("/login")
	public ModelAndView initLogin() {
		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;
	}
	
	@PostMapping("/adminhome") 
	public ModelAndView configureAdminPage(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(!(username.equals("admin") && password.equals(this.adminService.getAdminPassword().getPassword()))) {
			response.setContentType("text/html");
			request.getRequestDispatcher("/views/login.jsp").include(request, response);
			response.getWriter().println("<h4 style=\"color: red; text-align:center;\">Bad Credentials</h4>");
			return null;
		}
		ModelAndView modelAndView = new ModelAndView("adminhome");
		return modelAndView;
	}
	
	@GetMapping("/adminhome")
	public ModelAndView configureAdminPage() {
		ModelAndView modelAndView = new ModelAndView("adminhome");
		return modelAndView;
	}
	
	@GetMapping("/changepassword")
	public ModelAndView changePassword() {
		ModelAndView modelAndView = new ModelAndView("cpass");
		return modelAndView;
	}
	
	@PostMapping("/cpass")
	public void changeAdminPassword(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String enteredOldPassword = request.getParameter("opassword");
		String enteredNewPassword = request.getParameter("cpassword");
		
		PrintWriter writer = response.getWriter();
		String oldPassword = this.adminService.getAdminPassword().getPassword();
		
		if(!oldPassword.equals(enteredOldPassword)) {
			request.getRequestDispatcher("/views/cpass.jsp").include(request, response);
			writer.println("<h3  align=\"center\" style=\"color: red;\">Not Verified! Verify again <h3>");
			return;
		}
		
		
		this.adminService.changePassword(enteredNewPassword);
		request.getRequestDispatcher("/views/cpass.jsp").include(request, response);
		writer.println("<h3 align=\"center\" style=\"color: green;\">Password Changed! <a href=\"adminhome.jsp\">Can return back to home page</a><h3>");
		return;
	}
}