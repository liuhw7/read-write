package org.liuhw.dao;

import org.liuhw.entity.UserInfo;

public interface UserInfoMapper {
	
   	 UserInfo getUserInfo();
   	 
   	 void saveUserInfo(UserInfo userInfo);
   	
}