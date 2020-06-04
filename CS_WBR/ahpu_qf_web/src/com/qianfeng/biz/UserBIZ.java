package com.qianfeng.biz;

import com.qianfeng.dao.UserDAO;
import com.qianfeng.entity.User;
import com.qianfeng.enums.UserEnum;

public class UserBIZ {
	public String login(String username,String password,String syscode,String validatecode){
		if(username==null||username.equals("")){
			return UserEnum.USER_NAME_IS_NULL.getValue();
		}
		if(password==null||password.equals("")){
			return UserEnum.USER_PASSWORD_IS_NULL.getValue();
		}
		if(syscode==null||syscode.equals("")){
			return UserEnum.USER_VALIDATE_CODE_IS_FAIL.getValue();
		}
		if(validatecode==null||validatecode.equals("")){
			return UserEnum.USER_VALIDATE_CODE_IS_FAIL.getValue();
		}
		if(syscode.equals(validatecode)==false){
			return UserEnum.USER_VALIDATE_CODE_IS_FAIL.getValue();
		}
		User user=UserDAO.login(username,password);
		if(user==null){
			return UserEnum.USER_NAME_OR_USER_PASSWORD_IS_FAIL.getValue();
		}
		return UserEnum.LOGIN_SUCCESS.getValue();
	} 
}
