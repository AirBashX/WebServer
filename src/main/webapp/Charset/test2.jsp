<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="GBK">
<title>检测JSP编码2</title>
</head>
<body>
Post提交数据
	<form action="/WebServer/test2" method="post">
		账号<input type="text" name="text" value="测试ABC"><p />
		密码<input type="password" name="password"><p />
		<input type="submit">
	</form>
</body>
</html>