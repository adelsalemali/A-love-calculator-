package com.adel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/test")
	public String name()
	{
		return "hello-world";
	}
}
