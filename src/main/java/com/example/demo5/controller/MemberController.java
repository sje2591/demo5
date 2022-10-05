package com.example.demo5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo5.dto.MemberDTO;
import com.example.demo5.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	MemberService memberService;
	@RequestMapping("/")
	public ModelAndView main() {
		ModelAndView mv=new ModelAndView("/main");
		return mv;
	}
	@RequestMapping("/member/list")
	public ModelAndView memberlist() {
		ModelAndView mv=new ModelAndView("/member/list");
		List<MemberDTO> list=memberService.selectMemberlist();
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping("/member/detail")
	public ModelAndView memberdetail(
			@RequestParam String id
			) {
		ModelAndView mv=new ModelAndView("/member/detail");
		MemberDTO member=memberService.selectMemberDetail(id);
		mv.addObject("member", member);
		return mv;
	}
	@RequestMapping("/member/delete")
	public ModelAndView delete(
			@RequestParam String id
			) {
		memberService.deleteMember(id);
		ModelAndView mv=new ModelAndView("/member/list");
		List<MemberDTO> list=memberService.selectMemberlist();
		mv.addObject("list", list);

		return mv;
	}
}
