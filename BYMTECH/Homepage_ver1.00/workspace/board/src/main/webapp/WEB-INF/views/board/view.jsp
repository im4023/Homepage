<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<script src='https://code.jquery.com/jquery-3.3.1.min.js'></script>
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta name="description" content="">
		<meta name="author" content="">
		<link rel="stylesheet" href="/resources/css/style.css"/>
		
		<title>바이엠텍</title>
</head>
<body>
<!-- Navigation -->
		<header class="navbar navbar-expand-lg fixed-top" id="mainNav">
			<%@include file="../include/nav.jsp" %>
		</header>
		
		<!-- Main -->
		<div class="container" id="announcementmain">
			<!-- sidebar -->
			<%@include file="../include/sidenav.jsp" %>
			
			<div class="board_top">
				<div class="board_intro">
					<span><strong>문의사항</strong></span>
				</div>
				<c:if test="${member != null}">
					<div class ="admin_menu">
						
						<button type="button" id="logout_btn"> 로그아웃</button>
						<script>	
						$("#logout_btn").click(function(){
							self.location = "../bymt/logout";					
						});
						</script>
					</div>
				</c:if>
			</div>
			<div class="board_bottom text-center">
				<c:if test="${member != null}">
					<div class = "board_tr">
						<div class = "board_td">
							<a>작성자</a>
						</div>
						<div class = "board_td2">
							${view.writer}
						</div>
						<div class = "board_td">
							<a>메일</a>
						</div>
						<div class = "board_td2">
							${view.mail}
						</div>
						<div class = "board_td">
							<a>연락처</a>
						</div>
						<div class = "board_td2">
							${view.phoneNum}
						</div>
					</div>
					<div class = "board_tr">
						<div class = "board_td">
							<a>제목</a>
						</div>
						<div class = "board_td4">
							${view.title}
						</div>
						<div class = "board_td">
							<a>작성일</a>
						</div>
						<div class = "board_td2">
							<fmt:formatDate value="${view.regDate}" pattern="yyyy.MM.dd"/>
						</div>
					</div>
					<div class = "board_tr">
						<div class = "board_td">
							<a>내용</a>
						</div>
						<div class = "board_td3 board_content">
							${view.content}
						</div>
					
					</div>
					<button class="btn" type="button" id="list_btn">목록</button>
					<script>	
						$("#list_btn").click(function(){
							self.location = "/board/listSearch";					
						});
					</script>
					<button class="btn" type="button" id="modify_btn">수정</button>
					<script>	
						$("#modify_btn").click(function(){
							self.location = "/board/modify?idx=${view.idx}";					
						});
					</script>
					<button class="btn" type="button" id="delete_btn">삭제</button>
					<script>	
						$("#delete_btn").click(function(){
							self.location = "/board/delete?idx=${view.idx}";					
						});
					</script>
				</c:if>
				<c:if test="${member == null}">
					<p>로그인을 하셔야 해당 페이지를 볼 수 있습니다.</p>
				</c:if>
			</div>
		</div>

<!-- Footer -->	
	    <footer class="footer" id="footer">
		    <%@include file="../include/footer.jsp" %>
		</footer>
		
		
</body>
</html>