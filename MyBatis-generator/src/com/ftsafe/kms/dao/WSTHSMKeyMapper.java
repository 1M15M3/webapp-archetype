package com.ftsafe.kms.dao;

import com.ftsafe.kms.pojo.WSTHSMKey;

public interface WSTHSMKeyMapper {
    int deleteByPrimaryKey(String hId);

    int insert(WSTHSMKey record);

    int insertSelective(WSTHSMKey record);

    WSTHSMKey selectByPrimaryKey(String hId);

    int updateByPrimaryKeySelective(WSTHSMKey record);

    int updateByPrimaryKey(WSTHSMKey record);
}