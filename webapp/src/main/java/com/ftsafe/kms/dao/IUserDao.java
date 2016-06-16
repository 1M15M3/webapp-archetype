/**
* @FileName IUserDao.java
* <p>
* @Date 2016年6月16日
* <p>
* 本源码采用Apache许可协议，
* 如有疑问请电邮 qingyuan.ke@foxmail.com。
*/

package com.ftsafe.kms.dao;

import com.ftsafe.kms.pojo.User;

/**
* <p>
* @className IUserDao.java
* @classDescription 
* <p>
* @createTime 2016年6月16日
* @author Qingyuan
*/

public interface IUserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
