package com.command.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class commandController {
	@GetMapping("/getcommand")
	public String getcommand() {
		return " you will get a job in soon";
		
	}

}
