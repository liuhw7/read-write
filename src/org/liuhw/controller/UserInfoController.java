package org.liuhw.controller;

import org.liuhw.entity.UserInfo;
import org.liuhw.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoServiceImpl;
	
	@RequestMapping(value="/getUserInfo")
	@ResponseBody
	public UserInfo getUserInfo(){
		return userInfoServiceImpl.getUserInfo();
	}
	
	@RequestMapping(value="/addUserInfo")
	@ResponseBody
	public void getUserInfo(UserInfo userInfo){
		userInfoServiceImpl.addUserInfo(userInfo);
	}
}
