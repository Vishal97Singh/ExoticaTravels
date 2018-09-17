<%-- 
    Document   : HomePage
    Created on : Jul 19, 2017, 11:19:57 AM
    Author     : Vishal Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <jsp:include page="Templatte.jsp"></jsp:include>
      
    <td valign="top"><br/><br/><B><I><font style='font-family: 'Brush Script MT Italics', Gadget, sans-serif;' size='+1' color="darkblue">
      
         <marquee><h2>Hello Welcome To Exotica Travels</h2></marquee></B></I>
        </br>
        </br>
        <form method='post' action="SubmitServlet">
            <table cellspacing='10' align='center'>
                <tr>
                    <td><font color='darkblue' size='+2' >LOGIN AS:</td>
                </tr>
            </table>
            <table cellspacing='10' align='center' border='2' bordercolor='black'>
                <tr> <td bordercolor='white'><input type='radio' value="existinguser" name="r2" CHECKED>Existing User</td></tr>
                <tr><td bordercolor='white'><input type='radio' value="newuser" name="r2">New User</td></tr>
                <tr><td bordercolor='white'><input type='submit' value="submit"></td></tr>
            </table>
        </form>
       
    </body>
</html>
