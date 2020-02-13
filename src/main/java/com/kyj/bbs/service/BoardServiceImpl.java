package com.kyj.bbs.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.kyj.bbs.dto.BoardVO;
import com.kyj.bbs.dto.Criteria;
import com.kyj.bbs.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardMapper mapper;

	@Override
	public List<BoardVO> selectAll() {
		return mapper.getList();
	}
	
//	@Override
//	public BoardVO detailOne(int bno) {
//		return mapper.getDetail();
//	}

	@Override
	public void insert(BoardVO board) {
		mapper.insertSelectKey(board);
	}	
	@Override
	public BoardVO selectOne(int bno) {
		return mapper.read(bno);
	}
	@Override
	public void update(BoardVO board) {	
		mapper.update(board);		
	}
	
	
	@Override
	public void delete(int bno) {
		mapper.delete(bno);
	}

	@Override
	public List<BoardVO> selectAll(Criteria cri) {
		
		return mapper.oracleListPaging(cri);
	}

	@Override
	public int totalCount(Criteria cri) {		
		return mapper.totalCount();
	}
	

	
	

	
}
