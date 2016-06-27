package com.ftsafe.kms.pojo;

public class HSMKey extends HSMKeyKey {
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
}