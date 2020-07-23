package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.AnnounceDAO;
import com.board.domain.AnnounceVO;
import com.board.domain.SearchCriteria;
import com.board.domain.Criteria;

@Service
public class AnnounceServiceImpl implements AnnounceService {

	@Inject
	private AnnounceDAO dao;
	 
	// 게시물 목록
	@Override
	public List list() throws Exception {
	
		return dao.list();
	}
	
	// 게시물 작성 
	@Override
	public void write(AnnounceVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.write(vo);
	}
	
	// 게시물 조회
	@Override
	public AnnounceVO view(int idx) throws Exception {
		
		return dao.view(idx);
	}
	
	// 게시물 수정
	@Override
	public void modify(AnnounceVO vo) throws Exception {
		
		dao.modify(vo);
	}

	// 게시물 삭제
	@Override
	public void delete(int idx) throws Exception {
		dao.delete(idx);
		
	}
	
	// 게시물 목록 페이징
	@Override
	public List<AnnounceVO> listPage(Criteria cri) throws Exception {
		return dao.listPage(cri);
	}
	
	// 게시물 총 갯수
	@Override
	public int listCount() throws Exception {
		return dao.listCount();
	}
	
	// 목록 + 페이징 + 검색
	@Override
	public List<AnnounceVO> announcement(SearchCriteria scri) throws Exception{
		return dao.announcement(scri);
	}
	
	//검색 결과 갯수
	@Override
	public int countSearch(SearchCriteria scri) throws Exception{
		return dao.countSearch(scri);
	}
}