<%@page import="com.qianfeng.entity.Auction"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	List<Auction> auctions  = (List<Auction>) request.getAttribute("auctions");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'auction_datagrid.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<style type="text/css">
	td{
		border: 1px solid red;
		width: 150px;
		height: 80px;
	}	
	</style>

  </head>
  
  <body>
  	<center><h1>回购品列表</h1></center>
    <table style="border: 1px solid red;" align="center">
    	<tr>
    		<td>回购品名</td>
    		<td>回购价格</td>
    		<td>成交价</td>
    		<td>回购发起时间</td>
    		<td>回购结束时间</td>
    		<td >回购品描述</td>
    		<td>操作</td>
    	</tr>
    	<%
    		for(Auction auction : auctions){  
    	%>
    	<tr>
    		<td><%= auction.getAuctionname()%> </td>
    		<td><%= auction.getAuctionstartprice()%></td>
    		<td><%= auction.getAuctionupset()%></td>
    		<td><%= auction.getAuctionstarttime()%></td>
    		<td><%= auction.getAuctionupset()%></td>
    		<td><%= auction.getAuctiondesc()%></td>
    		<td><button>修改</button><button>删除</button></td>
    	<tr>
    	<%
    		}
    	 %>
    		<td colspan="6"><a herf="#">1</a></td>
    	</tr>
    </table>
  </body>
</html>
