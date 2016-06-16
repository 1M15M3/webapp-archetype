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

import com.ftsafe.kms.service.IUserService;

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
	private IUserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public ModelAndView login(final HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("session",request.getRequestedSessionId());
		return new ModelAndView(new MappingJackson2JsonView(), map);
	}
}
