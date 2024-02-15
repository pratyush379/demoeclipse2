package com.pratyush.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller//so that spring know that it is something thast handle web request
public class HelloController {

//	@RequestMapping("/hello")
//	public void sayHello() {
//		System.out.println("hello");	}
	
	@RequestMapping("/hello")
	@ResponseBody //by default spring mvc want a view hence without it we will get error
	public String sayHello() {
		return "hello";	}
	
	@RequestMapping("/hello-html")
	@ResponseBody
	public String sayHelloHtml() {
	StringBuffer sb = new StringBuffer();
	sb.append("<html>");
	sb.append("<body>");
	sb.append("hello there");
	sb.append("</body>");
	sb.append("</html>");
//	sb.append("<html>");
//	sb.append("<html>");
//	sb.append("<html>");
	
	return sb.toString();
	
	}
	
	
}
