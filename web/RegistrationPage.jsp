<%-- 
    Document   : RegistrationPage
    Created on : Jul 19, 2017, 11:21:43 AM
    Author     : Vishal Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
        <jsp:include page="Templatte.jsp"></jsp:include>
         <td valign="top">
            <form method="post" action="LoginPage.jsp">   
                <table cellspacing="10" align="center">
                    <tr>
                        <td><font color="darkblue" size="+2">New User Registration Form</td>
                    </tr>
                </table>    
            <table cellspacing='10' align='center' border='2' bordercolor='black'>
            <tr><td bordercolor='white'>User Name:<td COLSPAN='2' bordercolor='white'><input type='text' name='tt1' required>
            <tr><td bordercolor='white'>User Id:<td COLSPAN='2' bordercolor='white' > <input type='text' name='tt2' required>
            </tr>
            <tr><td bordercolor='white'>Password:<td COLSPAN='2' bordercolor='white' > <input type='password' name='tt3' minlength="6" required>
            </tr>
            <tr><td bordercolor='white'>Re-enter Password:<td COLSPAN='2' bordercolor='white'><input type='password' name='tt4' minlength="6" required>
            <tr><td bordercolor='white'>Address:<td COLSPAN='2' bordercolor='white'><input type='textArea' name='tt5' required>
            <tr><td bordercolor='white'>State:<td COLSPAN='2' bordercolor='white'><input type='text' name='tt6' required>    
            <tr><td bordercolor='white'>Country:<td COLSPAN='2' bordercolor='white'><input type='text' name='tt7' required> 
            <tr><td bordercolor='white'><input type='Submit' value='Submit'>
            <td bordercolor='white'><input type='RESET' text='Reset'>
            </table>
            </form>
    </body>
</html>
