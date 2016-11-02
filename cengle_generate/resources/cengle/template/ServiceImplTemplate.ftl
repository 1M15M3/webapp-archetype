package ${bussPackage}.service.impl#if($!entityPackage).${entityPackage}#end;

import java.util.List;
import org.apache.log4j.Logger;

import ${bussPackage}.model#if($!entityPackage).${entityPackage}#end.${className};
import ${bussPackage}.mapper#if($!entityPackage).${entityPackage}#end.${className}Mapper;
import ${bussPackage}.service#if($!entityPackage).${entityPackage}#end.${className}Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * ${codeName}
 * @className:${className}ServiceImpl.java
 * @classDescription:${codeName}业务接口实现类 <p>
 * @createTime:
 * @author:
 */
@Service("${lowerName}Service")
public class ${className}ServiceImpl implements ${className}Service {
   private final static Logger log= Logger.getLogger(${className}ServiceImpl.class);
	
	@Autowired
	private ${className}Mapper ${lowerName}Mapper;

	/**
	 * 
	 * <p>
	 * 功能描述：查询总条数
	 * </p>
	 * 
	 * @param ${lowerName}
	 * @return
	 */
	public int queryByCount(${className} ${lowerName}) throws Exception {
		return ${lowerName}Mapper.queryByCount(${lowerName});
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
	public int deleteByModel(${className} ${lowerName}) throws Exception {
		int result = ${lowerName}Mapper.deleteByModel(${lowerName});
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
		int result = ${lowerName}Mapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	 * <p>
	 * 功能描述：添加数据
	 * </p>
	 * 
	 * @param ${lowerName}
	 * @return int
	 */
	@Override
	public int insert(${className} ${lowerName}) throws Exception {
		int result = ${lowerName}Mapper.insert(${lowerName});
		return result;
	}

	/**
	 * <p>
	 * 功能描述：根据实体参数查询信息列表
	 * </p>
	 * 
	 * @param ${lowerName}
	 * @return List<${className}DetailModel>
	 */
	@Override
	public List<${className}> queryByList(${className} ${lowerName}) throws Exception {
		List<${className}> list = ${lowerName}Mapper.queryByList(${lowerName});
		return list;
	}

	/**
	 * <p>
	 * 功能描述：根据主键ID查询数据
	 * </p>
	 * 
	 * @param id
	 * @return ${className}DetailModel
	 */
	@Override
	public ${className} selectByPrimaryKey(Integer id) throws Exception {
		${className} ${lowerName}Model = ${lowerName}Mapper.selectByPrimaryKey(id);
		return ${lowerName}Model;
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
	public int updateBySelective(${className} ${lowerName}) throws Exception {
		int result = ${lowerName}Mapper.updateBySelective(${lowerName});
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
		int result = ${lowerName}Mapper.updateByPrimaryKey(id);
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
		int result = ${lowerName}Mapper.deleteByArray(ids);
		return result;
	}

}

