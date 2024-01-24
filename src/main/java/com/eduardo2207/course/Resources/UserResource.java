package com.eduardo2207.course.Resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardo2207.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User>findAll() {
		User u = new User(1L, "Maria", "aria@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
