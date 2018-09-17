<%-- 
    Document   : WelcomeCustomerPage
    Created on : Jul 19, 2017, 11:22:55 AM
    Author     : Vishal Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="ct" uri="WEB-INF/tlds/UserNameTLD.tld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Page</title>
    </head>
    <body>
        <jsp:include page="Template.jsp"></jsp:include>
        <td valign="top" rowspan="200" colspan="80">
            <table>
                <tr><td><font color="darkblue" size="+1"><a href='<c:url value="DomesticPage.jsp" />'><button onmouseover="style.color='red',style.fontSize='40',style.fontStyle='bold'">Domestic Flights</button></a></td>
                    <td><font color="darkblue" size="+1"><a href='<c:url value="InternationalPage.jsp" />'><button onmouseover="style.color='red',style.fontSize='20',style.fontStyle='bold'">International Flights</button></a></td>
                    <td><font color="darkblue" size="+1"><a href='<c:url value="HotelPage.jsp" />'><button onmouseover="style.color='red',style.fontSize='20',style.fontStyle='bold'">Hotels</button></a></td>
                    <td><font color="darkblue" size="+1"><a href='<c:url value="CarRentalPage.jsp" />'><button onmouseover="style.color='red',style.fontSize='20',style.fontStyle='bold'">Car Rentals</button></a></td>
                    <td><font color="darkblue" size="+1"><a href='<c:url value="TourPackage.jsp" />'><button onmouseover="style.color='red',style.fontSize='20',style.fontStyle='bold'">Tour Package</button></a></td>
                   
                    <td width="350">
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                </td>
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
                             <tr>
                            <td>
                            
                            </td>
                        </tr>
                        
                        
                      
        </table>
    </body>
</html>
