package model.user;

import java.sql.*;

public class User {
	
	private String username;
	private String password;
	private String accountType;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public int insertAccount(Connection con) {
		
		String sql = "insert into users values (?,?,?)";
		int changeValue = 0;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, accountType);
			changeValue = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return changeValue;
	}
	
	public ResultSet login(Connection con) {
		
		ResultSet i = null;
		
		String sql = "select username,password from users where username = ? and password = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2, password);
			i = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

}
