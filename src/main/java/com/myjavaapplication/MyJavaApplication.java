package com.myjavaapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyJavaApplication {
	
	@GetMapping(path="/getname")
	public String getName() {
		return "vinesh";
	}

}
