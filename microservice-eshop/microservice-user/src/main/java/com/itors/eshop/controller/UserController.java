package com.itors.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.itors.eshop.pojo.UserInfo;
import com.itors.eshop.service.impl.UserInfoServiceImpl;

@RestController
public class UserController {

	@Autowired
	private UserInfoServiceImpl userInfoService;
	
	@ResponseBody
	@PostMapping("/login")
	public Object login(){
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(100001);
		return userInfoService.loginDo(userInfo);
				
	}

}
