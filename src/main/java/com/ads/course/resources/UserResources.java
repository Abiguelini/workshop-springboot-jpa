package com.ads.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ads.course.entities.User;

@RestController
@RequestMapping(value = "/users")

public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> findALl() {
	
		User u = new User(1l, "Maria", "Maria@gmail.com", "(51)93128312", "1234");
		return ResponseEntity.ok().body(u);

	}
}
