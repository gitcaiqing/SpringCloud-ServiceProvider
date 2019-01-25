package com.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.service.UserinfoService;

@RestController
@RequestMapping("/cloud/userinfo")
public class UserinfoController {
	
	@Autowired
	private UserinfoService userinfoService;
	
	@RequestMapping("/list")
	public Object list() {
		return userinfoService.list();
	}

}
