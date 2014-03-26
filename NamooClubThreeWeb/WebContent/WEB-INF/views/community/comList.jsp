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
<link href="${ctx}/resources/common/css/bootstrap.css" rel="stylesheet">
<link href="${ctx}/resources/common/css/bootswatch.min.css" rel="stylesheet">

</head>
<body>

	<!-- Header ========================================================================================== -->
	<header>
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="jumbotron">
						<h1>나무 커뮤니티와 함께!</h1>
						<p>나무 커뮤니티와 함께 특정 취미와 관심사, 특정 그룹 또는 조직에 관한 대화를 시작하세요.</p>
						<p>
							<a href="${ctx}/view/community/comCreateInput.xhtml" class="btn btn-warning btn-lg">커뮤니티 개설하기</a>
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

	<script src="${ctx}/resources/js/jquery-2.1.0.js"></script>
	<script src="${ctx}/resources/js/bootstrap.min.js"></script>
	<script src="${ctx}/resources/js/bootswatch.js"></script>
</body>
</html>