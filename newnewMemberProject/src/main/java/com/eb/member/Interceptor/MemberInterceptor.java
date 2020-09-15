package com.eb.member.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.eb.member.dto.MemberVO;

public class MemberInterceptor extends HandlerInterceptorAdapter {

   public boolean preHandle(HttpServletRequest request, HttpServletResponse response,   Object obj ) throws Exception {

      System.out.println("-------------- MyInterCeptor - preHandle");

      // 여기서 로그인 체크
      // session 객체를 가져옴
      HttpSession session = request.getSession();
      
      // 1) 우선 여기서 request로 들어온 url을 알아야한다.
      // 2) 그걸 request에 담아두고 /auth/login으로 넘어감
      
      // login처리를 담당하는 사용자 정보를 담고 있는 객체를 가져옴
      MemberVO loginMember = (MemberVO) session.getAttribute("loginMember");

      if ( loginMember == null ){
         // 로그인이 안되어있는 상태(redirect)
    	// 처음 요청받은 url

         response.sendRedirect("/auth/login");
         
         return false; // 더이상 컨트롤러 요청으로 가지 않도록 false로 반환함
      }
      return true;
   }
}