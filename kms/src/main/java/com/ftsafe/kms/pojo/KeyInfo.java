package com.ftsafe.kms.pojo;

public class KeyInfo {
	private String clientId;

	private String keyId;

	private String keyDesc;

	private String keyVal;

	private String keyDate;

	public String getKeyDesc() {
		return keyDesc;
	}

	public void setKeyDesc(String keyDesc) {
		this.keyDesc = keyDesc == null ? null : keyDesc.trim();
	}

	public String getKeyVal() {
		return keyVal;
	}

	public void setKeyVal(String keyVal) {
		this.keyVal = keyVal == null ? null : keyVal.trim();
	}

	public String getKeyDate() {
		return keyDate;
	}

	public void setKeyDate(String keyDate) {
		this.keyDate = keyDate == null ? null : keyDate.trim();
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId == null ? null : clientId.trim();
	}

	public String getKeyId() {
		return keyId;
	}

	public void setKeyId(String keyId) {
		this.keyId = keyId == null ? null : keyId.trim();
	}
}