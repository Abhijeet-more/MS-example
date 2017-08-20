package com.websystique.springboot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.websystique.springboot.model.User;

@RestController
@RequestMapping("/api")
public class RestApiController {

	@RequestMapping(value = "/login/{uname}/{pwd}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> listAllUsers(@PathVariable("uname") String username,@PathVariable("pwd") String password) {
		User users = new User();
		users.setAge(20);
		users.setId(100);
		users.setName(username);
		users.setSalary(1000);
		//userService.findById(1);
	
		return new ResponseEntity<User>(users, HttpStatus.OK);
	}

}