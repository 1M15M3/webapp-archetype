# MySQL-Front 5.0  (Build 1.0)

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;


# Host: localhost    Database: key_system
# ------------------------------------------------------
# Server version 5.0.96-community-nt

#
# Table structure for table t_hrsak
#

DROP TABLE IF EXISTS `t_hrsak`;
CREATE TABLE `t_hrsak` (
  `h_id` varchar(4) NOT NULL default '' COMMENT '加密机内密钥索引',
  `h_key_name` varchar(100) default NULL COMMENT '密钥名称',
  `h_key_val` varchar(8000) default NULL COMMENT '密钥密文值',
  `h_key_flag` varchar(2) default NULL COMMENT '密钥类型',
  `h_key_usage` varchar(30) default NULL COMMENT '密钥用途',
  `h_key_attr` varchar(30) default NULL COMMENT '密钥属性',
  `h_update_date` varchar(40) default NULL COMMENT '密钥更新时间',
  PRIMARY KEY  (`h_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='加密机RSA密钥';
/*!40000 ALTER TABLE `t_hrsak` ENABLE KEYS */;
UNLOCK TABLES;

#
# Table structure for table t_hsm_key
#

DROP TABLE IF EXISTS `t_hsm_key`;
CREATE TABLE `t_hsm_key` (
  `h_key_id` varchar(4) NOT NULL default '' COMMENT '密钥索引',
  `h_key_name` varchar(100) default NULL COMMENT '主密钥名称',
  `h_key_type` varchar(2) NOT NULL default '' COMMENT '密钥类型',
  `h_key_all_factor` varchar(255) default NULL COMMENT '密文主密钥（32*N）',
  `h_key_flag` varchar(2) default NULL COMMENT '主密钥状态标示',
  `h_key_update_date` varchar(40) default NULL COMMENT '更新时间',
  PRIMARY KEY  (`h_key_type`,`h_key_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='加密机主密钥';
/*!40000 ALTER TABLE `t_hsm_key` ENABLE KEYS */;
UNLOCK TABLES;

#
# Table structure for table t_hsmk
#

DROP TABLE IF EXISTS `t_hsmk`;
CREATE TABLE `t_hsmk` (
  `h_id` varchar(4) NOT NULL default '' COMMENT '加密机内密钥索引',
  `h_key_name` varchar(100) default NULL COMMENT '密钥名称',
  `h_key_val` varchar(200) default NULL COMMENT '密钥密文值',
  `h_key_flag` varchar(2) default NULL COMMENT '密钥类型',
  `h_key_usage` varchar(30) default NULL COMMENT '密钥用途',
  `h_key_attr` varchar(30) default NULL COMMENT '密钥属性',
  `h_update_date` varchar(40) default NULL COMMENT '密钥更新时间',
  PRIMARY KEY  (`h_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='加密机次主密钥';
/*!40000 ALTER TABLE `t_hsmk` ENABLE KEYS */;
UNLOCK TABLES;

#
# Table structure for table t_key_attr
#

DROP TABLE IF EXISTS `t_key_attr`;
CREATE TABLE `t_key_attr` (
  `Id` int(11) NOT NULL auto_increment,
  `type` varchar(20) default NULL COMMENT '密钥属性',
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='密钥属性';
INSERT INTO `t_key_attr` VALUES (1,'Sensitive');
INSERT INTO `t_key_attr` VALUES (2,'Modifiable');
INSERT INTO `t_key_attr` VALUES (3,'Private');
INSERT INTO `t_key_attr` VALUES (4,'Extracable');
INSERT INTO `t_key_attr` VALUES (5,'Exportable');
INSERT INTO `t_key_attr` VALUES (6,'Trusted');
INSERT INTO `t_key_attr` VALUES (7,'Wrap w/trusted');
INSERT INTO `t_key_attr` VALUES (8,'Unwrap Mask');
INSERT INTO `t_key_attr` VALUES (9,'Derive Mask');
INSERT INTO `t_key_attr` VALUES (10,'Deletable');
/*!40000 ALTER TABLE `t_key_attr` ENABLE KEYS */;
UNLOCK TABLES;

#
# Table structure for table t_key_info
#

DROP TABLE IF EXISTS `t_key_info`;
CREATE TABLE `t_key_info` (
  `CLIENT_ID` char(8) NOT NULL,
  `KEY_ID` char(4) NOT NULL,
  `KEY_DESC` varchar(40) NOT NULL,
  `KEY_VAL` varchar(33) default NULL,
  `KEY_DATE` char(8) NOT NULL,
  PRIMARY KEY  (`CLIENT_ID`,`KEY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40000 ALTER TABLE `t_key_info` ENABLE KEYS */;
UNLOCK TABLES;

#
# Table structure for table t_key_type
#

DROP TABLE IF EXISTS `t_key_type`;
CREATE TABLE `t_key_type` (
  `key_type` varchar(2) NOT NULL default '' COMMENT '密钥类型编号',
  `key_name` varchar(255) default NULL COMMENT '密钥名称',
  PRIMARY KEY  (`key_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='密钥类型';
INSERT INTO `t_key_type` VALUES ('01','本地主密钥');
INSERT INTO `t_key_type` VALUES ('02','传输主密钥');
INSERT INTO `t_key_type` VALUES ('03','主密钥');
INSERT INTO `t_key_type` VALUES ('04','次主密钥');
INSERT INTO `t_key_type` VALUES ('05','RSA密钥');
/*!40000 ALTER TABLE `t_key_type` ENABLE KEYS */;
UNLOCK TABLES;

#
# Table structure for table t_key_usage
#

DROP TABLE IF EXISTS `t_key_usage`;
CREATE TABLE `t_key_usage` (
  `Id` int(11) NOT NULL auto_increment,
  `type` varchar(20) default NULL,
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='密钥用途';
INSERT INTO `t_key_usage` VALUES (1,'Encrypt');
INSERT INTO `t_key_usage` VALUES (2,'Sign');
INSERT INTO `t_key_usage` VALUES (3,'Wrap');
INSERT INTO `t_key_usage` VALUES (4,'Export');
INSERT INTO `t_key_usage` VALUES (5,'Derive');
INSERT INTO `t_key_usage` VALUES (6,'Dncrypt');
INSERT INTO `t_key_usage` VALUES (7,'Verify');
INSERT INTO `t_key_usage` VALUES (8,'Unwrap');
INSERT INTO `t_key_usage` VALUES (9,'Import');
/*!40000 ALTER TABLE `t_key_usage` ENABLE KEYS */;
UNLOCK TABLES;

#
# Table structure for table t_oper
#

DROP TABLE IF EXISTS `t_oper`;
CREATE TABLE `t_oper` (
  `oper_id` varchar(20) NOT NULL default '' COMMENT '操作员ID',
  `oper_name` varchar(40) default NULL COMMENT '操作员姓名',
  `oper_pwd` varchar(64) NOT NULL default '' COMMENT '操作员密码',
  `pass_err_times` int(1) default NULL COMMENT '错误登陆次数（超过3次将会锁定此账号）',
  `oper_type` char(1) default NULL COMMENT '操作员级别',
  `oper_flag` char(1) default '1' COMMENT '账户状态',
  `oper_email` varchar(255) default NULL COMMENT '操作员邮箱',
  PRIMARY KEY  (`oper_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `t_oper` VALUES ('admin','管理','FF9858A6ABD2B9C8ACEBA1FC442B120C',0,'1','1','wenguang@ftsafe.com');
/*!40000 ALTER TABLE `t_oper` ENABLE KEYS */;
UNLOCK TABLES;

#
# Table structure for table t_oper_type
#

DROP TABLE IF EXISTS `t_oper_type`;
CREATE TABLE `t_oper_type` (
  `oper_type` char(1) NOT NULL default '',
  `oper_desc` varchar(20) default NULL,
  PRIMARY KEY  (`oper_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `t_oper_type` VALUES ('0','系统管理员');
INSERT INTO `t_oper_type` VALUES ('1','密钥管理用户');
INSERT INTO `t_oper_type` VALUES ('2','密钥普通用户');
/*!40000 ALTER TABLE `t_oper_type` ENABLE KEYS */;
UNLOCK TABLES;

#
# Table structure for table t_sys_log
#

DROP TABLE IF EXISTS `t_sys_log`;
CREATE TABLE `t_sys_log` (
  `Id` int(11) NOT NULL auto_increment,
  `l_oper` varchar(20) default NULL COMMENT '用户',
  `l_type` varchar(10) default NULL COMMENT '日志类型',
  `l_content` varchar(255) default NULL COMMENT '日志内容',
  `l_date` varchar(50) default NULL COMMENT '日志时间',
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=181 DEFAULT CHARSET=utf8 COMMENT='系统日志';
/*!40000 ALTER TABLE `t_sys_log` ENABLE KEYS */;
UNLOCK TABLES;

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
