package com.qianfeng.enums;

public enum UserEnum {
	USER_NAME_IS_NULL("user_name_is_null","�û�������Ϊ��"),
	USER_PASSWORD_IS_NULL("password_is_null","���벻��Ϊ��"),
	USER_VALIDATE_CODE_IS_FAIL("user_validate_code_is_fail","��֤����"),
	USER_NAME_OR_USER_PASSWORD_IS_FAIL("user_name_or_user_password_is_fail)","�û������������벻��ȷ"),
	LOGIN_SUCCESS("login_success","��¼�ɹ�");
	
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
