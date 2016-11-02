package com.ftpms.emv.cos.service;


import java.util.List;

import com.ftpms.emv.cos.model.EmvFileCos;

/**
 * <p>
 * 
 * @className:EmvFileCosService.java
 * @classDescription:COS管理业务接口类 <p>
 * @createTime:
 * @author:
 */
public interface EmvFileCosService {

	/**
	 * 
	 * <p>
	 * 功能描述：查询总条数
	 * </p>
	 * 
	 * @param emvFileCos
	 * @return
	 */
	int queryByCount(EmvFileCos emvFileCos) throws Exception;

	/**
	 * 
	 * <p>
	 * 功能描述：根据实体删除数据
	 * </p>
	 * 
	 * @param emvFileCos
	 * @return
	 * @throws Exception
	 */
	int deleteByModel(EmvFileCos emvFileCos) throws Exception;

	/**
	 * 根据主键ID删除数据
	 * <p>
	 * 功能描述：
	 * </p>
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	int deleteByPrimaryKey(Integer id) throws Exception;

	/**
	 * 批量删除数据
	 * <p>
	 * 功能描述：批量删除数据
	 * </p>
	 * 
	 * @param ids
	 * @return
	 * @throws Exception
	 */
	int deleteByArray(String[] ids) throws Exception;

	/**
	 * 
	 * <p>
	 * 功能描述：添加数据
	 * </p>
	 * 
	 * @param emvFileCos
	 * @return
	 * @throws Exception
	 */
	int insert(EmvFileCos emvFileCos) throws Exception;

	/**
	 * 
	 * <p>
	 * 功能描述：根据参数查询COS管理列表
	 * </p>
	 * 
	 * @param emvFileCos
	 * @return
	 * @throws Exception
	 */
	List<EmvFileCos> queryByList(EmvFileCos emvFileCos) throws Exception;

	/**
	 * 
	 * <p>
	 * 功能描述：根据主键ID查询COS管理信息
	 * </p>
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	EmvFileCos selectByPrimaryKey(Integer id) throws Exception;

	/**
	 * 
	 * <p>
	 * 功能描述：根据实体更新
	 * </p>
	 * 
	 * @param emvFileCos
	 * @return
	 * @throws Exception
	 */
	int updateBySelective(EmvFileCos emvFileCos) throws Exception;

	/**
	 * <p>
	 * 功能描述：根据主键ID更新数据
	 * </p>
	 * 
	 * @param id
	 * @return int
	 */
	int updateByPrimaryKey(int id) throws Exception;

}
