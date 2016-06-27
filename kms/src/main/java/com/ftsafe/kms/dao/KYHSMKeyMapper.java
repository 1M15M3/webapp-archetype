package com.ftsafe.kms.dao;

import com.ftsafe.kms.pojo.KYHSMKey;

public interface KYHSMKeyMapper {
    int deleteByPrimaryKey(Integer hId);

    int insert(KYHSMKey record);

    int insertSelective(KYHSMKey record);

    KYHSMKey selectByPrimaryKey(Integer hId);

    int updateByPrimaryKeySelective(KYHSMKey record);

    int updateByPrimaryKey(KYHSMKey record);
}