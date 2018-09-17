<%-- 
    Document   : DatabasePage
    Created on : Dec 24, 2017, 7:45:23 PM
    Author     : Vishal Singh
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String name = request.getParameter("tt1");
String id = request.getParameter("tt1");
String pass = request.getParameter("tt1");
String address = request.getParameter("tt1");
String state = request.getParameter("tt1");
String country = request.getParameter("tt1");

String driverName ="org.apache.derby.jdbc.ClientDriver";
String connectionUrl = "jdbc:derby://localhost:1527/Exotica ";
String dbName = "Exotica";
String userId = "exotica";
String password = "exotica";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<%--<h2 align="center"><font><strong>Retrieve data from database in jsp</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="#A52A2A">
<td><b>id</b></td>
<td><b>user_id</b></td>
<td><b>Password</b></td>
<td><b>Name</b></td>
<td><b>Email</b></td>
</tr>--%>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl, userId, password);
statement=connection.createStatement();
 String query="insert into Registration(Userid,Name,Password,Address,State,Country) values(?, ?, ?, ?, ?, ?) ";

resultSet = statement.executeQuery(query);
while(resultSet.next()){
%>
<tr bgcolor="#DEB887">

<td>< % statement.setString(1, name); %></td>
<td>< % statement.setString(2, id); %></td>
<td>< % statement.setString(3, pass); %></td>
<td>< % statement.setString(4, address); %></td>
<td>< % statement.setString(5, state); %></td>
<td>< % statement.setString(6, country); %></td>
</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>

     
