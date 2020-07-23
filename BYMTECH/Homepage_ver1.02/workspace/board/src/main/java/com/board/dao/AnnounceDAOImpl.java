package com.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.AnnounceVO;
import com.board.domain.SearchCriteria;
import com.board.domain.Criteria;

@Repository
public class AnnounceDAOImpl implements AnnounceDAO {

	@Inject
	private SqlSession sql;
	
	private static final String namespace = "com.board.mappers.announce";
									
	
	// 게시물 목록
	@Override
	public List list() throws Exception { 
	  
		return sql.selectList(namespace + ".list");
	}
	
	// 게시물 작성
	@Override
	public void write(AnnounceVO vo) throws Exception {
		
		sql.insert(namespace + ".write", vo);		
	}
	
	// 게시물 조회
	public AnnounceVO view(int idx) throws Exception {
		
		return sql.selectOne(namespace + ".view", idx);
	}
	
	// 게시물 수정
	@Override
	public void modify(AnnounceVO vo) throws Exception {
		
		sql.update(namespace + ".modify", vo);
	}

	// 게시물 삭제	
	@Override
	public void delete(int idx) throws Exception {
		sql.delete(namespace + ".delete", idx);
		
	}

	// 게시물 목록 + 페이징
	@Override
	public List<AnnounceVO> listPage(Criteria cri) throws Exception {
		return sql.selectList(namespace + ".listPage", cri);
	}
	
	// 게시물 총 갯수
	@Override
	public int listCount() throws Exception {
		return sql.selectOne(namespace+".listCount");
	}
	
	// 게시물 목록 + 페이징 + 검색
	@Override
	public List<AnnounceVO> announcement(SearchCriteria scri) throws Exception{
		return sql.selectList(namespace+".announcement",scri);
	}

	//겸색 결과 갯수
	@Override
	public int countSearch(SearchCriteria scri) throws Exception{
		return sql.selectOne(namespace + ".countSearch", scri);
	}
	
	

	
	
	
	

}