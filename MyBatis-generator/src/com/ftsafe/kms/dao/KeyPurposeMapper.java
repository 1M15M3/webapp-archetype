package com.ftsafe.kms.dao;

import com.ftsafe.kms.pojo.KeyPurpose;

public interface KeyPurposeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KeyPurpose record);

    int insertSelective(KeyPurpose record);

    KeyPurpose selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KeyPurpose record);

    int updateByPrimaryKey(KeyPurpose record);
}