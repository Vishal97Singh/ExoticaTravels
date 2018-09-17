
<%-- 
    Document   : HotelPage
    Created on : Aug 23, 2017, 10:15:09 PM
    Author     : Vishal Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>International Page</title>
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
            
            <image src="Images/king.jpg" width='350' height='450' align='left'/>
             <form action="ConstructionPage.jsp" name="myform" method="post">
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
             <image src="Images/king.jpg" width='350' height='450' align='right'/>
    </body>
</html>
