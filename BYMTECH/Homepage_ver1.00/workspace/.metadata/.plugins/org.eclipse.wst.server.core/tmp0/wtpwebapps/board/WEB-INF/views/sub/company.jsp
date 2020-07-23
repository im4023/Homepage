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
		<div class="container" id=companymain>
			<!-- sidebar -->
			<%@include file="../include/sidenav.jsp" %>
			
			<div class="company_top">
				<div class="company_intro">
					<span><strong>인사말</strong></span>
				</div>
			</div>
			<div class="company_bottom text-center">
				<div class="col-lg-7 my-auto">
					<img src="/resources/img/company/introduce2.jpg" class="img_intro" alt="">
				</div>
				<div class="col-lg-5 mys-auto">
					<div class="device-container">
						<div class="screen">
							<img src="/resources/img/company/company.jpg" class="img_company" alt="">
						</div>
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