package com.app.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {
    @GetMapping("/show")
	public ResponseEntity<String> showMsg(){
		
		ResponseEntity<String> resp=new ResponseEntity<String>("Hellow from restProvider",HttpStatus.OK);
		return resp;
	}
}
