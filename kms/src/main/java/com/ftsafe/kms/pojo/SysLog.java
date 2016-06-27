package com.ftsafe.kms.pojo;

public class SysLog {
    private Integer id;

    private String lOper;

    private String lType;

    private String lContent;

    private String lDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getlOper() {
        return lOper;
    }

    public void setlOper(String lOper) {
        this.lOper = lOper == null ? null : lOper.trim();
    }

    public String getlType() {
        return lType;
    }

    public void setlType(String lType) {
        this.lType = lType == null ? null : lType.trim();
    }

    public String getlContent() {
        return lContent;
    }

    public void setlContent(String lContent) {
        this.lContent = lContent == null ? null : lContent.trim();
    }

    public String getlDate() {
        return lDate;
    }

    public void setlDate(String lDate) {
        this.lDate = lDate == null ? null : lDate.trim();
    }
}