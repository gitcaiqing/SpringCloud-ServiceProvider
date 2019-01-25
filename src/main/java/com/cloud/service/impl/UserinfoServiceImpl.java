package com.cloud.service.impl;

import org.springframework.stereotype.Service;

import com.cloud.service.UserinfoService;

@Service
public class UserinfoServiceImpl implements UserinfoService{
	
	@Override
	public Object list() {
		// TODO Auto-generated method stub
		return "cloud userinfo list success";
	}

}
