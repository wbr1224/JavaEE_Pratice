package com.qianfeng.util;

import java.util.Random;

public class ValidateUtil {
	// 静态函数不需要实例化就可以直接使用
	// 如果该文件是util包下面的文件,那么该文件的所有函数 都应该符合工具类的特征
	public static String createValideCode(){
		String temp = "1234567890qwertyuiopasdfghjklzxcvbnm";
		// 如果一个字符串需要拼接的话 用这个文件 性能会高一点 因为它不会在堆栈中注册新的地址
		StringBuilder code = new StringBuilder();
		for(int i=0;i<4;i++){
			code.append(temp.charAt(new Random().nextInt(temp.length())));//根据字符串字符的索引返回对应的字符
			// 这是一个随机池，返回的int值有36种可能0~35
			// charAt根据字符串的索引返回对应的字符
			// append函数是字符串（stringbullder）拼接的函数
		}
		return code.toString();	
	}
	// 做web开发，非特殊场景用不到多线程 因为tomcat本身就是多线程编程(web容器多线程+套接字)，tomcat在jeemter项目中并发数测试可以达到500条
	// 中小型项目是可以hold住
	// 用java做web开发 更多关注的不是用户量的问题
	// 而是关心WEB开发中的几个常用文件 分别是httpservletrequest,httpservletresponse(他们作用域仅仅针对一次http协议)
	// httpservletApplication(WEB容器级别的作用域),httpSession(用户级别作用域)
	public static void main(String[] args){
		System.out.println(createValideCode());
	}
}
