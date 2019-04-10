<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>修改产品</title>
<link href="../../../resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="../../../resources/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
	<link href="../../../resources/css/public3.css" rel="stylesheet">
	<script src="../../../resources/js/jquery-1.11.1.js"></script>
<script src="../../../resources/bootstrap/js/bootstrap.min.js"></script>
</head>

<body>
	<div class="definewidth m20" enctype="multipart/form-data">
		<input type="hidden" name="healthId" id="healthId" value=${id} />

		<table class="table table-bordered table-hover definewidth m10">

			<tr>
				<td class="tableleft">心率</td>
				<td><input type="text" name="heartRate" id="heartRate" value=${heartRate} ></td>
			</tr>

			<tr>
				<td class="tableleft">胆固醇</td>
				<td><input type="text" name="cholesterol" id="cholesterol" value=${cholesterol} ></td>
			</tr>

			<tr>
				<td class="tableleft">血糖</td>
				<td><input type="text" name="bloodsugar" id="bloodsugar" value=${bloodsugar} ></td>
			</tr>

			<tr>
				<td class="tableleft"></td>
				<td>
					<button type="submit" onclick="modifyHealth();"
						class="btn btn-primary" type="button">保存修改</button>
					<button type="submit" onclick="Jump();"
							class="btn btn-primary" type="button">返回</button>
				</td>
			</tr>
		</table>
	</div>
	<script src="../../../resources/js/js/health.js" ></script>
</body>
</html>