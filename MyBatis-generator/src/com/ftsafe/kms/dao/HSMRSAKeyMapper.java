package com.ftsafe.kms.dao;

import com.ftsafe.kms.pojo.HSMRSAKey;

public interface HSMRSAKeyMapper {
    int deleteByPrimaryKey(String hId);

    int insert(HSMRSAKey record);

    int insertSelective(HSMRSAKey record);

    HSMRSAKey selectByPrimaryKey(String hId);

    int updateByPrimaryKeySelective(HSMRSAKey record);

    int updateByPrimaryKey(HSMRSAKey record);
}