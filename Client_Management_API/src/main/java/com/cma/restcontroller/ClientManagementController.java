package com.cma.restcontroller;

import java.util.List;

import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cma.entity.Users;
import com.cma.services.UserService;

@RestController
public class ClientManagementController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/test")
	public Users geTest() {
		Users users=new Users();
		users.setId(1);
		users.setFirst_name("rahul");
		userService.saveUser(users);
		
		return users;
	}
	
	
	@PostMapping("/saveUsers")
	public ResponseEntity<Users> saveUsers(@RequestBody Users users) {
		
		userService.saveUser(users);
		
		return ResponseEntity.ok().body(users);
	}
	
	@GetMapping("/getUsers")
	public ResponseEntity<List<Users>> getUsers() {
	
		List<Users> userList=userService.getUser();
		
		return ResponseEntity.ok().body(userList);
	}

}
