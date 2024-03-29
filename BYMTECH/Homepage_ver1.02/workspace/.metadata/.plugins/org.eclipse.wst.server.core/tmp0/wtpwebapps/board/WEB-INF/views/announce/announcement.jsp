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
				<div class="announcement_intro">
					<span><strong>공지사항</strong></span>
				</div>
				<c:if test="${member != null}">
					<div class ="admin_menu">
						<button type="button" id="write_btn">글쓰기</button>
						<script>	
						$("#write_btn").click(function(){
							self.location = "/announce/write";					
						});
						</script>
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
				<table class = "announcement_list">
					<thead>
						<tr class = "announcement_menu">
							<th>번호</th>
							<th>제목</th>							
							<th>작성자</th>
							<th>작성일</th>
						</tr>
					</thead>
				 
					<tbody>
						<c:forEach items="${list}" var="list">
							<tr>
								<td class = "announcement_article">${list.idx}</td>
								<td class = "announcement_article announcement_title">
									<a href="/announce/view?idx=${list.idx}"> ${list.title}</a>
								</td>								
								<td class = "announcement_article">${list.writer}</td>
								<td class = "announcement_article">
									<fmt:formatDate value="${list.regDate}" pattern="yyyy.MM.dd"/>
								</td>
								
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="announcement_search">
					<select name="searchType">
						<option value="t"<c:out value="${scri.searchType eq 't' ? 'selected' : ''}"/>>제목</option>
						<option value="c"<c:out value="${scri.searchType eq 'c' ? 'selected' : ''}"/>>내용</option>
						<option value="w"<c:out value="${scri.searchType eq 'w' ? 'selected' : ''}"/>>작성자</option>
						<option value="tc"<c:out value="${scri.searchType eq 'tc' ? 'selected' : ''}"/>>제목+내용</option>
					</select>
				
					<input type="text" name="keyword" id="keywordInput" value="${scri.keyword}"/>
					
					<button id="searchBtn">검색</button>
					
					<script>
					 $(function(){
					  $('#searchBtn').click(function() {
					   self.location = "announcement"
					     + '${pageMaker.makeQuery(1)}'
					     + "&searchType="
					     + $("select option:selected").val()
					     + "&keyword="
					     + encodeURIComponent($('#keywordInput').val());
					    });
					 });   
					 </script>
				
				</div>
			
				<div>
					<ul class = "announcement_paging">
						<c:if test="${pageMaker.prev}">
							<span>[<a href="announcement${pageMaker.makeSearch(pageMaker.startPage-1)}">이전</a>]</span>
						</c:if> 
						
						<c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
							<span>[<a href="announcement${pageMaker.makeSearch(idx)}">${idx}</a>]</span>
						</c:forEach>
						
						<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
							<span>[<a href="announcement${pageMaker.makeSearch(pageMaker.endPage + 1)}">다음</a>]</span>
						</c:if> 
					</ul>
				</div>
			</div>
		</div>

		<!-- Footer -->	
	    <footer class="footer" id="footer">
		    <%@include file="../include/footer.jsp" %>
		</footer>
		
		<script type="text/javascript" src="/resources/jquery/jstyle.js"></script>
	</body>
</html>