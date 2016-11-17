<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<%@ page import="java.sql.*,javax.sql.*,javax.naming.*"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%@ page import="java.util.List, sample.model.ListModel2" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>

<body>

	<h1>メニュー</h1>

	<p><a href="register.jsp">データ登録</a></p>

	<%
		List<ListModel2> list =(List<ListModel2>)request.getAttribute("ListFormInfo");
		for(int i = 0; i < list.size(); i++) {
			ListModel2 listform = list.get(i);
	%>

	<html:form action="updateview.do" method="post">
		<p><a href="update.do">データ更新</a></p>
	</html:form>

	<%
		}
	%>
	<p><a href="list.do">データ一覧</a></p>

</body>
</html>