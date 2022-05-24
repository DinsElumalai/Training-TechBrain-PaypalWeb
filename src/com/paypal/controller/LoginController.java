package com.paypal.controller;

import com.paypal.entities.Profile;
import com.paypal.helper.LoginHelper;
import com.paypal.model.CacheMemory;

public class LoginController 
{

	LoginHelper helper = new LoginHelper();
	String result = null;
	
	
	public boolean login(String userName, String password)
	{
		String result = helper.checkLogin(userName);
		if(result != null && result.equals(password))
		{
			CacheMemory.loggedUsername = userName;
			return true;	
		}
		else
			return false;
		
	}
	
	public String register(String name, int age, String mobile, String address,String  email,String balance,  String username, String password, String cfPassword)
	{
		if(password.equals(cfPassword))
		{
			Profile profile = new Profile();
			profile.setName(name);
			profile.setAge(age);
			profile.setMobile(mobile);
			profile.setAddress(address);
			profile.setEmail(email);
			profile.setUsername(username);
			profile.setPassword(password);
			profile.setBalance(balance);
			
			if(helper.registerUser(profile))
			{
				return "Registration Successful";
			}
			else
			{
				CacheMemory.loggedUsername = "";
				return "Registration Failed";
			}
			
		}
		else
			return "Password Mismatch";
		
	}
}

