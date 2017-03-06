package org.liuhw.service.impl;

import org.liuhw.dao.UserInfoMapper;
import org.liuhw.entity.UserInfo;
import org.liuhw.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService{

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public UserInfo getUserInfo() {
		return userInfoMapper.getUserInfo();
	}

	public void addUserInfo(UserInfo userInfo) {
		userInfoMapper.saveUserInfo(userInfo);
	}
	
	

}
