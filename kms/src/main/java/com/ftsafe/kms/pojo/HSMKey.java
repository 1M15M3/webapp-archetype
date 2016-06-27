package com.ftsafe.kms.pojo;

public class HSMKey {
	
	private String hKeyType;

	private String hKeyId;
	
	private String hKeyName;

	private String hKeyAllFactor;

	private String hKeyFlag;

	private String hKeyUpdateDate;

	public String gethKeyName() {
		return hKeyName;
	}

	public void sethKeyName(String hKeyName) {
		this.hKeyName = hKeyName == null ? null : hKeyName.trim();
	}

	public String gethKeyAllFactor() {
		return hKeyAllFactor;
	}

	public void sethKeyAllFactor(String hKeyAllFactor) {
		this.hKeyAllFactor = hKeyAllFactor == null ? null : hKeyAllFactor.trim();
	}

	public String gethKeyFlag() {
		return hKeyFlag;
	}

	public void sethKeyFlag(String hKeyFlag) {
		this.hKeyFlag = hKeyFlag == null ? null : hKeyFlag.trim();
	}

	public String gethKeyUpdateDate() {
		return hKeyUpdateDate;
	}

	public void sethKeyUpdateDate(String hKeyUpdateDate) {
		this.hKeyUpdateDate = hKeyUpdateDate == null ? null : hKeyUpdateDate.trim();
	}

	public String gethKeyType() {
		return hKeyType;
	}

	public void sethKeyType(String hKeyType) {
		this.hKeyType = hKeyType == null ? null : hKeyType.trim();
	}

	public String gethKeyId() {
		return hKeyId;
	}

	public void sethKeyId(String hKeyId) {
		this.hKeyId = hKeyId == null ? null : hKeyId.trim();
	}
}