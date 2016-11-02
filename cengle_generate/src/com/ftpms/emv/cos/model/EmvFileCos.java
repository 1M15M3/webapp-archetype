package com.ftpms.emv.cos.model;

import com.ftpms.base.model.BaseModel;

/**
 * COS管理实体类，对应于数据库表emv_file_cos
 * <br>
 * <b>功能：</b>EmvFileCos<br>
 */
public class EmvFileCos extends BaseModel {
	
		private java.lang.Integer id;//自增主键	private java.lang.String cosCode;//cos编号	private java.lang.String cosName;//cos名称	private java.lang.String cosHash;//	private java.lang.String cosFilePath;//cos路径长度	private java.lang.String status;//0,正常；1,停用	private java.lang.String createUserId;//创建人UserId	private java.util.Date createDate;//创建日期	public java.lang.Integer getId() {	    return this.id;	}	public void setId(java.lang.Integer id) {	    this.id=id;	}	public java.lang.String getCosCode() {	    return this.cosCode;	}	public void setCosCode(java.lang.String cosCode) {	    this.cosCode=cosCode;	}	public java.lang.String getCosName() {	    return this.cosName;	}	public void setCosName(java.lang.String cosName) {	    this.cosName=cosName;	}	public java.lang.String getCosHash() {	    return this.cosHash;	}	public void setCosHash(java.lang.String cosHash) {	    this.cosHash=cosHash;	}	public java.lang.String getCosFilePath() {	    return this.cosFilePath;	}	public void setCosFilePath(java.lang.String cosFilePath) {	    this.cosFilePath=cosFilePath;	}	public java.lang.String getStatus() {	    return this.status;	}	public void setStatus(java.lang.String status) {	    this.status=status;	}	public java.lang.String getCreateUserId() {	    return this.createUserId;	}	public void setCreateUserId(java.lang.String createUserId) {	    this.createUserId=createUserId;	}	public java.util.Date getCreateDate() {	    return this.createDate;	}	public void setCreateDate(java.util.Date createDate) {	    this.createDate=createDate;	}
}

