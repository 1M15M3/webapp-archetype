package com.ftsafe.kms.dao;

import com.ftsafe.kms.pojo.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(String operType);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String operType);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}