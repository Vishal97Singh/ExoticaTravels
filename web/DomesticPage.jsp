<%-- 
    Document   : DomesticPage
    Created on : Aug 23, 2017, 10:13:59 PM
    Author     : Vishal Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Domestic Page</title>
    </head>
    <body>
         <table border='0' bgcolor='#000080' align='top' width='100%' style='height:100px'>
            <tr>
            <td bgcolor='#000080' align="center" >
            <font style="font-family: 'Arial Rounded MT Bold' , Gadget, sans-serif;" size='+4' color='FFE4B5'><center>Exotica Travels</center></font>
            </td>
            <td bgcolor='#000080' align='left' width='150' height="200">
                <img src='Images/exotica.png' width='250' height='150' align='right'/>
            </td>
            </tr>
            </table>
       
        <table>
                <tr>
                    <td><font color="darkblue" size="+1"><a href="WelcomeCustomerPage.jsp" ><button onmouseover="style.color='red',style.fontSize='40',style.fontStyle='bold'">Home</button></a></td>
                    <td><font color="darkblue" size="+1"><a href="Logout.jsp" ><button onmouseover="style.color='red',style.fontSize='40',style.fontStyle='bold'">Logout</button></a></td>
                </tr>
            </table>
             <form action="ConstructionPage.jsp" name="myform" method="post">
            <table cellspacing="+2" cellpadding="+2" border="black">
                <tr>
                    <th><button onmouseover="style.color='red',style.fontSize='40',style.fontStyle='bold'">Origin</button></th>
                    <th><button onmouseover="style.color='red',style.fontSize='40',style.fontStyle='bold'">Destination</button></th>
                    <th><button onmouseover="style.color='red',style.fontSize='40',style.fontStyle='bold'">Total Distance(km)</button></th>
                    <th><button onmouseover="style.color='red',style.fontSize='40',style.fontStyle='bold'">Total Time(hrs)</button></th>
                    <th><button onmouseover="style.color='red',style.fontSize='40',style.fontStyle='bold'">Bus Cost(Rs)</button></th>
                    <th><button onmouseover="style.color='red',style.fontSize='40',style.fontStyle='bold'">Flight Cost(Rs)</button></th>
                </tr>
                <tr>
                    <td> Delhi</td>
                    <td> Lucknow</td>
                    <td> 900</td>
                    <td> 13:20</td>
                    <td> 2000</td>
                    <td> 8000</td>
                </tr>
                <tr>
                    <td> Delhi</td>
                    <td> Mumbai</td>
                    <td> 1000</td>
                    <td>15:00 </td>
                    <td> 2000</td>
                    <td> 10000</td>
                </tr>
                <tr>
                    <td> Delhi</td>
                    <td> Kolkata</td>
                    <td> 1600</td>
                    <td> 24:00</td>
                    <td> 2500</td>
                    <td> 11000</td>
                </tr>
                <tr>
                    <td> Delhi</td>
                    <td> Banglore</td>
                    <td> 2500</td>
                    <td> 34:10</td>
                    <td> 4000</td>
                    <td> 15000</td>
                </tr>
                <tr>
                    <td> Delhi</td>
                    <td> Chennai</td>
                    <td> 3898</td>
                    <td> 42:15</td>
                    <td> 4500</td>
                    <td> 16000</td>
                </tr>
                <tr>
                    <td> Delhi</td>
                    <td> Hyderabad</td>
                    <td> 2200</td>
                    <td> 38:25</td>
                    <td> 3800</td>
                    <td> 15500</td>
                </tr>
                <tr>
                    <td> Delhi</td>
                    <td> Gandhinagar</td>
                    <td> 1800</td>
                    <td> 25:00</td>
                    <td> 2650</td>
                    <td> 12200</td>
               
                
                   <td> <table cellspacing="10" align="right" border="+3" bordercolor="black">
           
                    <td bordercolor="white" ><font color="darkblue" size="+2">Select Airline:</font></td>
                    <td bordercolor="white" style="" size="+4">    
                        <select name="Airline" >
                            <option value="British Airline" size="+2"><b>British Airline</b></option>
                            <option value="Cathay Pacific">Cathay Pacific</option>
                            <option value="Australian Airways">Australian Airways</option>
                            <option value="Us Airways">Us Airways</option>
                        </select></td></tr></br></br>
                   <tr> <td bordercolor="white" ><font color="darkblue" size="+2">Select Bus:</font></td>
                    <td bordercolor="white" style="" size="+4">    
                        <select name="Airline" >
                            <option value="British Airline" size="+2"><b>British Airline</b></option>
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
                      <input type="submit" value="Next" size="+4"></input></a>
                  </td>
                  </tr>
             </table>
         <%--<image src="Images/king.jpg" width='350' height='450' align='right'/>--%>
    </body>
</html>
