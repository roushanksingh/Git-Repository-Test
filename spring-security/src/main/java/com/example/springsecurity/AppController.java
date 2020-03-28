package com.example.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@Autowired
	MyUserDetailsService myUserDetailsService;

	@GetMapping("/")
	public String home() {
		return "<h1>Welcome</h1>" ;
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "<h1>Welcome Admin</h1>" ;
	}
	
	@GetMapping("/user")
	public String user() {
		return "<h1>Welcome User</h1>" ;
	}
	
	@GetMapping("/userDetails")
	public String userDetails() {
		UserDetails userDetails = myUserDetailsService.loadUserByUsername("user");
		return "<h1>Welcome User</h1>" ;
	}
}
