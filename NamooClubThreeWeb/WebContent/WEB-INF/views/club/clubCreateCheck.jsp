<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>나무커뮤니티 - 클럽개설(정보확인)</title>
<link href="/NamooClub/resources/common/css/bootstrap.css"
	rel="stylesheet">
<link href="/NamooClub/resources/common/css/bootswatch.min.css"
	rel="stylesheet">
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
					<h1>건강 커뮤니티</h1>
					<p>전국민 건강 프로젝트를 진행 중인 커뮤니티입니다. 각종 구기종목 및 헬스 관련 클럽이 있습니다.</p>
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
					<h2 id="container">클럽 개설하기</h2>
				</div>

				<div class="well">
					<p>나와 같은 관심사를 가진 멤버를 모집하고 열심히 운영하여 클럽을 성장시켜 보세요.</p>
					<form class="form-horizontal" action="./index.html">
						<fieldset>
							<div class="form-group">
								<label class="col-lg-2 control-label">클럽 카테고리</label>

								<div class="col-lg-10">
									<input type="text" name="clubCategory" value="${clubCategory}"
										readonly="readonly" class="form-control">
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label">클럽명</label>
								<div class="col-lg-10">
									<input type="text" name="clubName" value="${clubName}"
										readonly="readonly" class="form-control">
								</div>
							</div>
							<div class="form-group">
								<label for="textArea" class="col-lg-2 control-label">클럽
									대표문구</label>
								<div class="col-lg-10">
									<input type="text" class="form-control" id="textArea"
										name="clubDescription" value="${clubDescription}"
										readonly="readonly"></textarea>
									<span class="help-block">클럽을 소개하는 대표문구를 입력해 주세요. 클럽 홈화면에
										입력하신 문구가 출력됩니다.</span>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label">클럽 멤버 가입을 위한 질문내용</label>

								<div class="col-lg-10">
									<input type="text" name="clubQuOne" value="${clubQuOne}"
										readonly="readonly" class="form-control" >
									<input type="text" name="clubQuTwo" value="${clubQuTwo}"
										readonly="readonly" class="form-control">
									<input type="text" name="clubQuThree" value="${clubQuThree}"
										readonly="readonly" class="form-control">
								</div>
							</div>
							<div class="form-group">
								<div class="col-lg-10 col-lg-offset-2">
									<button class="btn btn-primary" type="submit" >확인</button>
									<button class="btn btn-default" onclick="history.back(); return false;">취소</button>
								</div>
							</div>
						</fieldset>
					</form>
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