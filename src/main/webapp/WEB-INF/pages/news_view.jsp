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

   <table>
    <tr>
        <td> <h3>Welcome, &nbsp; &nbsp; <h3>${user_name}</h3> </td>
    </tr>
 
</table>  
<div class ="main1">
		<table align="left">
			<tr> <br> <br>  </tr>
			<tr>

        <td><p>${headline}</p></td>

    </tr>

    <tr></tr>

     <tr>
        <td><label>${content}</label></td>
   </tr>
			<tr><tr>
			
			
			<tr>
                            <th colspan="2"> 
                                <h3>Todays Price of a Crude Oil Barrel <h2>
                                <h3> ${currency_type} &nbsp;&nbsp; ${cost}  </h3>  
                            </th>
			</tr>
			
		</table>
</div>

<div class ="img">
		
</div>

	</body>
</html>
