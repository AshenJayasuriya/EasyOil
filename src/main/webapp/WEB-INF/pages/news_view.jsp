<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Easy oil</title>
</head>
<body style="background-image: url('http://www.freefever.com/stock/birds-and-leaves-on-yellow-background.jpg');">

<h2 style="margin-left: 450px">Welcome to Easy Oil </h2>
<hr></hr>
   <table>
    <tr>
        <td>Name</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>Password</td>
        <td>${password}</td>
    </tr>
    
    <tr>
        <td> </td>
        <td> <br></td>
    </tr>

</table> 
<textarea rows="10" cols="45" style="FONT-SIZE: x-large; width : 517px; height : 112px;">Add News here</textarea> 
		<table align="center">
			<tr> <br> <br>  </tr>
			<tr>
				<td>Price </td>
				<td>${ammount}</td>
			</tr>
		</table>
	</body>
</html>