package com.ftsafe.kms.pojo;

public class WSTHSMKey {
    private String hId;

    private String hKeyName;

    private String hKeyVal;

    private String hKeyFlag;

    private String hKeyUsage;

    private String hKeyAttr;

    private String hUpdateDate;

    public String gethId() {
        return hId;
    }

    public void sethId(String hId) {
        this.hId = hId == null ? null : hId.trim();
    }

    public String gethKeyName() {
        return hKeyName;
    }

    public void sethKeyName(String hKeyName) {
        this.hKeyName = hKeyName == null ? null : hKeyName.trim();
    }

    public String gethKeyVal() {
        return hKeyVal;
    }

    public void sethKeyVal(String hKeyVal) {
        this.hKeyVal = hKeyVal == null ? null : hKeyVal.trim();
    }

    public String gethKeyFlag() {
        return hKeyFlag;
    }

    public void sethKeyFlag(String hKeyFlag) {
        this.hKeyFlag = hKeyFlag == null ? null : hKeyFlag.trim();
    }

    public String gethKeyUsage() {
        return hKeyUsage;
    }

    public void sethKeyUsage(String hKeyUsage) {
        this.hKeyUsage = hKeyUsage == null ? null : hKeyUsage.trim();
    }

    public String gethKeyAttr() {
        return hKeyAttr;
    }

    public void sethKeyAttr(String hKeyAttr) {
        this.hKeyAttr = hKeyAttr == null ? null : hKeyAttr.trim();
    }

    public String gethUpdateDate() {
        return hUpdateDate;
    }

    public void sethUpdateDate(String hUpdateDate) {
        this.hUpdateDate = hUpdateDate == null ? null : hUpdateDate.trim();
    }
}