package com.jk.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -6670640310551713010L;

	private String name;
	
	private Integer sex;

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
	
}
