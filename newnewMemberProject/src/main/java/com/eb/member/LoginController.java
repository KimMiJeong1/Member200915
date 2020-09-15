package com.eb.member;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eb.member.dto.MemberVO;
import com.eb.member.service.MemberService;

@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	MemberService memberService;
	
	@GetMapping("/auth/login")
	public String loginGet() {
		// 3) 여기서 request에 담아둔거 꺼내서
		// 4) Model에 담고 loginGet에서 꺼내서 client로 보냄
		
		logger.info("auth/login 호출");
		return "auth/loginGet";
	}
	
	@PostMapping("/auth/login")
	public String loginPost(HttpSession session, MemberVO memberVO) {
		// 5) client에 보낸거 input type="hidden"에서 꺼내서
		//6) redirecttlzla
		logger.info("사용자가 입력한 ID/PW" + memberVO.toString());
		MemberVO loginMember = memberService.memberLogin(memberVO);
		
		if(loginMember==null) {
			logger.info("로그인실패");
			return "auth/loginFail";
		}else {
			logger.info("로그인성공");
			session.setAttribute("loginMember", loginMember);
			
			return "redirect:../member/list";
		}
		
	}
	
	   @RequestMapping(value="/auth/logout", method = { RequestMethod.GET , RequestMethod.POST})
	   public String logout(HttpSession session) { 
	      logger.info("Session 삭제 --- 로그아웃됨");
	      session.invalidate();
	      
	      return "auth/logout";
	   }

}
