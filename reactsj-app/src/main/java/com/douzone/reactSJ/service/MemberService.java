package com.douzone.reactSJ.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douzone.reactSJ.dao.MemberDAO;
import com.douzone.reactSJ.vo.MemberVO;


@Service("memberService")
public class MemberService {
	
	@Autowired
	MemberDAO memberDAO;

	public int checkDupId(String userid) {
		return memberDAO.checkDupId(userid);
	}

	public void memberInsert(MemberVO memberVO) {
		memberDAO.memberInsert(memberVO);
	}

	public MemberVO memberSelectbyId(MemberVO memberVO) {
		MemberVO tempMember = memberDAO.memberSelectbyId(memberVO.getUserid());
		
		if (tempMember.getUserpwd().equals(memberVO.getUserpwd())) {
			return tempMember;
		} else {
			return null;
		}
	}

	public int checkDupEmail(String useremail) {
		return memberDAO.checkDupEmail(useremail);
	}

	public MemberVO memberSelectbyEmail(MemberVO memberVO) {
		MemberVO tempMember = memberDAO.memberSelectbyEmail(memberVO.getUseremail());
		
		if (tempMember.getUsername().equals(memberVO.getUsername())) {
			return tempMember;
		} else {
			return null;
		}
	}
}
