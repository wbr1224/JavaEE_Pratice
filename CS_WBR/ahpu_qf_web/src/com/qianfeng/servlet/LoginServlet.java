package com.qianfeng.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// HttpServlettRequst request 这个文件实际上就是servelt对http请求体 的一个封装和抽象（说白了就是http请求体抽象成一个java文件）
		// HttpServletResponse response 这个文件实际上就是servlet对http响应体 的一个封装和抽象（说白了就是http响应体抽象成一个java文件）
		
		// http协议组成
		// http的组成分为两个部分
		// http 请求体（用户要对服务器干什么事，是由请求体说了算）和http 响应体（服务器要对用户干什么事）
		
		// http 请求体 和 响应体
		// http 请求体由3个部分组成
		// (1) http的请求行 (url 地址请求方式(get post))
		// (2) http请求头 
		// (比如用户使用的是何种浏览器、使用什么内核、用户的IP是什么、用户时间是什么等等)
		// (3) http请求报文（这里包含的是用户需要向服务器提交的所有数据）
		
		// http 响应体由三个部分组成
		// (1)http响应状态（404文件找不到、500服务器内部错误、200成功）
		// (2)http响应头（决定了响应报文的显示方式，常见的由html格式，plain纯文本格式，json格式...）
		// (3)http响应报文（用户肉眼能够观察到数据都是响应报文的数据（比如）
		
		// 使用请求体获取用户提交的数据
		java.lang.String username = request.getParameter("username");
		// 向响应报文中写入数据
		response.getWriter().print("hello"+username);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
