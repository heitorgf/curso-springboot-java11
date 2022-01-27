package com.hgf.curso.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hgf.curso.entities.User;

@RestController
@RequestMapping(value= "users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u= new User(1L, "maria", "maria@hotmail.com", "62909090", "123232");
		return ResponseEntity.ok().body(u);
	}
}
