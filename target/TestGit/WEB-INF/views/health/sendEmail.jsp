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
				<td class="tableleft">客户列表：</td>
				<td><span >客户列表：</span>
					<select id="customerName" name="customerName">
						<c:forEach items="${list}" var="pc" varStatus="st">
							<option value="${pc}">${pc}</option>
						</c:forEach>
					</select>
				</td>
			</tr>

			<tr>
				<td class="tableleft">请在此输入您想要发送的备注：</td>
				<td><input type="text" name="comments" id="comments" value="" ></td>
			</tr>

			<tr>
				<td class="tableleft"></td>
				<td>
					<button type="submit" onclick="sendEmail();"
						class="btn btn-primary" type="button">发送</button>
					<button type="submit" onclick="Jump();"
							class="btn btn-primary" type="button">返回</button>
				</td>
			</tr>

		</table>
	</div>

	<script src="../../../resources/js/js/sendEmail.js" ></script>
</body>
</html>