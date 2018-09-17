<%-- 
    Document   : PaymentPage
    Created on : Aug 26, 2017, 10:39:23 PM
    Author     : Vishal Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payment Page</title>
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
            </table></br></br>
            <form name="Payment" action="ConstructionPage.jsp">
                 <table cellspacing="10" align="center" border="+2" bordercolor="black">
              <tr>
                    <td bordercolor="white" ><font color="darkblue">Select Bank ATM:</font></td>
                    <td bordercolor="white">    
                        <select name="Payment">
                            <option value="icici">ICICI BANK</option>
                            <option value="sbi">SBI</option>
                            <option value="pnb">PNB</option>
                            <option value="ald">ALLAHABAD BANK</option>
                        </select>
                 </table></br>
             <table cellspacing='10' align='center' border='2' bordercolor='black'>
            <tr><td bordercolor='white'>Card Number:<td COLSPAN='2' bordercolor='white'><input type='number' name='card' minlength="16" required>
            <tr><td bordercolor='white'>Expiry Date:<td COLSPAN='2' bordercolor='white' > <input type='date' name='exdate' required>
            </tr>
            <tr><td bordercolor='white'>CVV Number:<td COLSPAN='2' bordercolor='white' > <input type='number' name='cvv'  required>
            </tr>
            <tr><td bordercolor='white'>ATM PIN:<td COLSPAN='2' bordercolor='white'><input type='password' name='pin' minlength="4" required>
            <tr><td bordercolor='white'><input type='Submit' value='Submit'>
            <td bordercolor='white'><input type='RESET' text='Reset'>
             </table>
            </form>>
            
    </body>
</html>
