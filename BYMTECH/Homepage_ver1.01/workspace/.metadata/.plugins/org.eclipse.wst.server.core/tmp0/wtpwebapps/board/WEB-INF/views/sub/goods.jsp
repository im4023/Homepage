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
		<div class="container" id=goodsmain>
			<!-- sidebar -->
			<%@include file="../include/sidenav.jsp" %>
			
			<div class="goods_top">
				<div class="goods_intro">
					<span><strong>제품소개</strong></span>
				</div>
			</div>
			<div class="goods_bottom text-center">
				<table class="goods_menu">
					<tr>
						<td class="goods_title1">상품</td>
						<td class="goods_title1">이름</td>
						<td>간략설명</td>
					</tr>
				</table>
				<table class="goods_table">
					<tr>
						<td class="goods_title2"><img src="/resources/img/goods/goods1.png" class=goods_img alt=""></td>
						<td class="goods_title2"><p>전자 미스트</p></td>
						<td><p>내장 배터리를 이용하여 반 영구적 사용이 가능한 미스트</p></td>
					</tr>
					<tr>
						<td class="goods_title2"><img src="/resources/img/goods/goods2.png" class=goods_img alt=""></td>
						<td class="goods_title2"><p>피트러스 PLUS</p></td>
						<td>
							<p>시간과 장소에 구애 받지 않고 사용자의 신체 구성 측정 및 분석 가능</p>
							<p>일관된 측정을 통해 신체 각 구성 요소에 대한 그래프 제공</p>
							<p>측정결과 기반의 데이터를 통해 사용자의 맞춤 관리 가능</p>
						</td>
					</tr>
					<tr>
						<td class="goods_title2"><img src="/resources/img/goods/goods3.png" class=goods_img alt=""></td>
						<td class="goods_title2"><p>버스 광고 장치(CMS)</p></td>
						<td><p>정류장의 와이파이를 통해 광고 데이터를 받아</p> <p>버스 내 장치를 통해 광고 하는 시스템</p></td>
					</tr>
					<tr>
						<td class="goods_title2"><img src="/resources/img/goods/goods4.png" class=goods_img alt=""></td>
						<td class="goods_title2"><p>LED 디스플레이</p> <p>투명 패널</p></td>
						<td><p>투명하고 유연한 대형 LED 패널</p></td>
					</tr>
					<tr>
						<td class="goods_title2"><img src="/resources/img/goods/goods5.png" class=goods_img alt=""></td>
						<td class="goods_title2"><p>미세 먼지 측정기</p></td>
						<td><p>센서를 통해 미세 먼지를 측정하는 기기</p></td>
					</tr>
					<tr>
						<td class="goods_title2"><img src="/resources/img/goods/goods6.png" class=goods_img alt=""></td>
						<td class="goods_title2"><p>MR-450 선박 식별장치</p></td>
						<td><p>GPS, VHF 정보를 이더넷으로 변환</p> <p>리눅스 탑재</p></td>
					</tr>
					<tr>
						<td class="goods_title2"><img src="/resources/img/goods/goods7.png" class=goods_img alt=""></td>
						<td class="goods_title2"><p>썬바이저 타입 HUD</p></td>
						<td><p>HUD를 썬바이저로 만들어 편리하게 사용자에게 정보를 제공 하는 기기</p> <p>리눅스 탑재</p></td>
					</tr>
					<tr>
						<td class="goods_title2"><img src="/resources/img/goods/goods8.png" class=goods_img alt=""></td>
						<td class="goods_title2"><p>영상처리 보드</p></td>
						<td><p>영상 신호를 받아 처리하는 DSP 보드</p></td>
					</tr>
					<tr>
						<td class="goods_title2"><img src="/resources/img/goods/goods9.png" class=goods_img alt=""></td>
						<td class="goods_title2"><p>사출품 불량 검사 알고리즘</p></td>
						<td><p>제품의 불량을 검사하는 알고리즘 보드</p></td>
					</tr>
					
				</table>
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