/**
* @FileName AdminController.java
* <p>
* @Date 2016年6月16日
* <p>
* 本源码采用Apache许可协议，
* 如有疑问请电邮 qingyuan.ke@foxmail.com。
*/

package com.ftsafe.kms.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.axis.common.JacksonUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.ftsafe.kms.pojo.WSTHSMKey;
import com.ftsafe.kms.service.HSMService;
import com.ftsafe.kms.service.UserService;

/**
* <p>
* @className AdminController.java
* @classDescription 
* <p>
* @createTime 2016年6月16日
* @author Qingyuan
*/

@Controller
@RequestMapping("/admin")
public class AdminController{
	
	@Resource
	private UserService userService;
	@Resource
	private HSMService hsmService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public ModelAndView login(final HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("session",request.getRequestedSessionId());
		return new ModelAndView(new MappingJackson2JsonView(), map);
	}
	
	@RequestMapping(value = "/a", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public ModelAndView a(final HttpServletRequest request) {
		String id = "0004";
		Map<String, Object> map = new HashMap<String, Object>();
		String json = null;
		try {
			WSTHSMKey wst = hsmService.retrieveKeyFromKingArchitecture(id);
			json = JacksonUtil.toJson(wst);
			map.put("data",json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView(new MappingJackson2JsonView(), map);
	}
}
