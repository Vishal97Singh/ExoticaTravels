<%-- 
    Document   : cartt
    Created on : Aug 23, 2017, 12:06:44 AM
    Author     : Vishal Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart Page</title>
    </head>
    <body>
         <jsp:include page="Template.jsp"></jsp:include>
          <td valign="top" rowspan="200" colspan="80">
            <table>
                <tr>
                    <td><font color="darkblue" size="+1" ><a href="PaymentPage.jsp"><button onmouseover="style.color='darkblue',style.fontSize='40',style.fontStyle='bold'">Make Payment</button></a></td>
                    
                    
                    </tr>
            </table>
            <br>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
            <br>
       
         <table>
             <tr>
              <font align="left" color="darkblue" size="+1"><h3>You have added the following contents to your cart:<h3>
              </tr>
         </table>
         <table cellspacing="10" align="left" border="2" bordercolor="black">
                <tr><td bordercolor="white" ><b>Origin:</td><td bordercolor="white">Delhi</td></b>
                <tr><td bordercolor="white" ><b>Destination:</td><td bordercolor="white">Australia</td></b>
                <tr><td bordercolor="white" ><b>Hotel:</td><td bordercolor="white">Hotel sea view</td></b>
                <tr><td bordercolor="white" ><b>Total number of days for stay:</td><td bordercolor="white">15</td></b>
                <tr><td bordercolor="white" ><b>Airline:</td><td bordercolor="white">Australian Airline</td></b>
                <tr><td bordercolor="white" ><b>Total Package Cost</b>:</td><td bordercolor="white">$1200</td> </b>
         </table>
    </body>
</html>
