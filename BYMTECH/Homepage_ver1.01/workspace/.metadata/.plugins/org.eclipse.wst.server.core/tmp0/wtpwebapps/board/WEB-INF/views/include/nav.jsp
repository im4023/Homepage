<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Navigation -->
	
		<div class="container border-top-red border-bottom-red" id="navcontainer">
			<a href="/"><img class ="logo_img" src = "/resources/img/index/logo.png" alt="" ></a>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item mx-0 mx-lg-1">
						<a class="nav-link" href=/sub/company>회사소개</a>
						<ul class= "submenu navbar-nav ml-auto">
							<li>
								<a class="nav-link" href="/sub/company" >인사말</a>
							</li>
							<li>
								<a class="nav-link" href="/sub/history" >연혁</a>
							</li>
							<li>
								<a class="nav-link" href="/sub/location" >찾아오시는 길</a>
							</li>
						</ul>
					</li>
					<li class="nav-item mx-0 mx-lg-1">
						<a class="nav-link " href="/sub/business">사업소개</a>
					</li>
					<li class="nav-item mx-0 mx-lg-1">
						<a class="nav-link " href="/sub/goods">제품소개</a>
					</li>
					<li class="nav-item mx-0 mx-lg-1">
						<a class="nav-link " href="/announce/announcement">고객센터</a>
						<ul class= "submenu navbar-nav ml-auto">
							<li>
								<a class="nav-link" href="/announce/announcement" >공지사항</a>
							</li>
							<li>
								<a class="nav-link" href="/board/write" >문의사항</a>
							</li>
						</ul>
					</li>
				</ul>
			</div>
			<button class="navbar-toggler" type="button" id="menubutton">
	      			<span></span>
     				<span></span>
     				<span></span>
    			</button>
	    			
		</div>
	