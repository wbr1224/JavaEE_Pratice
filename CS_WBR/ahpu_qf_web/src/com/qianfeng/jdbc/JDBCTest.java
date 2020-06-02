package com.qianfeng.jdbc;
import java.sql.DriverManager;
	/**
	 *  JDBC :一项技术，专门为Java链接数据库提供的 操作接口
	 *  JDBC 只存在于Java
	 *  原理：执行的过程使用Java代码发送sql语句到数据库端的服务器去执行，并且根据我们的逻辑实现数据调用
	 *  这就是JDBC
	 *  注意：sql 事务（特性） 数据库提交和回滚
	 *  5.7 8.0
	 *  
	 *  jdbc的核心操作接口
	 *  1.Driver 数据库的驱动接口 启动链接
	 *  2.connection呢次托尼 数据库的链接对象接口 建立连接
	 *  3.statement 执行sql的对象接口 （preparestatement 防止sql注入）执行预编译sql对象接口
	 *  4.resultSet 结果集（迭代集） 结果集的对象接口
	 *  
	 *  
	 *  
	 *  链接数据库需要哪些信息？
	 *  MySQL的服务器地址 127.0.0.1 localhost
	 *  安装数据库服务的时候，自己设置的信息-------用户名和密码
	 *  
	 *  URL:统一资源定位符 ----------URL
	 *  
	 *  jdbc:数据库类型://服务地址（本机）：端口号/数据库名字
	 *  
	 *  导入工具包jar包
	 * */
public class JDBCTest {
	public static void main(String[] args){
		selectAll();
	}
	
	public static void selectAll(){
		// jdbc 7大操作流程
		// 1:加载数据库厂商提供驱动
		// 这里也可以选择手写，但是千万不要写出了，注意是JDBC
		// 数据库我们不需要安装 因为工作数据库不需要妮子安装
		try{
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection connection = DriverManager
					.getConnection("jdbc:mysql://cdb-kthncrwi.bj.tencentcdb.com:10159/chensiwei","root","3cwangzi");
			// 3:通过connection来实例化一个数据库实例preparestatement
			// 什么是数据库实例？数据库实例是用来执行对应SQL语句的
			java.sql.PreparedStatement preparedStatament = 
					connection.prepareStatement("select * from ahgc_user");
			// 4:通过preparestatement数据库实例来执行SQL语句并实例化一个resultset(数据库查询结果集)
			java.sql.ResultSet resultSet = preparedStatament.executeQuery();
			// 5:
			while(resultSet.next()){
				// 6:处理结果集
				String username = (String) resultSet.getObject("username");
				System.out.println(username);
			}
			// 7:关闭数据库链接
			resultSet.close();
			preparedStatament.close();
			connection.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
