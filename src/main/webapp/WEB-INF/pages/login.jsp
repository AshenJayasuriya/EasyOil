<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<style>
body
{
background-image:url('http://www.psdgraphics.com/file/yellow-background.jpg');
}
</style>
    <title>Easy Oil Login</title>
</head>
<body style = "color=blue">
<h2 style= "COLOR: #0000ff; margin-left: 400px">Welcome to Easy oil</h2>
<hr></hr>
<div style="margin-left: 20px; margin-top:50px ;width : 341px; height : 166px">
<form:form method="POST" action="/SpringMVC/admin_user" >
	
	<p style="color:Black;font-style:normal;font-size:medium;font-weight:bold;margin-left: 50px">  Login Here..</p>
   <table align="center">
    <tr>
        <td><form:label path="name" style="FONT-WEIGHT: bold; COLOR: #000000; TEXT-DECORATION: underline;" cssStyle="width : 110px; height : 32px;">User Name</form:label></td>
        <td><form:input path="name" cssStyle=" width : 248px;"/></td>
    </tr>
    <tr>
    	<br>
    </tr>
    <tr>
        <td style="COLOR: #000000;">Password </td>
        <td><form:password path="pass" style="FONT-SIZE: large;" cssStyle=" width : 249px;"/></td>
    </tr>
    <tr>
    	<br>
    </tr>
    <tr>
    	<td></td>
        <td colspan="2">
            <input type="submit" value="Login" style="color: #000000;font-style:normal;background-color:#8B6914;padding:em;"/>
        </td>
    </tr>
</table>  
	
</form:form>
</div>
<div style="margin-left: 450px">
  <img src="http://www.sustainabilityninja.com/wp-content/uploads/2009/03/fuel-efficiency.jpg" alt="fuel" style="width : 341px; height : 298px;">  
</div>
</body>
</html>