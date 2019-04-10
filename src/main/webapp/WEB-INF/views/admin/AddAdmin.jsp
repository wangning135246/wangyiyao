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
				<td class="tableleft">管理员的名字</td>
				<td><input type="text" name="name" id="name" value=${name} ></td>
			</tr>


			<tr>
				<td class="tableleft">管理员的电话</td>
				<td><input type="text" name="phone" id="phone" value=${phone} ></td>
			</tr>

			<tr>
				<td class="tableleft">管理员的账号</td>
				<td><input type="text" name="account" id="account" value=${account} ></td>
			</tr>

			<tr>
				<td class="tableleft">管理员的权限</td>
				<td><select id="roleName" name="pcid">
					<c:forEach items="${roleName}" var="pc" varStatus="st">
						<option value="${pc}">${pc}</option>
					</c:forEach>
				</select></td>
				</select></td>
			</tr>

			<tr>
				<td class="tableleft">管理员的地址</td>
				<td><input type="text" name="address" id="address" value=${address} ></td>
			</tr>

			<tr>
				<td class="tableleft"></td>
				<td>
					<button type="submit" onclick="addAdmin();"
						class="btn btn-primary" type="button">保存</button>
					<button type="submit" onclick="Jump();"
							class="btn btn-primary" type="button">返回</button>
				</td>
			</tr>

		</table>
	</div>
	<script src="../../../resources/js/js/admin.js" ></script>
</body>
</html>