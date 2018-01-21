package com.jk.model;

import java.io.Serializable;

public class User implements Serializable {


	private static final long serialVersionUID = 2796696084039566596L;

	private String name;
	
	private Integer sex;

private Integer userid;
	
	private String useraddress;
	private String userinfo;
	
	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

	public String getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(String userinfo) {
		this.userinfo = userinfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	/* (non-Javadoc)    
	 * @see java.lang.Object#toString()    
	 */
	@Override
	public String toString() {
		return "User [name=" + name + ", sex=" + sex + ", userid=" + userid + ", useraddress=" + useraddress
				+ ", userinfo=" + userinfo + "]";
	}
	
}
