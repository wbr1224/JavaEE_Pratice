package com.qianfeng.util;

import java.util.Random;

public class ValidateUtil {
		
	public static String createValidateCode() {
		String temp = "1234567890qwertyuiopasdfghjklzxcvbnm";
		StringBuilder code = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			code.append(temp.charAt(new Random().nextInt(temp.length())));
		}
		return code.toString();
	}
	public static void main(String[] args) {
		System.out.println(createValidateCode());
	}
}
