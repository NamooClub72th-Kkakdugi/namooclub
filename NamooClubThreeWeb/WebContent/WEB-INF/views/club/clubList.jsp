<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>커뮤니티 내부의 클럽 리스트</title>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
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
				<a class="navbar-brand" href="../community/index.html">나무커뮤니티</a>
			</div>
			<div class="navbar-collapse collapse navbar-responsive-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="../community/index.html">커뮤니티
							홈</a></li>
					<li><a href="#">인기 커뮤니티</a></li>
					<li><a href="#">랭킹</a></li>
					<li><a href="#">공지사항</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="../login.html">로그아웃</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">관리 <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="../management/commMemberList.html">커뮤니티
									관리센터</a></li>
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
					<form action="${ctx}/club/clubCreateInput.do" method="get">
						<h1>건강 커뮤니티</h1>
						<p>전국민 건강 프로젝트를 진행 중인 커뮤니티입니다. 각종 구기종목 및 헬스 관련 클럽이 있습니다.</p>
						<p>
							<input type="submit" class="btn btn-warning btn-lg"
								value="클럽 개설하기"></a>
						</p>
					</form>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-sm-12 col-lg-12">
				<ol class="breadcrumb">
					<li><a href="#">Home</a></li>
					<li class="active">건강커뮤니티</li>
				</ol>
			</div>
		</div>
	</div>
	</header>

	<!-- Container ======================================================================================= -->
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<!-- ★★★ Contents -->
				<div class="page-header">
					<h2 id="container">클럽</h2>
				</div>

				<ul class="list-group">
					<li class="list-group-item"><span class="badge">2011.03.21</span>
						<h4>
							<span class="label label-primary">축구</span>&nbsp;<a
								href="../team/index.html">우리동네 축구클럽 (팀:21, 회원:59)</a>
						</h4>
						<p>전국민 건강 프로젝트를 진행 중인 클럽입니다. 각종 구기종목 및 헬스 관련 클럽이 있습니다.전국민 건강
							프로젝트를 진행 중인 클럽입니다. 각종 구기종목 및 헬스 관련 클럽이 있습니다.</p>
						<button type="button" class="btn btn-default btn-sm">멤버탈퇴
							신청하기</button></li>
					<li class="list-group-item"><span class="badge">2011.03.21</span>
						<h4>
							<span class="label label-primary">수영</span>&nbsp;박태환 따라하기 (팀:21,
							회원:59)
						</h4>
						<p>전국민 건강 프로젝트를 진행 중인 클럽입니다. 각종 구기종목 및 헬스 관련 클럽이 있습니다.</p>
						<button type="button" class="btn btn-default btn-sm"
							onclick="location.href='./join.html'">멤버 가입하기</button></li>
					<li class="list-group-item"><span class="badge">2011.03.21</span>
						<h4>
							<span class="label label-primary">MTB</span>&nbsp;백두에서 한라까지
							(팀:21, 회원:59)
						</h4>
						<p>전국민 건강 프로젝트를 진행 중인 클럽입니다. 각종 구기종목 및 헬스 관련 클럽이 있습니다.</p>
						<button type="button" class="btn btn-default btn-sm"
							onclick="location.href='./join.html'">멤버 가입하기</button></li>
					<li class="list-group-item"><span class="badge">2011.03.21</span>
						<h4>
							<span class="label label-primary">테니스</span>&nbsp;<a
								href="../team/index.html">윈블던 (팀:21, 회원:59)</a>
						</h4>
						<p>전국민 건강 프로젝트를 진행 중인 클럽입니다. 각종 구기종목 및 헬스 관련 클럽이 있습니다.</p>
						<button type="button" class="btn btn-default btn-sm">멤버탈퇴
							신청하기</button></li>
				</ul>

				<button type="button" class="btn btn-default btn-lg btn-block">클럽
					목록 더보기</button>
			</div>
		</div>

		<!-- Footer ========================================================================================== -->
		<footer>
		<div class="row">
			<div class="col-lg-12">
				<ul class="list-unstyled">
					<li class="pull-right"><a href="#top">위로 이동</a></li>
					<li><a href="#">커뮤니티 홈</a></li>
					<li><a href="#">RSS</a></li>
					<li><a href="#">이용약관</a></li>
					<li><a href="#">도움말</a></li>
					<li><a href="#">회원탈퇴</a></li>
				</ul>
				<p>© NamooSori 2014.</p>
			</div>
		</div>
		</footer>
	</div>

	<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>