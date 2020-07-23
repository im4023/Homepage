package com.board.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class PageController {
	
	private static final Logger logger = LoggerFactory.getLogger(PageController.class);
	
	// 인사말
		@RequestMapping(value = "/sub/company", method = RequestMethod.GET)
		public String company(Locale locale, Model model) {
			logger.info("Welcome home! The client locale is {}.", locale);
					
			return "/sub/company";
		}
		
		// 사업소개
		@RequestMapping(value = "/sub/business", method = RequestMethod.GET)
		public String business(Locale locale, Model model) {
			logger.info("Welcome home! The client locale is {}.", locale);
			
					
			return "/sub/business";
		}
		
		// 연혁
		@RequestMapping(value = "/sub/history", method = RequestMethod.GET)
		public String history(Locale locale, Model model) {
			logger.info("Welcome home! The client locale is {}.", locale);
			
					
			return "/sub/history";
		}
		
		// 찾아오시는길
		@RequestMapping(value = "/sub/location", method = RequestMethod.GET)
		public String location(Locale locale, Model model) {
			logger.info("Welcome home! The client locale is {}.", locale);
			
					
			return "/sub/location";
		}
		
		// 제품소개
		@RequestMapping(value = "/sub/goods", method = RequestMethod.GET)
		public String goods(Locale locale, Model model) {
			logger.info("Welcome home! The client locale is {}.", locale);
			
					
			return "/sub/goods";
		}
		
		// 관리자로그인 페이지
			@RequestMapping(value = "bymt/admin", method = RequestMethod.GET)
			public String admin(Locale locale, Model model) {
				logger.info("Welcome home! The client locale is {}.", locale);
				
						
				return "bymt/admin";
			}

}
