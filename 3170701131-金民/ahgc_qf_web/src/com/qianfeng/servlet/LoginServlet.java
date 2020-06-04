package com.qianfeng.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qianfeng.biz.UserBIZ;

public class LoginServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			java.lang.String username = request.getParameter("username");
			response.getWriter().print("hello" + username +"!!!");
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String validatecode = request.getParameter("validatecode");
		String syscode = (String) request.getSession().getAttribute("syscode"); 
		//response.getWriter().println("username:"+username);
		//response.getWriter().println("password:"+password);
		//response.getWriter().println("validatecode:"+validatecode);
		//response.getWriter().println("syscode:"+syscode);
		UserBIZ userBIZ = new UserBIZ();
		String result = userBIZ.login(username, password, syscode, validatecode);
		request.getRequestDispatcher("index.jsp?msg=" + result + "").forward(request, response);
	}

}
