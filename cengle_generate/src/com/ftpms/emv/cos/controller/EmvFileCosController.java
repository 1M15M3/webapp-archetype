package com.ftpms.emv.cos.controller;

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




import com.ftpms.emv.cos.model.EmvFileCos;
import com.ftpms.emv.cos.service.EmvFileCosService;


/**
 * <p>
 * 
 * @className:EmvFileCosController.java
 * @classDescription:COS管理controller控制层 <p>
 * @createTime:
 * @author:
 */
@Controller
@RequestMapping("emvFileCosController")
public class EmvFileCosController {

	private static Logger logger = Logger.getLogger(EmvFileCosController.class);

	@Autowired
	private EmvFileCosService emvFileCosService;

	/**
	 * <p>
	 * 功能描述：查询数据列表
	 * </p>
	 * 
	 * @param emvFileCos
	 * @return Map<String, Object>
	 */
	@ResponseBody
	@RequestMapping("listEmvFileCos")
	public Map<String, Object> listEmvFileCos(HttpServletRequest request,
			EmvFileCos emvFileCos) {
		// 接收返回数据消息
		try {
			Map<String, Object> resultMap = new HashMap<String, Object>();
			int page = request.getParameter("page") == null ? 1 : Integer
					.valueOf(request.getParameter("page"));
			if (page < 1)
				page = 1;
			int pageSize = request.getParameter("pagesize") == null ? 10
					: Integer.valueOf(request.getParameter("pagesize"));
			emvFileCos.setPageSize(pageSize);
			emvFileCos.setCurrentPage(page);
			int total = emvFileCosService.queryByCount(emvFileCos);// 总条数
			if (total > 0) {
				emvFileCos.setTotalCount(total);// 总条数
				List<EmvFileCos> list = emvFileCosService.queryByList(emvFileCos);// 查询具体数据
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
	 * 功能描述：添加COS管理信息
	 * </p>
	 * 
	 * @param emvFileCos
	 * @return Map<String, Object> status: success 成功； exist 已存在； error 失败；
	 */
	@ResponseBody
	@RequestMapping("addEmvFileCos")
	public Map<String, Object> addEmvFileCos(EmvFileCos emvFileCos) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		String status = "error";
		String message = "";
		try {

			// 从session中获取createUserid，此处预留
			// emvFileCos.setCreateUserid(createUserid);

			// 验证该配置类型是否存在
			EmvFileCos objPara = new EmvFileCos();
			objPara.setClassName(emvFileCos.getClassName());
			objPara.setMethodNameEN(emvFileCos.getMethodNameEN());
			objPara.setIsExact("true");
			List<EmvFileCos> existEmvFileCos = emvFileCosService.queryByList(objPara);
			if(existEmvFileCos !=null && existEmvFileCos.size() > 0){
				status = "exist";
				message = "全路径类名和方法英文名，两者的组合不能重复，请修改后重新提交。";
			}else{
				// 不存在的话继续往数据库中添加
				// 设置时间
				emvFileCos.setCreateDate(new Date());
				int result = emvFileCosService.insert(emvFileCos);
				if (result == 1) {
					status = "success";
				}	
			}
			resultMap.put("message", message);
			resultMap.put("status", status);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("添加COS管理失败！");
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
	@RequestMapping("delEmvFileCos")
	public Map<String, Object> delEmvFileCos(String idStr) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		String status = "error";
		try {
			if (StringUtils.isNotEmpty(idStr)) {
				// 将ID字符串分割转换成数组
				String[] idsArray = idStr.split(",");

				// 此处预留接口，删除配置时验证时候有配置明细信息，如果有的不允许删除，相反则继续操作。
				int result = emvFileCosService.deleteByArray(idsArray);
				if (result > 0) {
					status = "success";
				}
			}
			resultMap.put("status", status);
		} catch (Exception e) {
			logger.error("删除COS管理失败！");
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
	@RequestMapping("queryEmvFileCos")
	public String queryEmvFileCos(ModelMap map,String type, int primaryKeyId) {
		String status = "error";
		try {
			if (primaryKeyId != 0) {
				// 获取对象数据
				EmvFileCos emvFileCos = emvFileCosService.selectByPrimaryKey(primaryKeyId);
				if (emvFileCos != null) {
					map.put("emvFileCos", emvFileCos);
					status = "success";
				}
				map.put("status", status);
				if(StringUtils.isNotEmpty(type)){
					if("view".equals(type)){
						return "/pages/emv/file/viewEmvFileCos";
					}else if("update".equals(type)){
						return "/pages/emv/file/updateEmvFileCos";
					}
				}
			}
			map.put("status", status);
		} catch (Exception e) {
			logger.error("获取COS管理信息失败！");
			logger.error("错误信息：", e);
			throw new RuntimeException("获取COS管理信息失败！");
		}
		return null;
	}

	/**
	 * <p>
	 * 功能描述：修改数据
	 * </p>
	 * 
	 * @param emvFileCos
	 * @return Map<String, Object> status: success 成功； exist 已存在； error 失败；
	 */
	@ResponseBody
	@RequestMapping("updateEmvFileCos")
	public Map<String, Object> updateEmvFileCos(EmvFileCos emvFileCos) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		String status = "error";
		String message = "";
		try {
			if (emvFileCos != null) {
				// 验证要修改的数据是否有重复
				EmvFileCos objPara = new EmvFileCos();
				objPara.setClassName(emvFileCos.getClassName());
				objPara.setMethodNameEN(emvFileCos.getMethodNameEN());
				objPara.setIsExact("true");
				List<EmvFileCos> list = emvFileCosService.queryByList(objPara);
				if(list.size() > 1){//说明存在多个
					status = "exist";
					message = "全路径类名和方法英文名，两者的组合不能重复，请修改后重新提交。";
				}else if(list.size() == 1){//说明只有一个
					EmvFileCos obj = list.get(0);
					if(obj.getId()==emvFileCos.getId()){//说明编辑的为同一个，可继续执行
						int result = emvFileCosService.updateBySelective(emvFileCos);
						if (result == 1) {
							status = "success";
						}
					}else{
						status = "exist";
						message = "全路径类名和方法英文名，两者的组合不能重复，请修改后重新提交。";
					}
				}else{//说明不存在，可以继续执行
					int result = emvFileCosService.updateBySelective(emvFileCos);
					if (result == 1) {
						status = "success";
					}
				}
			}
			resultMap.put("message", message);
			resultMap.put("status", status);
		} catch (Exception e) {
			logger.error("更新COS管理信息失败！");
			logger.error("错误信息", e);
		}
		return resultMap;
	}
}
