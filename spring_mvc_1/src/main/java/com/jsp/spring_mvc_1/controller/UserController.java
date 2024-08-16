
package com.jsp.spring_mvc_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring_mvc_1.dao.UserDao;
import com.jsp.spring_mvc_1.dto.User;

@Controller
public class UserController {
	@Autowired
	UserDao dao;

	@RequestMapping("/register")
	public ModelAndView registerUser(@ModelAttribute User user) {

		ModelAndView view = new ModelAndView();

		try {
			dao.saveUser(user);
			view.setViewName("login.jsp");
		} catch (Exception e) {
			view.setViewName("register.jsp");
		}
		System.out.println("user");
		return view;

	}

	@RequestMapping("/login")
	public ModelAndView login(@RequestParam String email, @RequestParam String pwd) {
		ModelAndView view = new ModelAndView();
		try {
			User db = dao.fetchbyEmail(email);
			if (db.getPwd().equals(pwd)) {
				view.setViewName("home.jsp");
				view.addObject("user", dao.fetchAllData());

			} else {
				view.setViewName("login.jsp");
				view.addObject("msg", "pwd is wrong enter correct pwd");
			}
		} catch (Exception e) {
			view.setViewName("login.jsp");
			view.addObject("msg", "email is wrong enter correct email");
		}
		return view;

	}
	@RequestMapping("/delete")
		public ModelAndView delete(@RequestParam int id) {
		  ModelAndView view = new ModelAndView("home.jsp");
		  dao.deleteUser(id);
		  view.addObject("user",dao.fetchAllData());
			return view;
	}
	
	@RequestMapping("/update")
	public ModelAndView updateUser(@RequestParam int id) {
		ModelAndView view=new ModelAndView();
		try {
			view.setViewName("update.jsp");
			view.addObject("user",dao.fetchUserById(id));
			
		}catch(Exception e) {
			view.setViewName("login.jsp");
		}
		return view;
	}
	
	@RequestMapping("/update1")
	public ModelAndView updateUser(@ModelAttribute User user) {
		ModelAndView view=new ModelAndView();
		try {
			dao.updateUser(user);
			view.setViewName("home.jsp");
			view.addObject("user",dao.fetchAllData());
		}catch(Exception e) {
			view.setViewName("login.jsp");
		}
		return view;
		
	}
}
	


