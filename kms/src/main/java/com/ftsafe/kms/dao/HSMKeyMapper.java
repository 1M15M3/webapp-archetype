package com.ftsafe.kms.dao;

import com.ftsafe.kms.pojo.HSMKey;

public interface HSMKeyMapper {
    int deleteByPrimaryKey(HSMKey record);

    int insert(HSMKey record);

    int insertSelective(HSMKey record);

    HSMKey selectByPrimaryKey(HSMKey record);

    int updateByPrimaryKeySelective(HSMKey record);

    int updateByPrimaryKey(HSMKey record);
}