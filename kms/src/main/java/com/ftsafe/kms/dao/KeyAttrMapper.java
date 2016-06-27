package com.ftsafe.kms.dao;

import com.ftsafe.kms.pojo.KeyAttr;

public interface KeyAttrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KeyAttr record);

    int insertSelective(KeyAttr record);

    KeyAttr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KeyAttr record);

    int updateByPrimaryKey(KeyAttr record);
}