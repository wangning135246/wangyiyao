<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>登录界面</title>

<!-- CSS -->
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
<link rel="stylesheet" href="../../../resources/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="../../../resources/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="../../../resources/css/form-elements.css">
<link rel="stylesheet" href="../../../resources/css/style.css">


<!-- 网页标签 -->
<link rel="shortcut icon" href="../../../resources/ico/favicon.png">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="../../../resources/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="../../../resources/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="../../../resources/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="../../../resources/ico/apple-touch-icon-57-precomposed.png">

</head>

<body style="background-image: url(../../../resources/images/loginBg.jpg)">
	<!-- Top content -->
	<div class="top-content">
		<div class="inner-bg">
			<div class="container">
				<div class="row">
					<div class="col-sm-8 col-sm-offset-2 text">
						<h1>
							<strong>后台管理系统</strong>
						</h1>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-6 col-sm-offset-3 form-box">
						<div class="form-top">
							<div class="form-top-left">
								<h2>登录</h2>
								<p>请输入管理员账号和密码：</p>
							</div>
							<div class="form-top-right">
								<i class="fa fa-user"></i>
							</div>
						</div>
						<div class="form-bottom">
								<div class="form-group">
									<label class="sr-only"  for="account">账号</label> <input
										type="text" name="form-username" placeholder="请输入账号"
										class="form-username form-control" id="account">
								</div>
								<div class="form-group">
									<label class="sr-only"  for="password">密码</label> <input
										type="password" name="form-password" placeholder="请输入密码"
										class="form-password form-control" id="password">
								</div>
								<button style="width: 500px" type="submit" class="btn" onclick="login();">登录</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>



	<!-- Javascript -->
	<script src="../../../resources/js/jquery-1.11.1.js"></script>
	<script src="../../../resources/bootstrap/js/bootstrap.min.js"></script>
	<script src="../../../resources/js/jquery.backstretch.js"></script>
	<script src="../../../resources/js/scripts.js"></script>
	<script src="../../../resources/js/js/login.js" ></script>

</body>

</html>