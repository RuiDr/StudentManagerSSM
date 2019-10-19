package com.ischoolbar.programmer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 系统主页控制器
 * @author MI
 *
 */
@RequestMapping("/system")
@Controller
public class SystemController {
	/**
	 * 表明路径
	 * @return
	 */
	@RequestMapping(value="/index",method=RequestMethod.GET)
    public ModelAndView index(ModelAndView model){
		model.setViewName("helloword");
		model.addObject("user", "猿来如此");
		return model;
	}
    
	@RequestMapping(value="/login",method=RequestMethod.GET)
    public ModelAndView login(ModelAndView model){
		model.setViewName("system/login");
		return model;
	}
    
}
