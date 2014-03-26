<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>나무커뮤니티</title>
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/bootswatch.min.css" rel="stylesheet">
    <style type="text/css">
        body {
            padding-top: 100px;
            padding-bottom: 40px;
            background-color: #ecf0f1;
        }
        .error-header {
            max-width: 500px;
            padding: 15px 29px 25px;
            margin: 0 auto;
            background-color: #e74c3c;
            color: white;
            text-align: left;
            -webkit-border-radius: 15px 15px 0px 0px;
            -moz-border-radius: 15px 15px 0px 0px;
            border-radius: 15px 15px 0px 0px;
            -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
            -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
            box-shadow: 0 1px 2px rgba(0,0,0,.05);
        }
        .error-footer {
            max-width: 500px;
            margin: 0 auto 20px;
            padding-left: 10px;
        }
        .error-body {
            max-width: 500px;
            padding: 29px;
            margin: 0 auto 20px;
            background-color: #fff;
            -webkit-border-radius: 0px 0px 15px 15px;
            -moz-border-radius: 0px 0px 15px 15px;
            border-radius: 0px 0px 15px 15px;
            -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
            -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
            box-shadow: 0 1px 2px rgba(0,0,0,.05);
        }
        .error-heading {
            margin-bottom: 15px;
        }
        .error-btn {
            text-align: center;
            padding-top: 20px;
        }

    </style>
</head>

<body>
<div class="container">

    <!-- header -->
    <div class="error-header">
        <h2 class="error-heading">페이지 에러</h2>
    </div>

    <!-- body -->
    <div class="error-body">

        <h3>존재하지 않는 페이지입니다. url을 확인하세요.</h3>
        <p>요청페이지 :</p>

        <div class="row error-btn">
            <button class="btn btn-large btn-default" onclick=history.back();>이전화면으로 이동</button>
        </div>
    </div>

    <!-- footer -->
    <div class="error-footer">
        <p>© NamooSori 2014.</p>
    </div>
</div>

<script src="js/jquery-2.1.0.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/bootswatch.js"></script>
</body>
</html>