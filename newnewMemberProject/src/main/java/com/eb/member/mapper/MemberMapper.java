package com.eb.member.mapper;

import java.util.List;

import com.eb.member.dto.MemberVO;

public interface MemberMapper {
	public List<MemberVO> memberList();
	
	public int memberRegister(MemberVO memberVO);
	
	public MemberVO memberGetOne(int mno);
	
	public int memberUpdate(MemberVO memberVO);
	
	public int memberDeleteGet(int mno);
	
	public MemberVO memberLogin(MemberVO memberVO);
}
