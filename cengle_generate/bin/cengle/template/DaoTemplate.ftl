package ${bussPackage}.mapper#if($!entityPackage).${entityPackage}#end;

import java.util.List;

import ${bussPackage}.model#if($!entityPackage).${entityPackage}#end.${className};
/**
 * <p>
 * 
 * @className:${className}Mapper.java
 * @classDescription:${codeName}接口mapper类 <p>
 * @createTime:
 * @author:
 */
public interface ${className}Mapper {

	/**
	 * <p>
	 * 功能描述：查询总条数
	 * </p>
	 * 
	 * @param ${lowerName}
	 * @return int
	 */
	int queryByCount(${className} ${lowerName}) throws Exception;

	/**
	 * <p>
	 * 功能描述：根据实体删除数据
	 * </p>
	 * 
	 * @param ${lowerName}
	 * @return int
	 * @throws Exception
	 */
	int deleteByModel(${className} ${lowerName}) throws Exception;

	/**
	 * 
	 * <p>
	 * 功能描述：根据主键ID删除数据
	 * </p>
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	int deleteByPrimaryKey(Integer id) throws Exception;

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
	int deleteByArray(String[] ids) throws Exception;

	/**
	 * 
	 * <p>
	 * 功能描述：添加数据
	 * </p>
	 * 
	 * @param ${lowerName}
	 * @return
	 * @throws Exception
	 */
	int insert(${className} ${lowerName}) throws Exception;

	/**
	 * 
	 * <p>
	 * 功能描述：根据参数查询${codeName}列表
	 * </p>
	 * 
	 * @param ${lowerName}
	 * @return
	 * @throws Exception
	 */

	List<${className}> queryByList(${className} ${lowerName}) throws Exception;

	/**
	 * 
	 * <p>
	 * 功能描述：根据主键ID查询${codeName}信息
	 * </p>
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	${className} selectByPrimaryKey(Integer id) throws Exception;

	/**
	 * 
	 * <p>
	 * 功能描述：根据参数查询数据
	 * </p>
	 * 
	 * @param ${lowerName}
	 * @return
	 * @throws Exception
	 */
	${className} get${className}ByType(${className} ${lowerName}) throws Exception;

	/**
	 * 
	 * <p>
	 * 功能描述：根据实体更新数据
	 * </p>
	 * 
	 * @param ${lowerName}
	 * @return
	 * @throws Exception
	 */
	int updateBySelective(${className} ${lowerName}) throws Exception;

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
	int updateByPrimaryKey(int id) throws Exception;
}