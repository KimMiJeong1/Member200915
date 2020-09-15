package com.eb.member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eb.member.dto.MemberVO;
import com.eb.member.service.MemberService;

@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired
	MemberService memberService;
	
	@GetMapping("/member/list")
	public String memberList(Model model) {
		model.addAttribute("members", memberService.memberList());
		logger.info("/member/list 호출");
		return "memberList";
	}
	
	@GetMapping("/member/register")
	public String memberRegister(Model model) {
		logger.info("/member/register 호출");
		return "memberRegisterGet";
	}
	
	@PostMapping("/member/register")
	public String memberRegister(MemberVO memberVO, Model model) {
		logger.info("/member/registerPost 호출");
		memberService.memberRegister(memberVO);
		model.addAttribute("name", memberVO.getMname());
		return "memberRegisterPost";
	}
	
	@GetMapping("/member/update")
	public String memberGetOne(@RequestParam("mno") int mno, Model model) {
		logger.info("/member/updateGet 호출");
		logger.info("사용자가 수정하려는 값" + mno);
		model.addAttribute("member",memberService.memberGetOne(mno));
		return "memberUpdateGet";
		
	}
	
	@PostMapping("/member/update")
	public String memberUpdate(MemberVO memberVO, Model model) {
		logger.info("/member/updatePost 호출");
		memberService.memberUpdate(memberVO);
		model.addAttribute("name", memberVO.getMname());
		return "memberUpdatePost";
	}
	
	@GetMapping("/member/delete")
	public String memberDeleteGet(@RequestParam("mno") int mno, Model model) {
		logger.info("/member/deleteGet 호출");
		logger.info("삭제하려는 값"+mno);
		model.addAttribute("mno",mno);
		return "memberDeleteGet";
	}
	
	@PostMapping("/member/delete")
	public String memberDeletePost(@RequestParam("mno") int mno, Model model) {
		logger.info("/member/deletePost 호출");
		logger.info("삭제하려는 값2"+mno);
		memberService.memberDeleteGet(mno);
		return "memberDeletePost";
	}
	
	
}
