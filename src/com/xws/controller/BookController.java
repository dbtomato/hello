package com.xws.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xws.entity.Book;

/**  
 * @Title: BookController.java
 * @Package com.xws.controller
 * @Description: TODO
 * @author XWS
 * @date 2016-4-23
 */
@RequestMapping("/book")
@Controller
public class BookController {
	@RequestMapping("/test1")
	public String test1(HttpServletRequest req){
		String id = req.getParameter("id");
		System.out.println(id);
		return null;
	}
	@RequestMapping("/test2")
	public String test2(String id,String name){
		System.out.println(id);
		System.out.println(name);
		return null;
		
	}
	@RequestMapping("/test3")
	public String test3(Book book){
		System.out.println(book);
		return null;
	}
	@RequestMapping("/test4")
	public String test3(@RequestParam(value="hhh") String id){
		System.out.println(id);
		return null;
	}
	@RequestMapping("/{id}/{name}/test5")
	public String test4(@PathVariable(value="id") String id,@PathVariable(value="name") String name){
		System.out.println(id);
		System.out.println(name);
		return null;
	}
}
