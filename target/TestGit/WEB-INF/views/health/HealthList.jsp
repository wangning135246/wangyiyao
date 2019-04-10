<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*" 	%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>产品管理</title>
<link href="../../../resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="../../../resources/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
	<link href="../../../resources/css/public1.css" rel="stylesheet">
	<script src="../../../resources/js/jquery-1.11.1.js"></script>
<script src="../../../resources/bootstrap/js/bootstrap.min.js"></script>

</head>

<body>
	<div class="form-inline definewidth m20" >
		客户名称：
		<input type="text" name="customerName" id="customerName"
			class="abc input-default" value="" placeholder="请输入客户的名字">&nbsp;&nbsp;
		<button type="submit" class="btn btn-primary" onclick="selectHealth();">查询</button>
	</div>
	<table class="table table-bordered table-hover definewidth m10"
		style="margin-top: 20px;text-align:center;">
		<thead>
			<tr>
				<th>客户的ID</th>
				<th>用户的名字</th>
				<th>用户的性别</th>
				<th>心率情况(60~80)</th>
				<th>血压情况</th>
				<th>胆固醇(3.1~5.2)Mmod/L</th>
				<th>血糖指数(3.9~6.1)Mmod/L</th>
				<th>体重情况</th>
				<th>腰围指数</th>
				<th>创建时间</th>
				<th>操作</th>
			</tr>
		</thead>
			<tbody id="content">

			</tbody>
	</table>
		<script src="../../../resources/js/js/health.js" ></script>
</body>
</html>