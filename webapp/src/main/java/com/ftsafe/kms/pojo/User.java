/**
* @FileName User.java
* <p>
* @Date 2016年6月16日
* <p>
* 本源码采用Apache许可协议，
* 如有疑问请电邮 qingyuan.ke@foxmail.com。
*/

package com.ftsafe.kms.pojo;

/**
* <p>
* @className User.java
* @classDescription 
* <p>
* @createTime 2016年6月16日
* @author Qingyuan
*/

public class User {

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	private Integer id;

    private String userName;

    private String password;

    private Integer age;
}
