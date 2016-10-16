package com.xws.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xws.entity.User;

/**  
 * @Title: UserController.java
 * @Package com.xws.controller
 * @Description: TODO
 * @author XWS
 * @date 2016-4-23
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	//1.使用model对象传输数据
	@RequestMapping(value="/test1")
	public String test1(HttpServletRequest req,Model model){
		User user = new User();
		user.setId("1");
		user.setName("java1");
		model.addAttribute("user", user);
		return "success";
		//return "redirect:/jsp/success.jsp";
		//return "forward:/jsp/success.jsp";
		//return "redirect:/user/test2.do";
		//return "forward:/user/test2.do";
	}
	//2.使用request、session等传输数据
	@RequestMapping(value="/test2")
	public String test2(HttpServletRequest req){
		User user = new User();
		user.setId("1");
		user.setName("java2");
		req.setAttribute("user", user);
		return "success";
	}
	//3.使用modelAndView对象传输数据
	@RequestMapping(value="/test3")
	public ModelAndView test3(ModelAndView modelAndView){
		User user = new User();
		user.setId("1");
		user.setName("java3");
		modelAndView.setViewName("success");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	//4.使用Map来传输对象
	@RequestMapping(value="/test4")
	public String test4(Map<String,Object> map){
		User user = new User();
		user.setId("1");
		user.setName("java4");
		map.put("user", user);
		return "success";
	}
	
	@RequestMapping(value="/login")
	public String login(HttpSession session,String username,String password){
		session.setAttribute("user", username);
		return "main";
	}
	@RequestMapping(value="/logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:/login.jsp";
	}
}
