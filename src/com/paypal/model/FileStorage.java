package com.paypal.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.paypal.entities.Profile;

public class FileStorage 
{
	
	private String fileName = "E:\\Training\\Java\\Core\\Paypal\\src\\com\\paypal\\resources\\userFile.txt";
	private FileOutputStream opFile = null;
	private FileInputStream ipFile = null;
	
	public FileStorage()
	{
		try {
			
			opFile = new FileOutputStream(fileName, true);
			ipFile = new FileInputStream(fileName);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	public void setProfiles(Profile profile)
	{
		try {
			
			opFile.write(profile.toString().getBytes());
			opFile.write("\n".getBytes());
			
			opFile.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getProfiles();
	}
	
	public void getProfiles()
	{
		int ch;
		try {
			
			while((ch=ipFile.read()) != -1)
			{
				System.out.print((char) ch);
			}
			
			ipFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
