package com.qianfeng.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;

public class JDBCTest {

	public static void main(String[] args) {
		//selectALL();
		//addUser();
		//findIdByUserName();
		updateUser();
	}

	public static void selectALL() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection connection = DriverManager
					.getConnection(
							"jdbc:mysql://cdb-kthncrwi.bj.tencentcdb.com:10159/chensiwei",
							"root", "3cwangzi");
			java.sql.PreparedStatement preparedStatement = connection
					.prepareStatement("select * from ahgc_user");
			java.sql.ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String username = (String) resultSet.getObject("username");
				System.out.println(username);
			}
			resultSet.close();
			preparedStatement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void findIdByUserName() {
		java.sql.Connection connection = null;
		java.sql.PreparedStatement preparedStatement = null;
		java.sql.ResultSet resultSet = null;
		try {
			connection = DriverManager
					.getConnection(
							"jdbc:mysql://cdb-kthncrwi.bj.tencentcdb.com:10159/chensiwei",
							"root", "3cwangzi");
			preparedStatement = connection
					.prepareStatement("select id from ahgc_user where username=?");
			preparedStatement.setObject(1, "任鑫");
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getObject("ID"));
				System.out.println(resultSet.getObject(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void addUser() {
		java.sql.Connection connection = null;
		java.sql.PreparedStatement preparedStatement = null;
		try {
			connection = DriverManager
					.getConnection(
							"jdbc:mysql://cdb-kthncrwi.bj.tencentcdb.com:10159/chensiwei",
							"root", "3cwangzi");
			preparedStatement = connection
					.prepareStatement("insert into ahgc_user(username)values(?)");
			preparedStatement.setObject(1, "任鑫");
			int executeCount = preparedStatement.executeUpdate();
			if (executeCount == 0) {
				System.out.println("添加失败");
			} else {
				System.out.println("添加成功");
			}
			preparedStatement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	public static void updateUser() {
		java.sql.Connection connection = null;
		java.sql.PreparedStatement preparedStatement = null;
		try {
			connection = DriverManager
					.getConnection(
							"jdbc:mysql://cdb-kthncrwi.bj.tencentcdb.com:10159/chensiwei",
							"root", "3cwangzi");
			preparedStatement = connection
					.prepareStatement("update ahgc_user set age=21 where id = ?");
			preparedStatement.setObject(1, 30);
			int executeCount = preparedStatement.executeUpdate();
			if (executeCount == 0) {
				System.out.println("修改失败");
			} else {
				System.out.println("修改成功");
			}
			preparedStatement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	public static void deleteUser() {
		java.sql.Connection connection = null;
		java.sql.PreparedStatement preparedStatement = null;
		try {
			connection = DriverManager
					.getConnection(
							"jdbc:mysql://cdb-kthncrwi.bj.tencentcdb.com:10159/chensiwei",
							"root", "3cwangzi");
			preparedStatement = connection
					.prepareStatement("delete from ahgc_user where id = ?");
			preparedStatement.setObject(1, 200);
			int executeCount = preparedStatement.executeUpdate();
			if (executeCount == 0) {
				System.out.println("删除失败");
			} else {
				System.out.println("删除成功");
			}
			preparedStatement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
