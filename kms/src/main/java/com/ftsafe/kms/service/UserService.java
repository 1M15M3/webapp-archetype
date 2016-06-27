/**
* @FileName IUserService.java
* <p>
* @Date 2016年6月16日
* <p>
* 本源码采用Apache许可协议，
* 如有疑问请电邮 qingyuan.ke@foxmail.com。
*/

package com.ftsafe.kms.service;

import com.ftsafe.kms.pojo.User;

/**
* <p>
* @className IUserService.java
* @classDescription 
* <p>
* @createTime 2016年6月16日
* @author Qingyuan
*/

public interface UserService {

	public User getUserById(String userId);
}
