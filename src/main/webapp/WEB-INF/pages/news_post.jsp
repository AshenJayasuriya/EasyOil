<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- adding css and js -->
	<link href="<c:url value="/resources/css/admin.css" />" rel="stylesheet">
	<script src="<c:url value="/resources/js/jquery2.0.js" />"></script>
	<script src="<c:url value="/resources/js/main.js" />"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Easy Oil News</title>
</head>
<body>

<h2 ><b>Easy Oil Administrators Page</b></h2>

<%
   Date date = new Date();
   out.print( "<h3>" +date.toString()+"</h3>");
%>

<hr></hr>
<hr></hr>

<p>News Post</p>
<div class = "actionbox">
<form:form method="POST" action="/SpringMVC/news_posted">

	<table align="center">
		<tr>
			<td> Title : </td>
			<td> <form:input path="title"/></td>
		</tr>
		
		<tr>
			<td> Body : </td>
			<td> <form:textarea path="body" cssStyle="width : 364px; height : 109px;"/>
		</tr>
				
		<tr>
			<td> Price : </td>
			<td> <form:input path="price"/>
		</tr>
		
		<tr>
    	<td></td>
        <td colspan="2">
            <input type="submit" value="Post"/>
        </td>
    </tr>
	</table>
</form:form>
</div>


</body>
</html>