package com.websystique.springboot.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.websystique.springboot.model.Message;

@RestController
@RequestMapping("/api")
public class RestApiController {

	@RequestMapping(value = "/postMessage/", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	   @ResponseStatus(HttpStatus.CREATED)
	   @ResponseBody
	public  String postMessage(@RequestBody Message msg) {
		//add this message to data base 
		//add to Queue to send email
	System.out.println("inside");
	

   // headers.setLocation(ucBuilder.path("/api/user/{id}").buildAndExpand(user.getId()).toUri());
	
    return "success";
		//return new ResponseEntity<String> ("success", HttpStatus.CREATED);
		}

}