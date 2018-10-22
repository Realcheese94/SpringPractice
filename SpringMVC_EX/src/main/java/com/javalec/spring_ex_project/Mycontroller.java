package com.javalec.spring_ex_project;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class Mycontroller {

	@RequestMapping("/info")
	public String CustomView1(Model model) {
		model.addAttribute("id","abcd");
		return "/board/info";
	}
	
	@RequestMapping("/myinfo")
	public ModelAndView myModelView(){
	ModelAndView mv = new ModelAndView();
	mv.addObject("id","michal123");
	mv.setViewName("/board/myinfo");
	return mv;
	}
	
	@RequestMapping("/conformIDPW")
	public String confirmIDPW(HttpServletRequest httpservletrequest,Model model) {
		String id = httpservletrequest.getParameter("id");
		String pw = httpservletrequest.getParameter("pw");
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "/board/conformIDPW";
	}
	
	@RequestMapping("/checkInfo")
	public String checkInfo(@RequestParam("id") String id,@RequestParam("pw") int pw , Model model) {
		model.addAttribute("id",id);
		model.addAttribute("pw",pw);
		
		return "/board/checkInfo";
	}
	
	@RequestMapping("/practice")
	public String practice(@RequestParam("name") String name, @RequestParam("info") String info, Model model) {
		
		model.addAttribute("name",name );
		model.addAttribute("info",info);
		return "/board/practice";
	}
	
	
	
}
