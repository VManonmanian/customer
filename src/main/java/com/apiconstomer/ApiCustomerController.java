package com.apiconstomer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiCustomerController {
	String name="NO:25, Demonte Street, Saligramam, chennai";
	@GetMapping("getAddress")
	public String getString() {
		return name;
	}
}
