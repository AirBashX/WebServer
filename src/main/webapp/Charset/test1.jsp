<%-- <%@ page language="java" contentType="text/html; charset=GBK"%> --%>
<%-- <%@ page language="java" pageEncoding="GBK"%> --%>
<%@ page language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= request.getAttribute("charset")
	%>
	1.没有写page且没有乱码,证明page=gbk,使用charset的值<br />
	2.没有写charset且没有乱码,默认编码是gbk,则使用了页面的编码<br />
	3.都没有写,出现乱码,但是切换到gbk时`html`片段,java片段乱码:<br />
	html片段自动识别字符集属于第二种情况,因为在浏览器上设置编码时,顺便给charset设置字符集了,因此修改后html编码可以正常显示<br />
	java片段因为要编译所以出现了乱码<br/>
</body>
</html>