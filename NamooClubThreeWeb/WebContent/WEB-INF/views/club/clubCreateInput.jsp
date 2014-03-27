<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>나무커뮤니티 - 클럽개설</title>
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
					<h1>${communityName}</h1>
					<p>${description}</p>
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
					<form class="form-horizontal" action="${ctx}/club/clubCreateCheck.do?cmId=${cmId}" method="post">
						<fieldset>
							<div class="form-group">
								<label class="col-lg-2 control-label">클럽 카테고리</label>

								<div class="col-lg-10">
									<select class="form-control" id="select" name="clubCategory">
										<option>축구</option>
										<option>야구</option>
										<option>농구</option>
										<option>테니스</option>
										<option>MTB</option>
										<option>탁구</option>
										<option>배드민턴</option>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label" >클럽명</label>

								<div class="col-lg-10">
									<input type="text" name="clubName" class="form-control" placeholder="클럽명">
								</div>
							</div>
							<div class="form-group">
								<label for="textArea" class="col-lg-2 control-label">클럽
									대표문구</label>

								<div class="col-lg-10">
									<textarea class="form-control" rows="3" id="textArea" name="clubDescription"></textarea>
									<span class="help-block">클럽을 소개하는 대표문구를 입력해 주세요. 클럽 홈화면에
										입력하신 문구가 출력됩니다.</span>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label">클럽 멤버 가입을 위한 질문내용</label>

								<div class="col-lg-10">
									<input type="text" name="clubQuOne" class="form-control" placeholder="질문내용 1">
									<input type="text" name="clubQuTwo" class="form-control" placeholder="질문내용 2">
									<input type="text" name="clubQuThree" class="form-control" placeholder="질문내용 3">
								</div>
							</div>
							<div class="form-group">
								<div class="col-lg-10 col-lg-offset-2">
									<button type="submit" class="btn btn-primary">확인</button>
									<button class="btn btn-default" onclick="location.href='${ctx}/club/clubList.do'; return false;">취소</button>
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