package com.xws.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xws.entity.Student;

/**  
 * @Title: StudentController.java
 * @Package com.xws.controller
 * @Description: TODO
 * @author XWS
 * @date 2016-4-24
 */
@Controller
@RequestMapping("/student")
public class StudentController {
	public List<Student> list =new ArrayList<Student>();
	public StudentController(){
		for(int i=0;i<30;i++){
			Student s = new Student();
			s.setId(i);
			s.setName("name"+i);
			s.setSex("ÄÐ");
			s.setHobby("°®ºÃ"+i);
			list.add(s);
		}
	}
	@RequestMapping("/getList")
	public String getList(HttpServletRequest request){
		request.setAttribute("student", list);
		return "forward:/main.jsp";
	}
	@RequestMapping("/delete.do")
	public String delete(HttpServletRequest request,int id){
		Student student=null;
		for(Student s:list){
			if(s.getId()==id){
				student=s;
			}
		}
		list.remove(student);
		request.setAttribute("student", list);
		return "forward:/main.jsp";
	}
}
