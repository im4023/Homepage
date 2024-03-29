package com.board.service;


import java.util.List;

import com.board.domain.BoardVO;
import com.board.domain.SearchCriteria;
import com.board.domain.Criteria;

public interface BoardService {
	// 게시물 목록
	public List list() throws Exception; 
	
	// 게시물 작성
	public void write(BoardVO vo) throws Exception;
	
	// 게시물 조회
	public BoardVO view(int idx) throws Exception;
	
	// 게시물 수정
	public void modify(BoardVO vo) throws Exception;
	
	// 게시물 삭제
	public void delete(int idx) throws Exception;
	
		
	// 게시물 목록 + 페이징
	public List<BoardVO> listPage(Criteria cri) throws Exception;
	
	// 게시물 총 갯수
	public int listCount() throws Exception;
	
	// 목록 + 페이징 + 검색
	public List<BoardVO> listSearch(SearchCriteria scri) throws Exception;
	
	// 검색 결과 갯수
	public int countSearch(SearchCriteria scri) throws Exception;
	
	// 글 번호 초기화
	public void reset() throws Exception;
	
}
