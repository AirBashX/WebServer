<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table {
		border-collapse: collapse;
	}
</style>
</head>
<body>
1. for(i=0;i&gt;10;i+2)<br />
	<c:forEach begin="0" end="10" step="2" var="i">
		${i}
	</c:forEach><br />
2. 0-3<br />
<table border="1" id="table">
	<tr>
		<th>i</th><th>n.count</th><th>n.index</th><th>n.first</th><th>n.last</th>
	</tr>
		<c:forEach begin="0" end="3" step="1" var="i" varStatus="n">
			<tr>
				<td>${i}</td><td>${n.count}</td><td>${n.index}</td><td>${n.first}</td><td>${n.last}</td>
			<tr>
		</c:forEach>
</table>
</body>
</html>