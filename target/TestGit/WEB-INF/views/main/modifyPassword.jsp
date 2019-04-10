<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>添加产品</title>
<link href="../../../resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="../../../resources/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
	<link href="../../../resources/css/public2.css" rel="stylesheet">
	<script src="../../../resources/js/jquery-1.11.1.js"></script>
<script src="../../../resources/bootstrap/js/bootstrap.min.js"></script>
</head>

<body>
	<div class="definewidth m20" enctype="multipart/form-data">
		<table class="table table-bordered table-hover definewidth m10">

			<tr>
				<td class="tableleft">请输入就密码</td>
				<td><input type="password" name="oldPassword" id="oldPassword" value="" /></td>
			</tr>
			<tr>
				<td class="tableleft">情输入新密码</td>
				<td><input type="password" name="onePassword" id="onePassword" value="" /></td>
			</tr>

			<tr>
				<td class="tableleft">请在此输入密码</td>
				<td><input type="password" name="twoPassword" id="twoPassword" value="" /></td>
			</tr>

			<tr>
				<td class="tableleft"></td>
				<td>
					<button type="submit" onclick="modifyPassword();"
						class="btn btn-primary" type="button">保存</button>
					<button type="submit" onclick="Jump();"
							class="btn btn-primary" type="button">返回</button>
				</td>
			</tr>

		</table>
	</div>
	<input id="userId" type="hidden" value=${userId} >
	<script src="../../../resources/js/js/modifyPassword.js" ></script>
</body>
</html>