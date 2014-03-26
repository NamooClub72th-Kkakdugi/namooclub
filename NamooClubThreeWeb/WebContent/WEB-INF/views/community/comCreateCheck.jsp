<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
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
					<h2 id="container">커뮤니티 개설하기</h2>
				</div>

				<div class="well">
					<p>나와 같은 관심사를 가진 멤버를 모집하고 열심히 운영하여 커뮤니티를 성장시켜 보세요.</p>
					<form class="form-horizontal" action="${ctx}/community/comCreate.do" method="post">
						<fieldset>
							<div class="form-group">
								<label class="col-lg-2 control-label">커뮤니티명</label>

								<div class="col-lg-10">
									<input type="text" name="communityName" value="${communityName}" readonly="readonly" class="form-control" placeholder="커뮤니티명">
								</div>
							</div>
							<div class="form-group">
								<label for="textArea"class="col-lg-2 control-label">커뮤니티 대표문구</label>

								<div class="col-lg-10">
									<textarea name="description" class="form-control" readonly="readonly" rows="3" id="textArea">${description}</textarea>
									<span class="help-block">커뮤니티를 소개하는 대표문구를 입력해 주세요. 커뮤니티 홈화면에
										입력하신 문구가 출력됩니다.</span>
								</div>
							</div>
							<div class="form-group">
								<div class="col-lg-10 col-lg-offset-2">
									<button class="btn btn-primary" type="submit">확인</button>
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