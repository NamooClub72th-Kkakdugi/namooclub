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
				<div class="page-header">
					<h2 id="container">${communityName}의멤버목록</h2>
				</div>
					<ul class="list-group">
						<c:forEach var="member" items="${members}">
							<li class="list-group-item"><span class="badge"></span>
							<form action="${ctx}/commission/comCommission.do" method="post">
								<h4>${member.name}</h4>
								<p>${member.email}</p> 
								<input type="hidden" name="name" value="${name}" />
								<input type="hidden" name="cmId" value="${cmId}" /> 
								<input type="hidden" name="email" value="${member.email}" />
								<button type="submit" class="label label-info">위임</button>
							</form>
							</li>
						</c:forEach>
					</ul>
			</div>
		</div>
		<%@ include file="/WEB-INF/views/common/footer.jsp"%>
	</div>
</body>
</html>