<%-- 
    Document   : WelcomeAdminPage
    Created on : Jul 19, 2017, 11:22:24 AM
    Author     : Vishal Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
    </head>
    <body>
        <jsp:include page="Template.jsp"></jsp:include>
        <td valign="top" rowspan="200" colspan="80">
            <table>
                <tr>
                <td><font color="darkblue" size="+1"><a href="<%out.println(response.encodeURL("DomesticPage.jsp").toString());%>"><button onmouseover="style.color='red',style.fontSize='40',style.fontStyle='bold'">Manage Domestic Flights</button></a></td>
                <td><font color="darkblue" size="+1"><a href="<%out.println(response.encodeURL("InternationalPage.jsp").toString());%>"><button onmouseover="style.color='red',style.fontSize='40',style.fontStyle='bold'">Manage International Flights</button></a></td>
                <td><font color="darkblue" size="+1"><a href="<%out.println(response.encodeURL("HotelPage.jsp").toString());%>"><button onmouseover="style.color='red',style.fontSize='40',style.fontStyle='bold'">Manage Hotels</button></a></td>
                <td><font color="darkblue" size="+1"><a href="<%out.println(response.encodeURL("CarRentalPage.jsp").toString());%>"><button onmouseover="style.color='red',style.fontSize='40',style.fontStyle='bold'">Manage Car Rentals</button></a></td>
                <td><font color="darkblue" size="+1"><a href="<%out.println(response.encodeURL("TourPackage.jsp").toString());%>"><button onmouseover="style.color='red',style.fontSize='40',style.fontStyle='bold'">Manage Tour Package</button></a></td>
                <td><font color="darkblue" size="+1"><a href="<%out.println(response.encodeURL("GetLogDetails").toString());%>"><button onmouseover="style.color='red',style.fontSize='40',style.fontStyle='bold'">Get Log Details</button></a></td>
                </tr>
                <tr>
                    <td><br></br>
                        <tr>
                            <td colspan="200" rowspan="80">
                        <font color="brown"size="+2"><marquee>Welcome To Exotica Travels Website!!
                        <font color="brown"size="+2"></marquee><iframe  src="frame.html" height="400" width="320"></iframe> </br>
                                 <%
                                java.util.Date date1=new java.util.Date();
                                out.println(date1.toString());
                                %>
                            </td>
                        </tr>
                        
                      
        </table>
                      
    </body>
</html>
