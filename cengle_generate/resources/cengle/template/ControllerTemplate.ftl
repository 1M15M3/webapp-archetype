package ${bussPackage}.controller#if($!controllerEntityPackage).${controllerEntityPackage}#end;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.commons.lang3.StringUtils;




import ${bussPackage}.model#if($!entityPackage).${entityPackage}#end.${className};
import ${bussPackage}.service#if($!entityPackage).${entityPackage}#end.${className}Service;


/**
 * <p>
 * 
 * @className:${className}Controller.java
 * @classDescription:${codeName}controller控制层 <p>
 * @createTime:
 * @author:
 */
@Controller
@RequestMapping("${lowerName}Controller")
public class ${className}Controller {

	private static Logger logger = Logger.getLogger(${className}Controller.class);

	@Autowired
	private ${className}Service ${lowerName}Service;

	/**
	 * <p>
	 * 功能描述：查询数据列表
	 * </p>
	 * 
	 * @param ${lowerName}
	 * @return Map<String, Object>
	 */
	@ResponseBody
	@RequestMapping("list${className}")
	public Map<String, Object> list${className}(HttpServletRequest request,
			${className} ${lowerName}) {
		// 接收返回数据消息
		try {
			Map<String, Object> resultMap = new HashMap<String, Object>();
			int page = request.getParameter("page") == null ? 1 : Integer
					.valueOf(request.getParameter("page"));
			if (page < 1)
				page = 1;
			int pageSize = request.getParameter("pagesize") == null ? 10
					: Integer.valueOf(request.getParameter("pagesize"));
			${lowerName}.setPageSize(pageSize);
			${lowerName}.setCurrentPage(page);
			int total = ${lowerName}Service.queryByCount(${lowerName});// 总条数
			if (total > 0) {
				${lowerName}.setTotalCount(total);// 总条数
				List<${className}> list = ${lowerName}Service.queryByList(${lowerName});// 查询具体数据
				resultMap.put("Total", total);
				resultMap.put("Rows", list);
			}
			return resultMap;
		} catch (Exception e) {
			logger.error("查询数据失败！");
			logger.error("错误信息：", e);
		}
		return null;
	}

	/**
	 * <p>
	 * 功能描述：添加${codeName}信息
	 * </p>
	 * 
	 * @param ${lowerName}
	 * @return Map<String, Object> status: success 成功； exist 已存在； error 失败；
	 */
	@ResponseBody
	@RequestMapping("add${className}")
	public Map<String, Object> add${className}(${className} ${lowerName}) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		String status = "error";
		String message = "";
		try {

			// 从session中获取createUserid，此处预留
			// ${lowerName}.setCreateUserid(createUserid);

			// 验证该配置类型是否存在
			${className} objPara = new ${className}();
			objPara.setClassName(${lowerName}.getClassName());
			objPara.setMethodNameEN(${lowerName}.getMethodNameEN());
			objPara.setIsExact("true");
			List<${className}> exist${className} = ${lowerName}Service.queryByList(objPara);
			if(exist${className} !=null && exist${className}.size() > 0){
				status = "exist";
				message = "全路径类名和方法英文名，两者的组合不能重复，请修改后重新提交。";
			}else{
				// 不存在的话继续往数据库中添加
				// 设置时间
				${lowerName}.setCreateDate(new Date());
				int result = ${lowerName}Service.insert(${lowerName});
				if (result == 1) {
					status = "success";
				}	
			}
			resultMap.put("message", message);
			resultMap.put("status", status);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("添加${codeName}失败！");
			logger.error("错误信息：", e);
		}
		return resultMap;
	}

	/**
	 * <p>
	 * 功能描述：删除数据
	 * </p>
	 * 
	 * @param idStr
	 * @return Map<String, Object> status: success 成功； exist 已存在； error 失败；
	 */
	@ResponseBody
	@RequestMapping("del${className}")
	public Map<String, Object> del${className}(String idStr) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		String status = "error";
		try {
			if (StringUtils.isNotEmpty(idStr)) {
				// 将ID字符串分割转换成数组
				String[] idsArray = idStr.split(",");

				// 此处预留接口，删除配置时验证时候有配置明细信息，如果有的不允许删除，相反则继续操作。
				int result = ${lowerName}Service.deleteByArray(idsArray);
				if (result > 0) {
					status = "success";
				}
			}
			resultMap.put("status", status);
		} catch (Exception e) {
			logger.error("删除${codeName}失败！");
			logger.error("错误信息：", e);
		}
		return resultMap;
	}

	/**
	 * 
	 *<p>
	 * 功能描述：获取更改或者查看数据
	 *</p>
	 * @param map
	 * @param type
	 * @param primaryKeyId
	 * @return
	 */
	@RequestMapping("query${className}")
	public String query${className}(ModelMap map,String type, int primaryKeyId) {
		String status = "error";
		try {
			if (primaryKeyId != 0) {
				// 获取对象数据
				${className} ${lowerName} = ${lowerName}Service.selectByPrimaryKey(primaryKeyId);
				if (${lowerName} != null) {
					map.put("${lowerName}", ${lowerName});
					status = "success";
				}
				map.put("status", status);
				if(StringUtils.isNotEmpty(type)){
					if("view".equals(type)){
						return "/pages/emv/file/view${className}";
					}else if("update".equals(type)){
						return "/pages/emv/file/update${className}";
					}
				}
			}
			map.put("status", status);
		} catch (Exception e) {
			logger.error("获取${codeName}信息失败！");
			logger.error("错误信息：", e);
			throw new RuntimeException("获取${codeName}信息失败！");
		}
		return null;
	}

	/**
	 * <p>
	 * 功能描述：修改数据
	 * </p>
	 * 
	 * @param ${lowerName}
	 * @return Map<String, Object> status: success 成功； exist 已存在； error 失败；
	 */
	@ResponseBody
	@RequestMapping("update${className}")
	public Map<String, Object> update${className}(${className} ${lowerName}) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		String status = "error";
		String message = "";
		try {
			if (${lowerName} != null) {
				// 验证要修改的数据是否有重复
				${className} objPara = new ${className}();
				objPara.setClassName(${lowerName}.getClassName());
				objPara.setMethodNameEN(${lowerName}.getMethodNameEN());
				objPara.setIsExact("true");
				List<${className}> list = ${lowerName}Service.queryByList(objPara);
				if(list.size() > 1){//说明存在多个
					status = "exist";
					message = "全路径类名和方法英文名，两者的组合不能重复，请修改后重新提交。";
				}else if(list.size() == 1){//说明只有一个
					${className} obj = list.get(0);
					if(obj.getId()==${lowerName}.getId()){//说明编辑的为同一个，可继续执行
						int result = ${lowerName}Service.updateBySelective(${lowerName});
						if (result == 1) {
							status = "success";
						}
					}else{
						status = "exist";
						message = "全路径类名和方法英文名，两者的组合不能重复，请修改后重新提交。";
					}
				}else{//说明不存在，可以继续执行
					int result = ${lowerName}Service.updateBySelective(${lowerName});
					if (result == 1) {
						status = "success";
					}
				}
			}
			resultMap.put("message", message);
			resultMap.put("status", status);
		} catch (Exception e) {
			logger.error("更新${codeName}信息失败！");
			logger.error("错误信息", e);
		}
		return resultMap;
	}
}
