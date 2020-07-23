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
			
			<div class="history_top">
				<div class="history_intro">
					<span><strong>회사연혁</strong></span>
				</div>
			</div>
			<div class="history_bottom">
				<!--  -->
				<img class="history_bottom_img" src="/resources/img/history/history_bottom_2020.png"  alt="">
				
				 <!-- 
				<img class="history_bottom_img" src="/resources/img/history/history_bottom.jpg"  alt="">
				 --> 
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