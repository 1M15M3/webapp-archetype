package com.ftsafe.kms.dao;

import com.ftsafe.kms.pojo.HSMKey;
import com.ftsafe.kms.pojo.HSMKeyKey;

public interface HSMKeyMapper {
    int deleteByPrimaryKey(HSMKeyKey key);

    int insert(HSMKey record);

    int insertSelective(HSMKey record);

    HSMKey selectByPrimaryKey(HSMKeyKey key);

    int updateByPrimaryKeySelective(HSMKey record);

    int updateByPrimaryKey(HSMKey record);
}