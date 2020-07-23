<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
	<head>
	
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta name="description" content="">
		<meta name="author" content="">
		<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
		
		<title>바이엠텍</title>
	</head>
	
	<body>
		<!-- Navigation -->
		<nav class="navbar navbar-expand-lg fixed-top" id="mainNav">
			<%@include file="../include/nav.jsp" %>
		</nav>
		
		<!-- Main -->
		<div class="container" id=businessmain>
			<!-- sidebar -->
			<%@include file="../include/sidenav.jsp" %>
			
			<div class="business_top">
				<div class="business_intro">
					<span><strong>사업소개</strong></span>
				</div>
			</div>
			<div class="business_bottom text-center">
				<div class="business_inner">
					<div class="business_img_box">
						<img src="/resources/img/business/business1.jpg" class=img_business alt="">
					</div>
					<div class="business_text_box">
						<a class=business_number>01</a>
						<a class=business_name>소프트웨어 개발</a>
					</div>
				</div>
				<div class="business_inner">
					<div class="business_img_box">
						<img src="/resources/img/business/business2.jpg" class="img_business" alt="">
					</div>
					<div class="business_text_box">
						<a class=business_number>02</a>
						<a class=business_name>보드 개발</a>
					</div>
				</div>
				<div class="business_inner">
					<div class="business_img_box">
						<img src="/resources/img/business/business3.jpg" class="img_business" alt="">
					</div>
					<div class="business_text_box">
						<a class=business_number>03</a>
						<a class=business_name>전자시스템 개발</a>
					</div>
				</div>
			</div>
		</div>	
  
   		<!-- Footer -->	
	    <footer class="footer" id="footer">
		    <%@include file="../include/footer.jsp" %>
		</footer>
		
		<script src="/resources/jquery/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="/resources/jquery/jstyle.js"></script>
	</body>
</html>