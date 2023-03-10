package com.douzone.reactSJ.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.douzone.reactSJ.vo.BoardVO;

@Mapper
@Repository("boardDAO")
public interface BoardDAO {

	List<BoardVO> getBoardList(String bcategory);

	BoardVO getBoardVO(String bno);

	void boardDelete(String bno);

	int boardInsert(BoardVO boardVO);

	void boardUpdate(BoardVO boardVO);

}
