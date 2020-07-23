package com.board.dao;

import java.util.List;

import com.board.domain.AnnounceVO;
import com.board.domain.SearchCriteria;
import com.board.domain.Criteria;

public interface AnnounceDAO {
 
	// 게시물 목록
	public List<AnnounceVO> list() throws Exception;
	
	// 게시물 작성
	public void write(AnnounceVO vo) throws Exception;
	
	// 게시물 조회
	public AnnounceVO view(int idx) throws Exception;
	
	// 게시물 수정
	public void modify(AnnounceVO vo) throws Exception;
	
	// 게시물 삭제
	public void delete(int idx) throws Exception;
	
	// 게시물 목록 + 페이징
	public List<AnnounceVO> listPage(Criteria cri) throws Exception;
	
	// 게시물 총 갯수
	public int listCount() throws Exception;
	
	// 게시물 목록 + 페이징 + 검색
	public List<AnnounceVO> announcement(SearchCriteria scri) throws Exception;
	
	// 검색 결과 갯수
	public int countSearch(SearchCriteria scri) throws Exception;
	
}