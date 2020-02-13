package com.kyj.bbs.mapper;

import java.util.List;

import com.kyj.bbs.dto.BoardVO;
import com.kyj.bbs.dto.Criteria;

public interface BoardMapper {
	public List<BoardVO> getList();
//	public BoardVO getDetail();
	
	
	public void insert(BoardVO board);
	public void insertSelectKey(BoardVO board);
	public BoardVO read(int bno);
	
	
	public void delete(int bno);
	public void update(BoardVO board);
	public void updateReadCount(int bno);
	
	//페이징 하는 함수와 쿼리문 연결.
	public List<BoardVO> oracleListPaging(Criteria cri);
	// 페이지메이커 만들기.
	public int totalCount();

}
