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
			
			<script>
			function formCheck() { 
				var title = document.forms[0].title;       
				var writer = document.forms[0].writer;
				var content = document.forms[0].content; 
				var mail = document.forms[0].mail; 
				var phoneNum = document.forms[0].phoneNum; 
				
				if (writer.value == null ||  writer.value  == ""){           
					alert('성함 또는 회사명을 남겨주십시오.');  
					document.forms[0].writer.focus();                   
					return false;    
				}else if(writer.value.indexOf("'") != -1 ||
						writer.value.indexOf("&") != -1 ||
						writer.value.indexOf("*") != -1 ||
						writer.value.indexOf("_") != -1 ||
						writer.value.indexOf("--") != -1 ||
						writer.value.indexOf(";") != -1
						){
				      alert("',&,*,_,--,; 와 같은 문자는 입력하실 수 없습니다.");
				      writer.focus();
				      return false;
				}
				if (mail.value == null ||  mail.value  == ""){
					alert('연락드릴 메일을 남겨주십시오.');
					document.forms[0].mail.focus(); 
					return false;
				}else if(mail.value.match(/^(\w+)@(\w+)[.](\w+)$/ig) == null){
					alert('메일의 형식이 잘 못되었습니다.');  
					document.forms[0].mail.focus();                 
					return false;  
				}
				if (phoneNum.value == null ||  phoneNum.value  == ""){
					alert('연락드릴 전화번호 또는 핸드폰 번호를 남겨주십시오.');
					document.forms[0].phoneNum.focus(); 
					return false;
				}else if(phoneNum.value.match(/(^02.{0}|^01.{1}|[0-9]{3})([0-9]+)([0-9]{4})/g)== null){
					alert('번호를 잘 못 입력하셨습니다. 다시 한번 확인 해주십시오.');  
					document.forms[0].phoneNum.focus();                 
					return false;  
				}
				if (title.value == null || title.value == ""){                                   
					alert('제목을 입력하지 않으셨습니다.');                                  
					document.forms[0].title.focus();                          
					return false;                                                     
				}else if(title.value.indexOf("'") != -1 ||
						title.value.indexOf("&") != -1 ||
						title.value.indexOf("*") != -1 ||
						title.value.indexOf("_") != -1 ||
						title.value.indexOf("--") != -1 ||
						title.value.indexOf(";") != -1
						){
				      alert("',&,*,_,--,; 와 같은 문자는 입력하실 수 없습니다.");
				      title.focus();
				      return false;
				 }	
				if (content.value == null || content.value == ""){                                   
					alert('문의 하실 내용이 없습니다.');                                  
					document.forms[0].content.focus();                          
					return false;                                                     
				}else if(content.value.indexOf("'") != -1 ||
						content.value.indexOf("&") != -1 ||
						content.value.indexOf("*") != -1 ||
						content.value.indexOf("_") != -1 ||
						content.value.indexOf("--") != -1 ||
						content.value.indexOf(";") != -1
						){
				      alert("',&,*,_,--,; 와 같은 문자는 입력하실 수 없습니다.");
				      content.focus();
				      return false;
				 }

			};
			</script>
			
			<title>바이엠텍</title>
	</head>
	<body>
		<!-- Navigation -->
		<header class="navbar navbar-expand-lg fixed-top" id="mainNav">
			<%@include file="../include/nav.jsp" %>
		</header>
		
		<!-- Main -->
		<div class="container" id="boardmain">
			<!-- sidebar -->
			<%@include file="../include/sidenav.jsp" %>
			
			<div class="board_top">
				<div class="board_intro">
					<span><strong>문의사항</strong></span>
				</div>
				<c:if test="${member != null}">
					<div class ="admin_menu">
						<button type="button" id="listSearch_btn">관리페이지</button>
						<script>	
						$("#listSearch_btn").click(function(){
							self.location = "/board/listSearch";					
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
			<div class="board_middle text-center">
				<p> 문의사항을 남겨주시면 신속하게 연락드리겠습니다.
			</div>
			<div class="board_bottom text-center">
				<form method="post" onsubmit="return formCheck();">
					<div class = "board_tr">
						<div class = "board_inner">
							<div class = "board_td">
								<a>작성자</a>
							</div>
							<div class = "board_td2">
								<input type="text" name="writer" />
							</div>
						</div>
						<div class = "board_inner">
							<div class = "board_td">
								<a>메일</a>
							</div>
							<div class = "board_td2">
								<input type="text" name="mail"  />
							</div>
						</div>
						<div class = "board_inner">
							<div class = "board_td">
								<a>연락처</a>
							</div>
							<div class = "board_td2">
								<input type="text" name="phoneNum"  />
							</div>
						</div>
					</div>
					<div class = "board_tr">
						<div class = "board_td3">
							<a>제목</a>
						</div>
						<div class = "board_td4">
							<input type="text" name="title" class = "inputbox" />
						</div>
					</div>
					<div class = "board_tr">
						<div class = "board_td3">
							<a>내용</a>
						</div>
						<div class = "board_td4">
							<textarea cols="50" rows="5" name="content" class = "inputbox board_content"></textarea>
						</div>
					
					</div>
					
									
						<button class="btn" type="submit">작성</button>
						<input type = "hidden" name="to" value = "kby_car@naver.com">
						<input type = "hidden" name="from" value = "kby_car@naver.com">
					</form>
			</div>
		</div>
		
		<!-- Footer -->	
	    <footer class="footer" id="footer">
		    <%@include file="../include/footer.jsp" %>
		</footer>
		
		<script type="text/javascript" src="/resources/jquery/jstyle.js"></script>
	</body>
</html>