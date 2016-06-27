package com.ftsafe.kms.dao;

import com.ftsafe.kms.pojo.KeyInfo;
import com.ftsafe.kms.pojo.KeyInfoKey;

public interface KeyInfoMapper {
    int deleteByPrimaryKey(KeyInfoKey key);

    int insert(KeyInfo record);

    int insertSelective(KeyInfo record);

    KeyInfo selectByPrimaryKey(KeyInfoKey key);

    int updateByPrimaryKeySelective(KeyInfo record);

    int updateByPrimaryKey(KeyInfo record);
}