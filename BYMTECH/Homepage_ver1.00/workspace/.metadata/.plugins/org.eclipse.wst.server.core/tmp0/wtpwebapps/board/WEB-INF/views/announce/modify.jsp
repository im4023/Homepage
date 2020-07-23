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
			
			<div class="announcement_top">
				<div class="announcement_intro3">
					<span><strong>공지사항 수정</strong></span>
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
			<div class="announcement_bottom text-center">
				<c:if test="${member != null}">
					<form method="post">
						
						<table>
							<tbody>
								<tr>
									<td class ="announcement_title2">제목</td>
									<td class ="announcement_title4">
										<input type="text" name="title" value="${view.title}"/>
									</td>
									<td class ="announcement_title2">작성자</td>
									<td class ="announcement_title4">
										<input type="text" name="writer" value="${view.writer}"/>
									</td>									
								</tr>
							</tbody>
						</table>
						<table>
							<tbody>
								<tr>
									<td>
										<div class ="announcement_content">
											<textarea cols="50" rows="5" name="content" class="inputbox announce_content">${view.content}</textarea>
										</div>
									</td>
								</tr>
							</tbody>
						</table>
						<button class="btn" type="submit">완료</button>
						<button class="btn" type="button" id="cancel_btn"> 취소</button>
						<script>	
						$("#cancel_btn").click(function(){
							self.location = "../announce/announcement";					
						});
						</script>
					</form>
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
		
		<script type="text/javascript" src="/resources/jquery/jstyle.js"></script>
	</body>
	
</html>