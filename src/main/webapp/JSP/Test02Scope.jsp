<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP四大域</title>
</head>
<body>
	${name}<br /><!-- 查看获取的优先级 -->
	
	${applicationScope.name}<br />
	<%= application.getAttribute("name") %><br />
	<%= session.getAttribute("name") %><br />
	<%= request.getAttribute("name") %><br />
</body>
</html>