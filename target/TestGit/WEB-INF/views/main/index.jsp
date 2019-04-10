<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>后台管理系统</title>

<link href="../../../resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<link href="../../../resources/css/public.css" rel="stylesheet">
	<link rel="shortcut icon" href="../../../resources/ico/favicon.png">
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#sidebar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index">后台管理系统</a>
				<ul class="user-menu">
					<li class="dropdown pull-right">
						<p style="color: white;">
							您好，<span class="glyphicon glyphicon-user"></span>&nbsp;管理员 <a
								href="http://localhost:8080/login/index" style="margin-left: 0px;">【注销退出】</a>
						</p>
					</li>
				</ul>
			</div>
		</div>
		<!-- /.container-fluid -->
	</nav>

	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		<ul class="nav menu">
			<li class="parent "><a class="navBar" data-toggle="collapse"
				href="#sub-item-1"> <i class="glyphicon glyphicon-home"></i>&nbsp;&nbsp;&nbsp;系统管理
					<span class="pull-right glyphicon glyphicon-chevron-down"></span>
			</a>
				<ul class="children collapse" id="sub-item-1">
					<li><a class="mItem" href="http://localhost:8080/login/index"> <span
							class="glyphicon glyphicon-edit"></span> 退出登录
					</a></li>
				</ul></li>
			<li class="parent "><a class="navBar" data-toggle="collapse"
				href="#sub-item-2"> <i class="glyphicon glyphicon-list"></i>&nbsp;&nbsp;&nbsp;客户管理
					<span class="pull-right glyphicon glyphicon-chevron-down"></span>
			</a>
				<ul class="children collapse" id="sub-item-2">
					<li><a class="mItem" onclick="javascript:GetUrl(1)"
						target="commentFrame"> <span class="glyphicon glyphicon-list"></span>
							客户查询
					</a></li>
					<li><a class="mItem" onclick="javascript:GetUrl(2)"
						target="commentFrame"> <span class="glyphicon glyphicon-plus"></span>
							客户添加
					</a></li>
				</ul></li>
			<li class="parent "><a class="navBar" data-toggle="collapse"
				href="#sub-item-3"> <i class="glyphicon glyphicon-tags" ></i>&nbsp;&nbsp;&nbsp;管理员管理
					<span class="pull-right glyphicon glyphicon-chevron-down"></span>
			</a>
				<ul class="children collapse" id="sub-item-3">
					<li><a class="mItem" onclick="adminPower(1)"
						target="commentFrame"> <span class="glyphicon glyphicon-tag"></span>
						管理员管理
					</a></li>
					<li><a class="mItem" onclick="adminPower(0);"
						target="commentFrame"> <span class="glyphicon glyphicon-plus"></span>
						管理员添加
					</a></li>
				</ul></li>
			<li class="parent "><a class="navBar" data-toggle="collapse"
				href="#sub-item-4"> <i class="glyphicon glyphicon-picture"></i>&nbsp;&nbsp;&nbsp;健康管理
					<span class="pull-right glyphicon glyphicon-chevron-down"></span>
			</a>
				<ul class="children collapse" id="sub-item-4">
					<li><a class="mItem" onclick="GetUrl(11)"
						target="commentFrame"> <span
							class="glyphicon glyphicon-picture"></span> 健康查询
					</a></li>
					<li><a class="mItem" onclick="GetUrl(12)"
						target="commentFrame"> <span
							class="glyphicon glyphicon-plus"></span> 添加身体信息
					</a></li>
					<li><a class="mItem" onclick="GetUrl(13)"
						   target="commentFrame"> <span
							class="glyphicon glyphicon-plus"></span> 发送邮件
					</a></li>
				</ul></li>

			<li class="parent "><a class="navBar" data-toggle="collapse"
								   onclick="GetUrl1(${userId})"> <i class="glyphicon glyphicon-tags" ></i>&nbsp;&nbsp;&nbsp;修改密码
				<span class="pull-right glyphicon glyphicon-chevron-down"></span>
			</a>
				</li>


		</ul>
	</div>


	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
		<div class="row">
			<ol class="breadcrumb">
				<li><a><span class="glyphicon glyphicon-home"></span></a></li>
				<li onclick="GetUrl(0)" class="active">首页</li>
			</ol>
		</div>



		<div class="row" style="margin-top: 20px;">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<iframe name="commentFrame" id="Box" src="welcome" frameborder="0"
						scrolling="no" width="100%" height="600px"></iframe>
				</div>
			</div>
		</div>

		<input id="userId" type="hidden" value=${userId} />
		<script src="../../../resources/js/jquery-1.11.1.js"></script>
		<script src="../../../resources/bootstrap/js/bootstrap.min.js"></script>
		<script src="../../../resources/js/js/main.js"></script>

	</div>
	</body>
</html>
