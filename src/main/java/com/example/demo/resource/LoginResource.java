package com.example.demo.resource;

import java.util.Collections;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;


@RestController
public class LoginResource {
	
	@Autowired
	private UserService userService;
	

	@RequestMapping("/token")
	public Map<String, String> token(HttpSession session, HttpServletRequest request) {
		System.out.println(request.getRemoteHost());
		
		String remoteHost = request.getRemoteHost(); 	
		int portNumber = request.getRemotePort();
		
	System.out.println(remoteHost+":"+portNumber);
	System.out.println(request.getRemoteAddr());
	
	return Collections.singletonMap("token",session.getId());
		
	
	}
	
	@RequestMapping("/checkSession")
	public ResponseEntity checkSession() { 
		return new ResponseEntity("Session Active!",HttpStatus.OK);
	}
	

}
