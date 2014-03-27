<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<title>나무커뮤니티</title>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
</head>
<body>
<%@ include file="/WEB-INF/views/common/mainNavigator.jsp"%>
	<!-- Header ========================================================================================== -->
	<header>
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="jumbotron">
						<h1>나무 커뮤니티와 함께!</h1>
						<p>나무 커뮤니티와 함께 특정 취미와 관심사, 특정 그룹 또는 조직에 관한 대화를 시작하세요.</p>
						<p>
							<a href="${ctx}/view/community/comCreateInput.xhtml?name=${name}"
								class="btn btn-warning btn-lg">커뮤니티 개설하기</a>
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

						<form action="${ctx}/inform/comWithdrawlCheck.do?name=${name}" method="post">
							<ul class="list-group">
								<c:forEach var="community" items="${joinCommunities}">
									<li class="list-group-item"><span class="badge"></span>
										<h4>
											<a href="${ctx}/club/clubList.do">${community.name}</a>
										</h4>
										<p>${community.description}</p>
										<input type="hidden" name="id" value="${community.id}" />
										<button class="btn btn-default btn-sm"
											onclick="location.href='${ctx}/inform/comRemoveCheck.do?id=${community.id}&name=${name}'; return false;">삭제하기</button>
										<input type="submit" value="멤버탈퇴" class="btn btn-default btn-sm" /></li>
								</c:forEach>
							</ul>
						</form>
					</div>
					<!-- ★★★ 미가입 커뮤니티 -->
					<div class="tab-pane fade" id="unjoinded">
						<div class="page-header">
							<h2 id="container">미가입 커뮤니티</h2>
						</div>
						<ul class="list-group">
							<li class="list-group-item"><c:forEach var="community"
									items="${allCommunities}">
									<li class="list-group-item"><span class="badge"></span>
										<h4>
											<a href="${ctx}/club/clubList.do">${community.name}</a>
										</h4>
										<p>${community.description}</p>
										<button class="btn btn-default btn-sm"
											onclick="location.href='${ctx}/community/comJoinInput.xhtml?id=${community.id}&name=${name}'">멤버가입</button></li>
								</c:forEach>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<%@ include file="/WEB-INF/views/common/footer.jsp"%>
	</div>
</body>
</html>