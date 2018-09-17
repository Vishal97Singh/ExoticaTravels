<%-- 
    Document   : TourPackage
    Created on : Jul 19, 2017, 11:24:40 AM
    Author     : Vishal Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tour Package Page</title>
    </head>
    
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
            <br>
            <font align="center" color="darkblue" size="+1"><h3>Please Select the destination where would you like to go:</h3>
            <br>
            
            <form action="Hotels.jsp" name="myform" method="post" >
            <table cellspacing="10" align="center" border="+2" bordercolor="black">
                <tr>
                    <td bordercolor="white" ><font color="darkblue">Select Origin Place:</font></td>
                    <td bordercolor="white">
                        <select name="Origin">
                             <option value="Switzerland">India</option>
                            <option value="Switzerland">Delhi</option>
                            <option value="Thailand"> Mumbai </option>
                            <option value="Australia">Chennai</option>
                            <option value="United States">Kolkata</option>
                            <option value="HongKong">Banglore</option>
                            <option value="Fizzi">Allahabad</option>
                             <option value="Switzerland">Lucknow</option>
                              <option value="Switzerland">Varanasi</option>
                               <option value="Switzerland">Kanpur</option>
                        </select>
                    </td>
                </tr></br>
                <tr>
                    <td bordercolor="white" ><font color="darkblue">Select Destination:</font></td>
                    <td bordercolor="white">
                        <select name="destination">
                            <option value="Switzerland">Switzerland</option>
                            <option value="Thailand">Thailand</option>
                            <option value="Australia">Australia</option>
                            <option value="United States">United States</option>
                            <option value="HongKong">Hong Kong</option>
                            <option value="Fizzi">Fiji</option>
                        </select>
                        <input type="hidden" value="Destination" name="Pagename"/>
                    </td>
                </tr>
                <tr>
                    <td bordercolor="white">
                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                         &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                         <input type="submit" value="Next"></input></a>
                    </td>
                </tr>
            </table>
            </form>
    

