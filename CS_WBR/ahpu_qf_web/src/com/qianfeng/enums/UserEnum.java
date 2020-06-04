package com.qianfeng.enums;

public enum UserEnum {
	USER_NAME_IS_NULL("user_name_is_null","用户名不能为空"),
	USER_PASSWORD_IS_NULL("password_is_null","密码不能为空"),
	USER_VALIDATE_CODE_IS_FAIL("user_validate_code_is_fail","验证错误"),
	USER_NAME_OR_USER_PASSWORD_IS_FAIL("user_name_or_user_password_is_fail)","用户名或密码输入不正确"),
	LOGIN_SUCCESS("login_success","登录成功");
	
	private String value;
	private String desc;
	
	private UserEnum(String value,String desc){
		this.value=value;
		this.desc=desc;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
