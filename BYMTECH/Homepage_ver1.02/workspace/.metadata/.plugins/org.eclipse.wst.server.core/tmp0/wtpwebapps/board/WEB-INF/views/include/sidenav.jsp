<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- sidenav -->
	<nav id="sidebar">
		<button class = "close_button" type="button">
			<img src="/resources/img/index/close.png" alt="" class = close_img >
		</button>
   			<ul class="sidebar-nav">
			<li>
				<a  href="/sub/company" class="sidebar_m sidebar_link"  >회사소개</a>
				<ul>
					<li>
						<a  href="/sub/company" class="sidebar_s sidebar_link"  >인사말</a>
					</li>
					<li>
						<a  href="/sub/history" class="sidebar_s sidebar_link"  >연혁</a>
					</li>
					<li>
						<a  href="/sub/location" class="sidebar_s sidebar_link"  >찾아오시는 길</a>
					</li>
				</ul>
			</li>
			<li >
				<a  href="/sub/business" class="sidebar_m sidebar_link"  >사업소개</a>
			</li>
			<li >
				<a  href="/sub/goods" class="sidebar_m sidebar_link">제품소개</a>
			</li>
			<li>
				<a  href="/announce/announcement" class="sidebar_m sidebar_link">고객센터</a>
				<ul >
					<li>
						<a  href="/announce/announcement" class="sidebar_s sidebar_link">공지사항</a>
					</li>
					<li>
						<a href="/board/write" class="sidebar_s sidebar_link">문의사항</a>
					</li>
				</ul>
			</li>
		</ul>
	</nav>