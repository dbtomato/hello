package com.xws.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.xws.entity.Wizard;

/**  
 * @Title: myWrizardFormController.java
 * @Package com.xws.controller
 * @Description: TODO
 * @author XWS
 * @date 2016-4-24
 */
@SuppressWarnings("deprecation")
public class myWizardFormController extends AbstractWizardFormController{


	@Override
	protected ModelAndView processCancel(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		String msg="用户取消的操作";
		return new ModelAndView("cancle","msg",msg);
	}

	public myWizardFormController() {
		this.setCommandClass(Wizard.class);
		this.setCommandName("w");
	}

	@Override
	protected ModelAndView processFinish(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, BindException arg3)
			throws Exception {
		Wizard w = (Wizard)arg2;
		System.out.println(w);
		return null;
	}

}
