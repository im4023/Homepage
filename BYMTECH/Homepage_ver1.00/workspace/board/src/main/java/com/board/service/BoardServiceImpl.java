package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.domain.BoardVO;
import com.board.domain.SearchCriteria;
import com.board.domain.Criteria;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	 
	// 게시물 목록
	@Override
	public List list() throws Exception {
	
		return dao.list();
	}
	
	// 게시물 작성 
	@Override
	public void write(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.write(vo);
	}
	
	// 게시물 조회
	@Override
	public BoardVO view(int idx) throws Exception {
		
		return dao.view(idx);
	}
	
	// 게시물 수정
	@Override
	public void modify(BoardVO vo) throws Exception {
		
		dao.modify(vo);
	}

	// 게시물 삭제
	@Override
	public void delete(int idx) throws Exception {
		dao.delete(idx);
		
	}
	
	// 게시물 목록 페이징
	@Override
	public List<BoardVO> listPage(Criteria cri) throws Exception {
		return dao.listPage(cri);
	}
	
	// 게시물 총 갯수
	@Override
	public int listCount() throws Exception {
		return dao.listCount();
	}
	
	// 목록 + 페이징 + 검색
	@Override
	public List<BoardVO> listSearch(SearchCriteria scri) throws Exception{
		return dao.listSearch(scri);
	}
	
	//검색 결과 갯수
	@Override
	public int countSearch(SearchCriteria scri) throws Exception{
		return dao.countSearch(scri);
	}
	
	@Override
	public void reset() throws Exception {
		dao.reset();
	}
}