<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>나무커뮤니티</title>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
</head>
<body>

<!-- Header ========================================================================================== -->
<header>
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="jumbotron">
                    <h1>건강 커뮤니티</h1>
                    <p>전국민 건강 프로젝트를 진행 중인 커뮤니티입니다. 각종 구기종목 및 헬스 관련 클럽이 있습니다.전국민 건강 프로젝트를 진행 중인 커뮤니티입니다. 각종 구기종목 및 헬스 관련 클럽이 있습니다.</p>
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

            <div class="page-header">
                <h2 id="container">커뮤니티 멤버 가입하기</h2>
            </div>

            <div class="well">
                <p>아래 질문 내용들을 정성껏 작성해 주세요.</p>
                <form class="form-horizontal" action="./index.html">
                    <fieldset>
                        <div class="form-group">
                            <label class="col-lg-2 control-label">커뮤니티 가입 목적은 무엇입니까?</label>

                            <div class="col-lg-10">
                                <input type="text" class="form-control" placeholder="커뮤니티명">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="textArea" class="col-lg-2 control-label">커뮤니티 운영자에게 하고 싶은 말씀은 무엇인가요?</label>

                            <div class="col-lg-10">
                                <textarea class="form-control" rows="3" id="textArea"></textarea>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-lg-10 col-lg-offset-2">
                                <button type="submit" class="btn btn-primary">확인</button>
                                <button class="btn btn-default">취소</button>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</div>
</body>
</html>