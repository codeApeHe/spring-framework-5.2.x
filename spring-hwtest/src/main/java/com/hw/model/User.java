package com.hw.model;

import java.util.Date;

/**
 * @author hewei
 * @date 2020/8/29 18:11
 */
public class User {
	private String username;
	private Integer age;
	private Date birthday;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
