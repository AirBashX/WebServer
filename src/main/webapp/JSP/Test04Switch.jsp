<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL:Switch</title>
</head>
<body>
通过get方法获取`name`,可以用1,2,other三个选项<br />
	<c:choose>
		<c:when test="${param.name==1}">
			1
		</c:when>
		<c:when test="${param.name==2}">
			2
		</c:when>
		<c:otherwise>
			other
		</c:otherwise>
	</c:choose>
</body>
</html>