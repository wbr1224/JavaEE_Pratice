package com.qianfeng.util;

import java.util.Random;

public class ValidateUtil {

	public static String createValidateCode(){
		String temp="qwerttyuiop";
		StringBuilder codeBuilder=new StringBuilder();
		for(int i=0;i<4;i++){
			codeBuilder.append(temp.charAt(new Random().nextInt(temp.length())));
		}
		return codeBuilder.toString();
	}
	
	public static void main(String[] args){
		System.out.println(createValidateCode());
	}
}
