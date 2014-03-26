<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<link href="../resources/css/login.css" rel="stylesheet">

</head>
<body>
	<div class="container">

		<!-- header -->
		<div class="login-header">
			<h2 class="form-signin-heading">나무 커뮤니티</h2>
		</div>

		<!-- form -->
		<form class="form-signin" action="./login.do" method="post">
			<input type="text" name="loginId" class="form-control" id="inputEmail" placeholder="아이디">
			<input type="password" name="password" class="form-control" id="inputPassword"
				placeholder="비밀번호">
			<div class="row form-btn">
				<button class="btn btn-large btn-warning" type="submit">로그인</button>
				<button onclick="location.href='${ctx}/user/joinInput.xhtml'; return false;">회원가입</button>
			</div>
		</form>

		<!-- footer -->
		<div class="login-footer">
			<p>© NamooSori 2014.</p>
		</div>
	</div>

	<script src="../resources/js/jquery-2.1.0.js"></script>
	<script src="../resources/js/bootstrap.min.js"></script>
	<script src="../resources/js/bootswatch.js"></script>
</body>
</html>