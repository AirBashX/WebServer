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
	1.û��дpage��û������,֤��page=gbk,ʹ��charset��ֵ<br />
	2.û��дcharset��û������,Ĭ�ϱ�����gbk,��ʹ����ҳ��ı���<br />
	3.��û��д,��������,�����л���gbkʱ`html`Ƭ��,javaƬ������:<br />
	htmlƬ���Զ�ʶ���ַ������ڵڶ������,��Ϊ������������ñ���ʱ,˳���charset�����ַ�����,����޸ĺ�html�������������ʾ<br />
	javaƬ����ΪҪ�������Գ���������<br/>
</body>
</html>