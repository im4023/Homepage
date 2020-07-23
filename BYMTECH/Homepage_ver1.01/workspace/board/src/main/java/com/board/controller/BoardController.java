package com.board.controller;


import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.domain.BoardVO;
import com.board.domain.PageMaker;
import com.board.domain.SearchCriteria;
import com.board.domain.Criteria;
import com.board.service.BoardService;

@Controller
@RequestMapping("/")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	private BoardService service;
	
	// 게시물 목록
	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public void getList(Model model) throws Exception {
			List list = null;
			list = service.list();
			model.addAttribute("list", list);
	}
	
	// 게시물 작성
	@RequestMapping(value = "/board/write", method = RequestMethod.GET)
	public void getWrite() throws Exception{
	}
		
	// 게시물 작성
	@RequestMapping(value = "/board/write", method = RequestMethod.POST)
	public String postWrite(BoardVO vo) throws Exception {
		//service.reset();
		service.write(vo);
		//action="mailSend.jsp"
	  	return "redirect:/board/write";
	}
	
	// 게시물 조회
	@RequestMapping(value = "/board/view", method = RequestMethod.GET)
	public void getView(@RequestParam("idx") int idx, Model model) throws Exception {
		BoardVO vo = service.view(idx);
		model.addAttribute("view", vo);
	}
	
	// 게시물 수정
	@RequestMapping(value = "/board/modify", method = RequestMethod.GET)
	public void getMoidfy(@RequestParam("idx") int idx, Model model) throws Exception{
		BoardVO vo = service.view(idx);
		model.addAttribute("view", vo);
	}
	
	// 게시물 수정
	@RequestMapping(value = "/board/modify", method = RequestMethod.POST)
	public String postMoidfy(BoardVO vo) throws Exception{
		service.modify(vo);
		return "redirect:/board/view?idx=" +vo.getIdx();
	}
	
	// 게시물 삭제
	@RequestMapping(value = "/board/delete", method = RequestMethod.GET)
	public String getDelete(@RequestParam("idx") int idx) throws Exception{
		service.delete(idx);
		return "redirect:/board/listSearch?num=1";
	}
	
	// 글 목록 + 페이징
	@RequestMapping(value = "/board/listPage", method = RequestMethod.GET)
	public void listPage(@ModelAttribute("cri") Criteria cri, Model model) throws Exception {
		logger.info("get list page");
		 
		 List<BoardVO> list = service.listPage(cri);
		 model.addAttribute("list", list);
		 
		 PageMaker pageMaker = new PageMaker();
		 pageMaker.setCri(cri);
		 pageMaker.setTotalCount(service.listCount()); // 게시물 전체 갯수 파악
		 model.addAttribute("pageMaker", pageMaker);
	 
	}
	
	// 글 목록 + 페이징 + 검색
	@RequestMapping(value = "/board/listSearch", method = RequestMethod.GET)
	public void listPage(@ModelAttribute("scri") SearchCriteria scri, Model model) throws Exception {
		logger.info("get list search");
		
		List<BoardVO> list = service.listSearch(scri);
		model.addAttribute("list", list);
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(scri);
		pageMaker.setTotalCount(service.countSearch(scri));// 검색된 게시물 전체 갯수 파악
		model.addAttribute("pageMaker", pageMaker);
	}
	

	
		
}
	
