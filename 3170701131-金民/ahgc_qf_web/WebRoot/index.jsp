<%@ page import="com.qianfeng.enums.UserEnum"%>
<%@ page import="com.qianfeng.util.ValidateUtil"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	
	String code = com.qianfeng.util.ValidateUtil.createValidateCode();
	request.getSession().setAttribute("syscode", code);
	String msg = request.getParameter("msg");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	
	<%
	if(msg!= null && msg.equals(UserEnum.USER_NAME_IS_NULL.getValue())) {%>
	alert("<%=UserEnum.USER_NAME_IS_NULL.getDesc()%>");
	<%}%>
	
	<%
	if(msg!= null && msg.equals(UserEnum.USER_PASSWORD_IS_NULL.getValue())) {%>
	alert("<%=UserEnum.USER_PASSWORD_IS_NULL.getDesc()%>");
	<%}%>
	
	<%
	if(msg!= null && msg.equals(UserEnum.USER_VALIDATE_CODE_IS_FAIL.getValue())) {%>
	alert("<%=UserEnum.USER_VALIDATE_CODE_IS_FAIL.getDesc()%>");
	<%}%>
	
	<%
	if(msg!= null && msg.equals(UserEnum.USER_NAME_OR_USER_PASSWORD_IS_FAIL.getValue())) {%>
	alert("<%=UserEnum.USER_NAME_OR_USER_PASSWORD_IS_FAIL.getDesc()%>");
	<%}%>
	
	<%
	if(msg!= null && msg.equals(UserEnum.LOGIN_SUCCESS.getValue())) {%>
	alert("<%=UserEnum.LOGIN_SUCCESS.getDesc()%>");
	<%}%>
	
	
	
	</script>
  </head>
  
  <body style="background-image: url('https://pt.1000phone.net/static/img/fyzh_login1.824f963.jpg');background-repeat;background-size: 100% 100%">
  
  <form action="LoginServlet" style="margin-top: 200px" method = "post">
  	<center>
  	<h1>回购网管理后台</h1>
  	</center>
  	<table align="center">
  		<tr> 
  			<td>用户名:</td>
  			<td><input name="username" />
  			</td>
  		</tr>
  		<tr> 
  			<td>密码:</td>
  			<td><input name="password" type="password"/>
  			</td>
  		</tr>
  		<tr> 
  			<td>验证码:<%=code%></td>
  			<td><input name="validatecode" />
  			</td>
  		</tr>
  		<tr> 
  			<td colspan="2">
  			<button>登录</button>
  			</td>
  		</tr>
  		
  	</table>
  
  
  </form>
  </body>
</html>
