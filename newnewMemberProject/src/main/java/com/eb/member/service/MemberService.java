package com.eb.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eb.member.dto.MemberVO;
import com.eb.member.mapper.MemberMapper;

@Service
public class MemberService {
	
	@Autowired
	MemberMapper memberMapper;
	
	public List<MemberVO> memberList(){
		return memberMapper.memberList();
	}
	
	public int memberRegister(MemberVO memberVO) {
		return memberMapper.memberRegister(memberVO);
		
	}
	
	public MemberVO memberGetOne(int mno) {
		return memberMapper.memberGetOne(mno);
	}
	
	public int memberUpdate(MemberVO memberVO) {
		return memberMapper.memberUpdate(memberVO);
	}
	
	public int memberDeleteGet(int mno) {
		return memberMapper.memberDeleteGet(mno);
	}
	
	public MemberVO memberLogin(MemberVO memberVO) {
		MemberVO loginMember = null;
		loginMember = memberMapper.memberLogin(memberVO);
		return loginMember;
	}
}
