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
					<select id="customerId" name="customerId">
						<c:forEach items="${list}" var="pc" varStatus="st">
							<option value="${pc}">${pc}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td class="tableleft">心率</td>
				<td><input type="text" name="heartRate" id="heartRate" value="" /></td>
			</tr>
			<tr>
				<td class="tableleft">舒张压</td>
				<td><input type="text" name="diastolicPressure" id="diastolicPressure" value="" /></td>
			</tr>

			<tr>
				<td class="tableleft">收缩压</td>
				<td><input type="text" name="systolicPressure" id="systolicPressure" value="" /></td>
			</tr>

			<tr>
				<td class="tableleft">胆固醇</td>
				<td><input type="text" name="cholesterol" id="cholesterol" value="" /></td>
			</tr>
			
			<tr>
				<td class="tableleft">血糖</td>
				<td><input type="text" name="bloodsugar" id="bloodsugar" value="" /></td>
			</tr>

			<tr>
				<td class="tableleft">体重(kg)</td>
				<td><input type="text" name="weight" id="weight" value="" /></td>
			</tr>

			<tr>
				<td class="tableleft">身高(cm)</td>
				<td><input type="text" name="height" id="height" value="" /></td>
			</tr>

			<tr>
				<td class="tableleft">腰围</td>
				<td><input type="text" name="waistline" id="waistline" value="" /></td>
			</tr>

			<tr>
				<td class="tableleft"></td>
				<td>
					<button type="submit" onclick="addHealth();"
						class="btn btn-primary" type="button">保存</button>
					<button type="submit" onclick="Jump();"
							class="btn btn-primary" type="button">返回</button>
				</td>
			</tr>

		</table>
	</div>
	<script src="../../../resources/js/js/health.js" ></script>
</body>
</html>