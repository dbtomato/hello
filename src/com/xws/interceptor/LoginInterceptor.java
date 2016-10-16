package com.xws.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**  
 * @Title: LoginInterceptor.java
 * @Package com.xws.interceptor
 * @Description: TODO
 * @author XWS
 * @date 2016-4-24
 */
public class LoginInterceptor implements HandlerInterceptor{

	
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		
	}

	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		String url = arg0.getRequestURI();
		//如果是请求登录，则放行
		if(url.indexOf("login.do")>=0){
			return true;
		}
		//不是请求登录
		HttpSession session = arg0.getSession();
		String user = (String) session.getAttribute("user");
		if(user!=null){
			return true;
		}
		//需要身份认证
		arg0.getRequestDispatcher("/login.jsp").forward(arg0, arg1);
		return false;
	}

}
