package com.paypal.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.paypal.entities.Profile;
import com.paypal.model.DAOImpl;

public class LoginHelper 
{
	DAOImpl dao = new DAOImpl();
	Connection con = dao.getConnection();
	
	public String checkLogin(String userName)
	{
		String query = "SELECT password FROM paypallogin where username = ?";
		String password = null;
		
		try {
			
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setString(1, userName);
			ResultSet rs = dao.selectData(psmt);
			
			if(rs.next())
			{
				password = rs.getString(1);
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
		return password;
	}
	
	public boolean registerUser(Profile profile)
	{
		String query = "INSERT INTO paypallogin(name, age, mobile, address, email, username, password, balance)"
						+ " values(?,?,?,?,?,?,?)";
		
		try {
			
			PreparedStatement psmt = con.prepareStatement(query);
			
			psmt.setString(1, profile.getName());
			psmt.setString(2, String.valueOf(profile.getAge()));
			psmt.setString(3, profile.getMobile());
			psmt.setString(4, profile.getAddress());
			psmt.setString(5, profile.getEmail());
			psmt.setString(6, profile.getUsername());
			psmt.setString(7, profile.getPassword());
			psmt.setString(8, profile.getBalance());
			
			if(dao.insertData(psmt) > 0)
				return true;
			
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
