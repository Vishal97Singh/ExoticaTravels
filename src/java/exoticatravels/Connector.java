/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exoticatravels;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.sql.DataSource;
import javax.naming.NamingException;
import javax.naming.Context;
import javax.naming.InitialContext;
import org.apache.derby.jdbc.ClientDataSource;


/**
 *
 * @author Vishal Singh
 */
public class Connector {
    String username;
    String password;
    String url;
 
    ClientDataSource dc=new org.apache.derby.jdbc.ClientDataSource();
      public void getConnector() throws Exception 
       {
         
    dc.setServerName("LocalHost");
    dc.setUser("exotica");
    dc.setPassword("exotica");
    dc.setPortNumber(1527);
    dc.setDatabaseName("Exotica");
    Context ctx=new InitialContext();
    ctx.rebind("jdbc/MyDB",dc);
    DataSource ds=(DataSource)ctx.lookup("jdbc/MyDB");
    Connection con=DriverManager.getConnection(url,username,password);
   // return con;
         
            }
}
