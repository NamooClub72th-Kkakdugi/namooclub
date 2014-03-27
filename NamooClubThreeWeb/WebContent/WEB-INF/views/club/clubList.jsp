<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>커뮤니티 내부의 클럽 리스트</title>
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
					<form action="${ctx}/club/clubCreateInput.do" method="get">
						<h1>${communityName}</h1>
						<p>${description}</p>
						<p>
							<input type="submit" class="btn btn-warning btn-lg" value="클럽 개설하기">
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
				<c:forEach var="club" items="${clubs}">
					<ul class="list-group">

						<li class="list-group-item"><span class="badge"></span>
							<h4>
								<span class="label label-primary">${club.category}</span><a
									href="../team/index.html">${club.name}</a>
							</h4>
							<p>${club.description}</p>
							<button type="button" class="btn btn-default btn-sm">멤버탈퇴 신청하기</button></li>
					</ul>
				</c:forEach>
			</div>
		</div>
	</div>
	<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>