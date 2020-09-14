<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Post测试发送页面</title>
</head>
<body>
	<!-- <table style="">
		<caption>表单提交测试</caption>
		<tr>
			<th>测试1</th><th>测试2</th>
		</tr>
		<tr>
			<td>100</td><td>200</td>
		<tr>
	</table> -->

	<a>表单测试</a>
	<form action="/WebServer/post" method="get">
		账户<input type="text" value="value" name="username"><p />
		密码<input type="password" name="password"><p />
		
		<select name="select">
			<option value="x">x</option><!--默认显示-->
			<option>y</option><!--value值默认为<option>标签内的值-->
			<option value="z">z</option>
		</select><p/>
		
		<input type="radio" name="radio" value="radio1">radio1
		<input type="radio" name="radio" value="radio2">radio2<p/>
		
		<input type="checkbox" name="checkbox" value="checkbok1" checked="checked">checkbok1
		<input type="checkbox" name="checkbox" value="checkbok2">checkbok2<p/>
		
		<input type="submit" value="提交"><p/>
	</form>

</body>
</html>