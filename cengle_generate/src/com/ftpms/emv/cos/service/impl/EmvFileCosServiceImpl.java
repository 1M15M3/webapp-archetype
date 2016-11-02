package com.ftpms.emv.cos.service.impl;

import java.util.List;
import org.apache.log4j.Logger;

import com.ftpms.emv.cos.model.EmvFileCos;
import com.ftpms.emv.cos.mapper.EmvFileCosMapper;
import com.ftpms.emv.cos.service.EmvFileCosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * COS管理
 * @className:EmvFileCosServiceImpl.java
 * @classDescription:COS管理业务接口实现类 <p>
 * @createTime:
 * @author:
 */
@Service("emvFileCosService")
public class EmvFileCosServiceImpl implements EmvFileCosService {
   private final static Logger log= Logger.getLogger(EmvFileCosServiceImpl.class);
	
	@Autowired
	private EmvFileCosMapper emvFileCosMapper;

	/**
	 * 
	 * <p>
	 * 功能描述：查询总条数
	 * </p>
	 * 
	 * @param emvFileCos
	 * @return
	 */
	public int queryByCount(EmvFileCos emvFileCos) throws Exception {
		return emvFileCosMapper.queryByCount(emvFileCos);
	}

	/**
	 * <p>
	 * 功能描述：根据实体参数删除数据
	 * </p>
	 * 
	 * @param example
	 * @return int
	 */
	@Override
	public int deleteByModel(EmvFileCos emvFileCos) throws Exception {
		int result = emvFileCosMapper.deleteByModel(emvFileCos);
		return result;
	}

	/**
	 * <p>
	 * 功能描述：根据主键ID删除数据
	 * </p>
	 * 
	 * @param id
	 * @return int
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) throws Exception {
		int result = emvFileCosMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	 * <p>
	 * 功能描述：添加数据
	 * </p>
	 * 
	 * @param emvFileCos
	 * @return int
	 */
	@Override
	public int insert(EmvFileCos emvFileCos) throws Exception {
		int result = emvFileCosMapper.insert(emvFileCos);
		return result;
	}

	/**
	 * <p>
	 * 功能描述：根据实体参数查询信息列表
	 * </p>
	 * 
	 * @param emvFileCos
	 * @return List<EmvFileCosDetailModel>
	 */
	@Override
	public List<EmvFileCos> queryByList(EmvFileCos emvFileCos) throws Exception {
		List<EmvFileCos> list = emvFileCosMapper.queryByList(emvFileCos);
		return list;
	}

	/**
	 * <p>
	 * 功能描述：根据主键ID查询数据
	 * </p>
	 * 
	 * @param id
	 * @return EmvFileCosDetailModel
	 */
	@Override
	public EmvFileCos selectByPrimaryKey(Integer id) throws Exception {
		EmvFileCos emvFileCosModel = emvFileCosMapper.selectByPrimaryKey(id);
		return emvFileCosModel;
	}

	/**
	 * <p>
	 * 功能描述：根据实体进行更新
	 * </p>
	 * 
	 * @param record
	 * @param example
	 * @return int
	 */
	@Override
	public int updateBySelective(EmvFileCos emvFileCos) throws Exception {
		int result = emvFileCosMapper.updateBySelective(emvFileCos);
		return result;
	}

	/**
	 * 
	 * <p>
	 * 功能描述：根据主键ID更新数据
	 * </p>
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updateByPrimaryKey(int id) throws Exception {
		int result = emvFileCosMapper.updateByPrimaryKey(id);
		return result;
	}

	/**
	 * 
	 * <p>
	 * 功能描述：批量删除数据
	 * </p>
	 * 
	 * @param ids
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deleteByArray(String[] ids) throws Exception {
		int result = emvFileCosMapper.deleteByArray(ids);
		return result;
	}

}

