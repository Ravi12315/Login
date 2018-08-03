package com.pravesh;

import java.io.Serializable;

public class MyBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String uname;
	private String password;
	
	public String getUname() {
		return uname;
	}
	
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean validate() {
		if(password.equals("admin"))
				return true;
		else
			return false;
	}

}
