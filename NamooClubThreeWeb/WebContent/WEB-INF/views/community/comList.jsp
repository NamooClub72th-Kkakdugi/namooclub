<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>나무커뮤니티</title>
<link href=".../common/css/bootstrap.css" rel="stylesheet">
<link href=".../common/css/bootswatch.min.css" rel="stylesheet">

</head>
<body>

	<!-- Main Navigation ========================================================================================== -->
	<div class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-responsive-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="./index.html">나무커뮤니티</a>
			</div>
			<div class="navbar-collapse collapse navbar-responsive-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="./index.html">커뮤니티 홈</a></li>
					<li><a href="#">인기 커뮤니티</a></li>
					<li><a href="#">랭킹</a></li>
					<li><a href="#">공지사항</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="../login.html">로그아웃</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">관리 <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="../management/commMemberList.html">커뮤니티 관리센터</a></li>
							<li><a href="../management/clubMemberList.html">클럽 관리센터</a></li>
							<li><a href="../management/teamMemberList.html">팀 관리센터</a></li>
							<li class="divider"></li>
							<li><a href="#">홍보</a></li>
						</ul></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">설정 <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#">개인정보</a></li>
							<li><a href="#">모바일 환경설정</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</div>

	<!-- Header ========================================================================================== -->
	<header>
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="jumbotron">
						<h1>나무 커뮤니티와 함께!</h1>
						<p>나무 커뮤니티와 함께 특정 취미와 관심사, 특정 그룹 또는 조직에 관한 대화를 시작하세요.</p>
						<p>
							<a href="./open.html" class="btn btn-warning btn-lg">커뮤니티 개설하기</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</header>

	<!-- Container ======================================================================================= -->
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<!-- ★★★ Tab Menu -->
				<ul class="nav nav-tabs" style="margin-bottom: 15px;">
					<li class="active"><a href="#joined" data-toggle="tab">가입 커뮤니티</a></li>
					<li class=""><a href="#unjoinded" data-toggle="tab">미가입 커뮤니티</a></li>
				</ul>

				<!-- ★★★ Tab Panel -->
				<div id="communityList" class="tab-content">
					<!-- ★★★ 가입 커뮤니티 -->
					<div class="tab-pane fade active in" id="joined">
						<div class="page-header">
							<h2 id="container">가입 커뮤니티</h2>
						</div>

						<ul class="list-group">
							<c:forEach var="community" items="${communities}">
							<li class="list-group-item"><span class="badge"></span>
								<h4>${community.name}</h4><button>이동하기</button>
								<p>${community.description}</p>
								<button type="button" class="btn btn-default btn-sm">멤버탈퇴 신청하기</button>
							</li>
							</c:forEach>
						</ul>
					</div>
				</div>
			</div>
		</div>

		<!-- Footer ========================================================================================== -->
		<footer>
			<div class="row">
				<div class="col-lg-12">
					<ul class="list-unstyled">
						<li class="pull-right"><a href="#top">위로 이동</a></li>
						<li><a href="#">커뮤니티 홈</a></li>
					</ul>
					<p>© NamooSori 2014.</p>
				</div>
			</div>
		</footer>
	</div>

	<script src="../js/jquery-2.1.0.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/bootswatch.js"></script>
</body>
</html>