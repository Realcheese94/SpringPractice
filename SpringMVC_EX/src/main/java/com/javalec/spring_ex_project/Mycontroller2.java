package com.javalec.spring_ex_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.spring_ex_Objects.Member;

@Controller
@RequestMapping("/member")
public class Mycontroller2 {

	@RequestMapping("/join")
	public String JoinMember(Member member) {
		
		return "/member/join";
	}
}
