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

<h2 style="margin-left: 450px">Welcome to Easy Oil </h2>
<hr></hr>
   <table align="center">
    <tr>
        <td> <h3> Hello &nbsp;  </h3> </td>
        <td> <h2> ${user_name} </h2> </td>
    </tr>
    
    <tr>
        <td> </td>
        <td> <br></td>
    </tr>

</table> 
 
		<table align="center">
			<tr> <td> <textarea rows="10" cols="45" style="FONT-SIZE: x-large; width : 517px; height : 112px;">Add News here</textarea> </td> </tr>
			<tr>
				<th colspan="2"> <h2>Today Price is <h1> ${currency_type} &nbsp; ${ammount}  </h2>  </th>
			</tr>
		</table>
		
		<h1>Colour is Green</h1>
 
		<h2> Java script Test</h2>
		<div id="msg"></div>
		
	</body>
</html>