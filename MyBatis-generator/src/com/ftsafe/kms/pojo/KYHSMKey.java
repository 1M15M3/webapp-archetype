package com.ftsafe.kms.pojo;

public class KYHSMKey {
    private Integer hId;

    private String hKeyName;

    private String hKeyVal;

    private String hKeyCv;

    private String hKeyFlag;

    private String hKeyUsage;

    private String hKeyAttr;

    private String hUpdateDate;

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
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

    public String gethKeyCv() {
        return hKeyCv;
    }

    public void sethKeyCv(String hKeyCv) {
        this.hKeyCv = hKeyCv == null ? null : hKeyCv.trim();
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