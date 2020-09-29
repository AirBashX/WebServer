<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP基础语法</title>
</head>
<body>
	<% out.write("<%:"); %><br />
	<% out.write("<%:out.write"); %><br />
	<% out.print("<%:out.print"); %><br />
	<% out.println("<%:out.println"); %><br />
	
	<%= "<%=" %><br />
</body>
</html>