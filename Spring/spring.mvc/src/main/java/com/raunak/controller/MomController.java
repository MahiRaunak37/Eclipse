package com.raunak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MomController {

	// @ResponseBody
	@RequestMapping("/")
	public String giveSuger() {
		return "home";
	}

}
