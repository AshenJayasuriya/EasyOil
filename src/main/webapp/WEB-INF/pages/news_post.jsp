<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Easy Oil News</title>
</head>
<body>
<h2>Easy Oil</h2>
<form:form method="POST" action="/SpringMVC/news_post">

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
			<td> Author : </td>
			<td> <form:input path="name"/>
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


</body>
</html>