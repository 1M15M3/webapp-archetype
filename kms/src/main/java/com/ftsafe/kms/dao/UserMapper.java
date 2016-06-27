package com.ftsafe.kms.dao;

import com.ftsafe.kms.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(String operId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String operId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}