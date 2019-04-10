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
				<td class="tableleft">所属等级</td>
				<td><span >选择等级：</span>
					<select id="customerRole" name="customerRole">
						<c:forEach items="${list}" var="pc" varStatus="st">
							<option value="${pc}">${pc}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td class="tableleft">请输入昵称</td>
				<td><input type="text" name="name" id="name" value="" /></td>
			</tr>
			<tr>
				<td class="tableleft">请输入客户的来源</td>
				<td><input type="text" name="channel" id="channel" value="" /></td>
			</tr>

			<tr>
				<td class="tableleft">用户的性别</td>
				<td><span >用户的性别：</span>
					<select id="sex" name="sex">
						<c:forEach items="${sexList}" var="pc" varStatus="st">
							<option value="${pc}">${pc}</option>
						</c:forEach>
					</select>
				</td>
			</tr>

			<tr>
				<td class="tableleft">请输入客户的电话</td>
				<td><input type="text" name="phone" id="phone" value="" /></td>
			</tr>

			<tr>
				<td class="tableleft">请输入客户的邮箱</td>
				<td><input type="text" name="email" id="email" value="" /></td>
			</tr>

			<tr>
				<td class="tableleft">请输入客户的工作地点</td>
				<td><input type="text" name="industry" id="industry" value="" /></td>
			</tr>
			
			<tr>
				<td class="tableleft">请输入用户的住址</td>
				<td><input type="text" name="address" id="address" value="" /></td>
			</tr>

			<tr>
				<td class="tableleft"></td>
				<td>
					<button type="submit" onclick="addCustomer();"
						class="btn btn-primary" type="button">保存</button>
					<button type="submit" onclick="Jump();"
							class="btn btn-primary" type="button">返回</button>
				</td>
			</tr>

		</table>
	</div>
	<script src="../../../resources/js/js/Customer.js" ></script>
</body>
</html>