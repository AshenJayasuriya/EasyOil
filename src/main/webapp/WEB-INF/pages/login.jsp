<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<!-- adding css and js -->
	<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
	<script src="<c:url value="/resources/js/jquery2.0.js" />"></script>
	<script src="<c:url value="/resources/js/main.js" />"></script>

    <title>Easy Oil Login</title>
</head>
<body>
<h2>WELCOME TO EASY OIL COPARATION</h2>

<%
   Date date = new Date();
   out.print( "<h3>" +date.toString()+"</h3>");
%>

<hr></hr>
<hr></hr>

<div class= "data">
<form:form method="POST" action="/SpringMVC/admin_user" >
	
	<p>Sign in Here</p>
   <table align="center">
    <tr>
        <td><form:label path="name" style="FONT-WEIGHT: bold; COLOR: #000000; TEXT-DECORATION: underline;" cssStyle="width : 110px; height : 32px;">User Name</form:label></td>
        <td><form:input path="name" cssStyle=" width : 248px;"/></td>
    </tr>
    <tr>
    	<br>
    </tr>
    <tr>
        <td>Password </td>
        <td><form:password path="pass" style="FONT-SIZE: large;" cssStyle=" width : 249px;"/></td>
    </tr>
    <tr>
    	<br>
    </tr>
    
    <tr>
    	<td colspan="2"><h5>${login_error}</h5></td>
    </tr>
    
    <tr>
    	
    	
    	
        <td colspan="2">
        
        <input type="checkbox" name="checkbox" value="value"> Keep Me Logged in
        <br>
        <br>
            <input type="submit" value="Login" class="testbutton"/>
        </td>
    </tr>
</table>  

<br>
<a style="margin-left: 60px " href="https://www.facebok.com">Forgot Password</a>

</form:form>
</div>
<div class = "data1">
  <!--  <img src="../../fuel-efficiency.jpg" alt="fuel" style="width : 341px; height : 298px;">  -->
</div>
</body>
</html>