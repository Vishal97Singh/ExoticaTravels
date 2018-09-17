<%-- 
    Document   : LoginPage
    Created on : Jul 19, 2017, 11:21:04 AM
    Author     : Vishal Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <jsp:include page="Templatte.jsp"></jsp:include>
        <td valign='top'>
            <form method="post" action="ValidationServlet">
            <table cellspacing='10' align='center'>
            <tr>
            <td><font color='darkblue' size='+2'>Login Form
            </tr>
            </td>
            </table>
            <table cellspacing='10' align='center' border='2' bordercolor='black'>
            <tr><td bordercolor='white'>User Id:<td COLSPAN='2' bordercolor='white'><input type='text' name='uid' required>
            <tr><td bordercolor='white'>Password:<td COLSPAN='2' bordercolor='white'><input type='password' name='pwd' required> 
            <tr><td bordercolor='white'>Role: <td bordercolor='white'><input type='Radio' value='administrator' name='r1'>Administrator
            <td bordercolor='white'><input type='Radio' value='customer' name='r1'>Customer
            </br>
            <tr><td bordercolor='white'><input type='submit' value='Submit' color="red">
            <td bordercolor='white'><input type='RESET' test='Reset'></td>
            </tr>   
            <tr><td> <input type="checkbox" checked="checked"><a href="ConstructionPage.jsp"> Remember me</a></td>
            <td><span class="psw">Forgot <a href="ConstructionPage.jsp">password?</a></span></tr>
            </table>
            </form>
    </body>
</html>
 