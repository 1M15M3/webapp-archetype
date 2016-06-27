package com.ftsafe.kms.dao;

import com.ftsafe.kms.pojo.KeyType;

public interface KeyTypeMapper {
    int deleteByPrimaryKey(String keyType);

    int insert(KeyType record);

    int insertSelective(KeyType record);

    KeyType selectByPrimaryKey(String keyType);

    int updateByPrimaryKeySelective(KeyType record);

    int updateByPrimaryKey(KeyType record);
}