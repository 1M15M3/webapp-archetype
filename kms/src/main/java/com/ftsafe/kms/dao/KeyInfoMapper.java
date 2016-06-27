package com.ftsafe.kms.dao;

import com.ftsafe.kms.pojo.KeyInfo;

public interface KeyInfoMapper {
    int deleteByPrimaryKey(KeyInfo key);

    int insert(KeyInfo record);

    int insertSelective(KeyInfo record);

    KeyInfo selectByPrimaryKey(KeyInfo key);

    int updateByPrimaryKeySelective(KeyInfo record);

    int updateByPrimaryKey(KeyInfo record);
}