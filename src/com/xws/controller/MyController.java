package com.xws.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.xws.entity.User;

/**  
 * @Title: MyController.java
 * @Package com.xws.controller
 * @Description: TODO
 * @author XWS
 * @date 2016-4-24
 */
public class MyController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();
		user.setId("2");
		user.setName("wo shi shei");
		modelAndView.addObject("user", user);
		modelAndView.setViewName("success");
		return modelAndView;
	}

}
