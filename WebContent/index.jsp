<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<style type="text/css">
	table {
		margin-top: 50px;
		margin-bottom: 50px;
	}
</style>
</head>
<body>

<div class="col-xs-1 col-sm-1 col-md-1"></div>
<table border="1" class="col-xs-10 col-sm-10 col-md-10 table-responsive">
	<tr>
		<td colspan="2">대가리</td>
	</tr>
	
	<tr>
		<td style="height: 150px;">
			<div class="col-xs-12 col-sm-12 col-md-12">
				<jsp:include page="login/login.html" ></jsp:include>
			</div>
		</td>
		<td class="col-xs-10 col-sm-10 col-md-10" rowspan="2">
			<jsp:include page="${param.mode }.jsp"></jsp:include>
		</td>
	</tr>
	
	<tr>
		<td>
			<jsp:include page="menu.html"></jsp:include>
		</td>
	</tr>
</table>
<div class="col-xs-1 col-sm-1 col-md-1"></div>
</body>
</html>
