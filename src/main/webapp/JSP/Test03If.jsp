<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL:if</title>
</head>
<body>
通过get方法传入`name`的值,进行判断name是否等于1<br />
	<c:if test="${param.name==1}">
		true
	</c:if>
	<c:if test="${param.name!=1}">
		false
	</c:if>
</body>
</html>