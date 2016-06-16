/**
* @FileName BaseController.java
* <p>
* @Date 2016年6月16日
* <p>
* 本源码采用Apache许可协议，
* 如有疑问请电邮 qingyuan.ke@foxmail.com。
*/

package com.ftsafe.kms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axis.common.Log;
import com.axis.common.log.LogWrapper;

/**
* <p>
* @className BaseController.java
* @classDescription 
* <p>
* @createTime 2016年6月16日
* @author Qingyuan
*/

@Controller
public class BaseController {
	private static final LogWrapper LOGGER = Log.get();
	
	@RequestMapping(value="/")
	public String index(ModelMap model) {
		LOGGER.info("INDEX");
		model.addAttribute("title", "KMS");
		model.addAttribute("message", "欢迎使用KMS");
		return "index";
	}
	
	@RequestMapping(value="/warning")
	public String warning(ModelMap model) {
		LOGGER.info("WARNING");
		model.addAttribute("title", "warning");
		model.addAttribute("message", "请联系管理员");
		return "warning";
	}
	
	
}
