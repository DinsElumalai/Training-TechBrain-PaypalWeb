package com.paypal.entities;

public class Profile 
{
	private String name;
	private int age;
	private String mobile;
	private String address;
	private String email;
	private String username;
	private String password;
	private String balance;
	
	public Profile() {}
	
	public Profile(String name, int age, String mobile, String address, String email, String username, String password, String balance)
	{
		this.name = name;
		this.age = age;
		this.mobile = mobile;
		this.address = address;
		this.email = email;
		this.username = username;
		this.password = password;
		this.balance = balance;
	}
	
	//Getter and Setter
	public void setName(String name)
	{
		this.name = name;
	}
	
	//Accessmodifier   returntype functionname
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	//Accessmodifier   returntype functionname
	public int getAge()
	{
		return age;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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

	@Override
	public String toString() {
		return "Profile [name=" + name + ", age=" + age + ", mobile=" + mobile + ", address=" + address + ", email="
				+ email + ", username=" + username + ", password=" + password + "]";
	}

	
}
