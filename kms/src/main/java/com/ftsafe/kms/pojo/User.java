package com.ftsafe.kms.pojo;

public class User {
    private String operId;

    private String operName;

    private String operPwd;

    private Integer passErrTimes;

    private String operType;

    private String operFlag;

    private String operEmail;

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId == null ? null : operId.trim();
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName == null ? null : operName.trim();
    }

    public String getOperPwd() {
        return operPwd;
    }

    public void setOperPwd(String operPwd) {
        this.operPwd = operPwd == null ? null : operPwd.trim();
    }

    public Integer getPassErrTimes() {
        return passErrTimes;
    }

    public void setPassErrTimes(Integer passErrTimes) {
        this.passErrTimes = passErrTimes;
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType == null ? null : operType.trim();
    }

    public String getOperFlag() {
        return operFlag;
    }

    public void setOperFlag(String operFlag) {
        this.operFlag = operFlag == null ? null : operFlag.trim();
    }

    public String getOperEmail() {
        return operEmail;
    }

    public void setOperEmail(String operEmail) {
        this.operEmail = operEmail == null ? null : operEmail.trim();
    }
}