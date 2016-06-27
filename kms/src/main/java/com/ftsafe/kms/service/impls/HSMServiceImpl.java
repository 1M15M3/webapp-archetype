package com.ftsafe.kms.service.impls;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ftsafe.kms.dao.HSMKeyMapper;
import com.ftsafe.kms.dao.KYHSMKeyMapper;
import com.ftsafe.kms.dao.WSTHSMKeyMapper;
import com.ftsafe.kms.pojo.KYHSMKey;
import com.ftsafe.kms.pojo.WSTHSMKey;
import com.ftsafe.kms.service.HSMService;

@Service("hsmService")
public class HSMServiceImpl implements HSMService {

	@Resource
	private HSMKeyMapper hsmKeyMapper;
	@Resource
	private KYHSMKeyMapper kyHsmKeyMapper;
	@Resource
	private WSTHSMKeyMapper wstHsmKeyMapper;
	
	@Override
	public String saveKeyToKingArchitecture() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeKeyFromKingArchitecture() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveMasterKeyToKingArchitecture() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveTransportKeyToKingArchitecture() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WSTHSMKey retrieveKeyFromKingArchitecture(String id) {
		// TODO Auto-generated method stub
		return wstHsmKeyMapper.selectByPrimaryKey(id);
	}

	@Override
	public String saveKeyToRacalArchitecture() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeKeyFromRacalArchitecture() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveZoneMasterKeyToRacalArchiteture() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KYHSMKey retrieveKeyFromRacalArchiteture() {
		// TODO Auto-generated method stub
		return null;
	}

}
