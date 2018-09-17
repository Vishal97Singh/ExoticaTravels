<%-- 
    Document   : Hotels
    Created on : Jul 19, 2017, 11:25:30 AM
    Author     : Vishal Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hotel Page</title>
    </head>
    <body>
        <jsp:include page="Template.jsp"></jsp:include>
        <td valign="top" rowspan="200" colspan="80">
            <table>
                <tr>
                    <td><font color="darkblue" size="+1" ><a href="DomesticPage.jsp"><button onmouseover="style.color='darkblue',style.fontSize='40',style.fontStyle='bold'">Domestic Flights</button></a></td>
                    <td><font color="darkblue" size="+1" ><a href="InternationalPage.jsp"><button onmouseover="style.color='green',style.fontSize='40',style.fontStyle='bold'">International Flights</button></a></td>
                    <td><font color="darkblue" size="+1" ><a href="HotelPage.jsp"><button onmouseover="style.color='darkblue',style.fontSize='40',style.fontStyle='bold'">Hotels</button></a></td>
                    <td><font color="darkblue" size="+1" ><a href="CarRentalPage.jsp"><button onmouseover="style.color='green',style.fontSize='40',style.fontStyle='bold'">Car Rentals</button></a></td>
                    <td><font color="darkblue" size="+1" ><a href="TourPackage.jsp"><button onmouseover="style.color='darkblue',style.fontSize='40',style.fontStyle='bold'">Tour Packages</button></a></td>
                </tr>
            </table>
            <br>
            <font align="center" color="darkblue" size="+1"><h3>Please Select the Hotel in which would you like to stay:</h3>
            <br>
            <br>
            <form action="Flights.jsp" name="myform" method="post">
            <table cellspacing="10" align="center" border="+2" bordercolor="black">
                <tr>
                    <td bordercolor="white" ><font color="darkblue">Select Hotel:</font></td>
                    <td bordercolor="white">
                        <select name="HotelName">
                            <option value="Sea View">Hotel Sea View</option>
                            <option value="Sea Breeze">Hotel Sea Breeze</option>
                        </select>
                           </td>
                </tr>
                   <tr>
                       <td bordercolor="while">Number of Days</td>
                       <td bordercolor="white"><input type="text" name="numOfDays" required></td>
                   </tr>
                   <tr>
                       <td bordercolor="white">
                      &nbsp; &nbsp;&nbsp; 
                     
                      <input type="submit" value="Next"></input></a>
                      <input type="hidden" name="PageName" value="Hotels"/>
                       </td>
                   </tr>
            </table>
    </body>
</html>
