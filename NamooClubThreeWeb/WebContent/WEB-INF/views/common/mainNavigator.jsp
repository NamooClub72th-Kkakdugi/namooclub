<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Main Navigation ========================================================================================== -->
<div class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-responsive-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="${ctx}/community/comList.do">나무커뮤니티</a>
		</div>
		<div class="navbar-collapse collapse navbar-responsive-collapse">

			<a class="navbar-brand">${name}님이 로그인 중입니다.</a>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="${ctx}/user/logout.do">로그아웃</a></li>
			</ul>
		</div>
	</div>
</div>
</html>