/**
* @FileName UserService.java
* <p>
* @Date 2016年6月16日
* <p>
* 本源码采用Apache许可协议，
* 如有疑问请电邮 qingyuan.ke@foxmail.com。
*/

package com.ftsafe.kms.service.impls;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ftsafe.kms.dao.IUserDao;
import com.ftsafe.kms.pojo.User;
import com.ftsafe.kms.service.IUserService;

/**
* <p>
* @className UserService.java
* @classDescription 
* <p>
* @createTime 2016年6月16日
* @author Qingyuan
*/

// @Service 注解
@Service("userService")
public class UserService implements IUserService {

	@Resource
	private IUserDao userDao;
	
	/**
	 *<p>
	 * 功能描述 
	 *</p>
	 * @param userId
	 * @return   
	 */
	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

}
