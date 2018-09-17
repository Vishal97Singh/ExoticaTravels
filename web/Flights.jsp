<%-- 
    Document   : Flights
    Created on : Jul 19, 2017, 11:25:48 AM
    Author     : Vishal Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Flights Page</title>
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
             <font align="center" color="darkblue" size="+1"><h3>Please select the airline by which you want to go to your destination:</h3>
             <br>
             <br>
             <form action="cartt.jsp" name="myform" method="post">
             <table cellspacing="10" align="center" border="+2" bordercolor="black">
              <tr>
                    <td bordercolor="white" ><font color="darkblue">Select Airline:</font></td>
                    <td bordercolor="white">    
                        <select name="Airline">
                            <option value="British Airline">British Airline</option>
                            <option value="Cathay Pacific">Cathay Pacific</option>
                            <option value="Australian Airways">Australian Airways</option>
                            <option value="Us Airways">Us Airways</option>
                        </select>
                        <input type="hidden" name="PageName" value="FlightsServlet"/>
                    </td>
              </tr>
              <tr>
                  <td bordercolor="white">
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      <input type="submit" value="Next"></input></a>
                  </td>
                  </tr>
             </table>
        </form>
    </body>
</html>
