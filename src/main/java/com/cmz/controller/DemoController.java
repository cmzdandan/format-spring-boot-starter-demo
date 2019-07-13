package com.cmz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cmz.pojo.User;
import com.cmz.starter.FormatTemplate;

/**
 * @author chen.mz
 * @email 1034667543@qq.com
 * @create 2019年7月13日 下午5:12:17
 * @description controller层
 */
@Controller
@RequestMapping(value = "/demo")
public class DemoController {

	@Autowired
	private FormatTemplate formatTemplate;
	
	@ResponseBody
	@RequestMapping("/format")
	public String format() {
		User user = new User();
		user.setAge(18);
		user.setName("cmz");
		user.setSex(true);
		return formatTemplate.doFormat(user);
	}
	
}
