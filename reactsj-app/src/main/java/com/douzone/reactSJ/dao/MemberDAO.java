package com.douzone.reactSJ.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.douzone.reactSJ.vo.MemberVO;

@Mapper
@Repository("memberDAO")
public interface MemberDAO {

	int checkDupId(String userid);

	void memberInsert(MemberVO memberVO);

	MemberVO memberSelectbyId(String userid);

	int checkDupEmail(String useremail);

	MemberVO memberSelectbyEmail(String useremail);

}
