package com.qianfeng.dao;

import java.sql.DriverManager;

import com.qianfeng.entity.User;

public class UserDAO {
	public static User login(String username, String password) {
		User user = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection connection = DriverManager
					.getConnection(
							"jdbc:mysql://cdb-kthncrwi.bj.tencentcdb.com:10159/chensiwei",
							"root", "3cwangzi");
			java.sql.PreparedStatement preparedStatement = connection
					.prepareStatement("select * from ahgc_user where username = ? and password = ?");
			preparedStatement.setObject(1, username);
			preparedStatement.setObject(2, password);
			java.sql.ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				user = new User();
				user.setId(resultSet.getInt("ID"));
				user.setUsername(resultSet.getString("USERNAME"));
				user.setAge(resultSet.getInt("AGE"));
			}
			resultSet.close();
			preparedStatement.close();
			resultSet.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return user;
	}
}
