package com.qianfeng.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qianfeng.biz.UserBIZ;
import com.qianfeng.enums.UserEnum;

public class LoginServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		java.lang.String username = request.getParameter("username");
		response.getWriter().print("hello" + username + "!!!");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String validatecode = request.getParameter("validatecode");
		String syscode = (String) request.getSession().getAttribute("syscode");
		UserBIZ userBIZ = new UserBIZ();
		String result = userBIZ
				.login(username, password, syscode, validatecode);
		if(result.equals(UserEnum.LOGIN_SUCCESS.getValue())){
			request.getRequestDispatcher("AuctionListServlet").forward(request, response);
		}
		else{
			request.getRequestDispatcher("index.jsp?msg="+result+"").forward(request, response);		}
		
	}

}
