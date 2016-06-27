package com.ftsafe.kms.pojo;

public class HSMKeyKey {
    private String hKeyType;

    private String hKeyId;

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