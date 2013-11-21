<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Easy oil</title>
</head>
<body>

<h2>Welcome to easy oil </h2>
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
<textarea rows="10" cols="45" style="FONT-SIZE: x-large;">First News</textarea> 
		<table align="center">
			<tr> <br> <br>  </tr>
			<tr>
				<td>Price </td>
				<td>${ammount}</td>
			</tr>
		</table>
	</body>
</html>