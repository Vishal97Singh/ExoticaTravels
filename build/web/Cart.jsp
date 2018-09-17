<%-- 
    Document   : Cart
    Created on : Jul 19, 2017, 11:26:15 AM
    Author     : Vishal Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Cart Page</title>
    </head>
    <body>
    <%--    <%
    Object value = request.getParameter("selDestination");
        %>
        <p><%=value%></p>
        --%>
        <jsp:include page="Template.jsp"></jsp:include>
        <td valign="top" rowspan="200" colspan="80">
            <table>
                <tr>
                <c:set var="Destination" value="${sessionScope.selDestination}"/>
                <c:set var="Hotel" value="${sessionScope.selHotel}"/>
                <c:set var="NumberOfDays" value="${numDays}"/>
                <c:set var="Airline" value="${sessionScope.selAirline}"/>
                
                <c:choose>
                    <c:when test="${Hotel=='Sea View'}">
                        <c:set var="HotelPrice" value="50"/>
                    </c:when>
                    <c:when test="${Hotel=='Sea Breeze'}">
                        <c:set var="HotelPrice" value="40"/>
                    </c:when>
                </c:choose>
                
                <c:choose>
                    <c:when test="${Airline=='British Airways'}">
                        <c:set var="TicketPrice" value="500"/>
                    </c:when>
                    <c:when test="${Airline=='Cathay Pacific'}">
                        <c:set var="TicketPrice" value="400"/>
                    </c:when>
                    <c:when test="${Airline=='US Airways'}">
                        <c:set var="TicketPrice" value="600"/>
                    </c:when>
                    <c:when test="${Airline=='Qantas'}">
                        <c:set var="TicketPrice" value="500"/>
                    </c:when>
                </c:choose>                    
                
                <c:set var="TotalHotelPrice" value="${HotelPrice*NumberOfDays}"/>
                <c:set var="TotalPackagePrice" value="${TotalHotelPrice+Ticketprice}"/>
                                
                <td><font color="darkblue" size="+1" ><a href='<c:url value="DomesticPage.jsp"/>'>Domestic Flights</a></td>
                <td><font color="darkblue" size="+1" ><a href='<c:url value="InternationalPage.jsp"/>'>International Flights</a></td>
                <td><font color="darkblue" size="+1" ><a href='<c:url value="HotelPage.jsp"/>'>Hotels</a></td>
                <td><font color="darkblue" size="+1" ><a href='<c:url value="CarRentalPage.jsp"/>'>Car Rentals</a></td>
                <td><font color="darkblue" size="+1" ><a href='<c:url value="TourPackage.jsp"/>'>Tour Packages</a></td>
                </tr>
            </table>
             <br>
             <font align="center" color="darkblue" size="+1"><h2>You have added the following contents to your cart:</h2>
             </font>
             <br/>
             <br/>
             <br/>
             <table cellspacing="10" align="center" border="2" bordercolor="black">
       
                <tr> <td bordercolor="white" ><b>Destination:<td colspan="2" bordercolor="white"><c:out value="${Destination}"/></b>
                <tr> <td bordercolor="white" ><b>Hotel:<td colspan="2" bordercolor="white"><c:out value="${Hotel}"/></b>
                <tr> <td bordercolor="white" ><b>Total number of days for stay:<td colspan="2" bordercolor="white"><c:out value="${NumberOfdays}"/></b>
                <tr> <td bordercolor="white" ><b>Airline:<td colspan="2" bordercolor="white"><c:out value="${Airline}"/> </b>
                <tr> <td bordercolor="white" ><b>Total Package Cost</b>:<td colspan="2" bordercolor="white"><b><fmt:formatNumber type="Currency" value="${TotalPackagePrice}"/> </b>
             </table>
        
    </body>
</html>
