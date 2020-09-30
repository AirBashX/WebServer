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
1.通过get方法传入`name`的值,进行判断name是否等于null<br />
	<c:if test="${param.name!=null}">
		name!=null
	</c:if><br />
	<c:if test="${param.name==null}">
		name=null
	</c:if>
2.通过get方法传入`name`的值,将判断结果赋值给name
	<c:if test="${param.name==null}" var="name" scope="page"><br />
		${name}
	</c:if>
	<c:if test="${name}">
		${name}
	</c:if>
</body>
</html>