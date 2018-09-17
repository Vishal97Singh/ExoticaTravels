
package exoticatravels;

import java.sql.*;
import javax.naming.*;
import javax.sql.DataSource;
public class RegistrationDAO {
    Connection con;
    Statement stat;
    ResultSet result;
    PreparedStatement pr;
    public static final int SELECT=1;
    public static final int UPDATE=2;
    public RegistrationDAO(String query,int querytype,String[] params)
    {
        try{
            Context ctx=new InitialContext();
            DataSource ds=(DataSource)ctx.lookup("jdbc/myDatasource");
       con=ds.getConnection();
       if(querytype==SELECT)
           {
           stat=con.createStatement();
           result=stat.executeQuery(query);
           }
           if(querytype==UPDATE)
           {
               pr=con.prepareStatement(query);
               int counter=1;
               for(String s:params)
               {
                  pr.setString(counter,s);
                  counter++;
               }
           }
           
        }
        catch(Exception e)
        {
            
        }
    }
     public RegistrationDAO(String query,int querytype,String url,String username,String password,String params[]) throws SQLException
     {
         con=DriverManager.getConnection(url,username,password);
           if(querytype==SELECT)
           {
         stat=con.createStatement();
           result=stat.executeQuery(query);
           }
           if(querytype==UPDATE)
           {
               pr=con.prepareStatement(query);
               int counter=1;
               for(String s:params)
               {
                   pr.setString(counter,s);
                   counter++;
               }
           }
           
     }
     public ResultSet getResultSetBySelect() throws Exception
     {
          return result;
     }
   
     public ResultSet getResultSet()throws Exception    
     {
         result=pr.executeQuery();
         return result;    
     }
     
     public int getRowsEffected() throws Exception
     {
         return pr.executeUpdate();
     }
}
