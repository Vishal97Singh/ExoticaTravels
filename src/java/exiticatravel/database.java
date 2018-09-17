/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exiticatravel;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author Vishal Singh
 */
public class database {
    public static void main(String[] args) {
        // TODO code application logic here
        String driver="org.apache.derby.jdbc.ClientDriver";
        String url="jdbc:derby://localhost:1527/Exotica";
        String user="exotica", pass="exotica";
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("enter employee name: ");
            String name=request.getparameter("tt1");
                    
            sc.nextLine();
             System.out.print("enter emplqoyee userId: ");
           String userId=request.getparameter("tt2");
            //sc.next();
             System.out.print("enter employee password: ");
            String password=request.getparameter("tt3");
            //sc.next();
             System.out.print("enter employee address: ");
            String address=request.getparameter("tt5");
            //sc.next();
            
             System.out.print("enter employee state: ");
           String state=sc.nextLine();request.getparameter("tt6");
            //sc.next();
             System.out.print("enter employee country: ");
            String country=request.getparameter("tt7");
            
            
            String query="insert into registration(name,userId,password,address,state,country) values(?, ?, ?, ?, ?, ?) ";
            
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url, user, pass);
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, userId);
            ps.setString(3, password);
            ps.setString(4, address);
            ps.setString(5, state);
            ps.setString(6, country);
            int result=ps.executeUpdate();
            System.out.println(result+" record/s inserted in emp table");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }    
}
