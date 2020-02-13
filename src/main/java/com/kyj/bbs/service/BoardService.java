package com.kyj.bbs.service;

import java.util.List;
import com.kyj.bbs.dto.BoardVO;
import com.kyj.bbs.dto.Criteria;

public interface BoardService {

	public List<BoardVO> selectAll();
//	public BoardVO detailOne(int bno);
	
	public void insert(BoardVO board);
//	public void insertSelectKey(BoardVO board);
	public BoardVO selectOne(int bno);
	public void update(BoardVO board);
	
	public void delete(int bno);
	
	//페이징
	public List<BoardVO> selectAll(Criteria cri);
	public int totalCount(Criteria cri);
	
}
