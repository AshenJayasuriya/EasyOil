<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>Easy Oil Login</title>
</head>
<body>

<h2>Easy Oil </h2>
<form:form method="POST" action="/SpringMVC/admin_user">
   <table align="center">
    <tr>
        <td><form:label path="name">User Name</form:label></td>
        <td><form:input path="name" /></td>
    </tr>
    <tr>
    	<br>
    </tr>
    <tr>
        <td>Password :</td>
        <td><form:password path="pass"/></td>
    </tr>
    <tr>
    	<br>
    </tr>
    <tr>
    	<td></td>
        <td colspan="2">
            <input type="submit" value="Login"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>