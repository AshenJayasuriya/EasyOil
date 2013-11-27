<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<!-- adding css and js -->
	<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
	<script src="<c:url value="/resources/js/jquery2.0.js" />"></script>
	<script src="<c:url value="/resources/js/main.js" />"></script>
	
    <title>Easy oil</title>
</head>

<body style="background-image: url('http://www.freefever.com/stock/birds-and-leaves-on-yellow-background.jpg');">

<h2 style="margin-left: 400px">Welcome to Easy Oil Coparation User Page</h2>

<%
   Date date = new Date();
   out.print( "<h3>" +date.toString()+"</h3>");
%>

<hr></hr>
<hr></hr>

   <table>
    <tr>
        <td>You are Welcome</td>
        <td>${name}</td>
    </tr>
 
</table>  
		<table align="left">
		
			<tr> <br> <br>  </tr>
			
			
			<tr>
                            <th colspan="2"> 
                                <h3>Todays Price is <h2>
                                <h2> ${currency_type} &nbsp;&nbsp; ${cost}  </h2>  
                            </th>
			</tr>
			
		</table>
		
		
		<div id="msg">
		
		<% out.println("Massages can show here... "); %>>
		
		</div>
		
	</body>
</html>
