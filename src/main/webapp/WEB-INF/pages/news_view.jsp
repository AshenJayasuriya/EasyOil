<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<!-- adding css and js -->
	<link href="<c:url value="/resources/css/user.css" />" rel="stylesheet">
	<script src="<c:url value="/resources/js/jquery2.0.js" />"></script>
	<script src="<c:url value="/resources/js/main.js" />"></script>
	
    <title>Easy oil</title>
</head>

<body>
	
<h2>Welcome to Easy Oil Corporation User Page</h2>

<%
   Date date = new Date();
   out.print( "<h3>" +date.toString()+"</h3>");
%>

<hr></hr>
<hr></hr>

         <h3>You are Welcome </h3><h3>&nbsp; &nbsp; ${user_name}</h3> 
        
        <br>

        <div class="headline">
   			<h3>${headline} </h3>
   		</div>
   		<br>
        <div class = "content">
        	<h3>${content}</h3>
		</div>
		<br>
        <div class = "val">
            <h3> ${currency_type} &nbsp;&nbsp; ${cost}  </h3> 
      	</div>
      	
	</body>
</html>
