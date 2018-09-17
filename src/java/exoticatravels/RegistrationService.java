/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exoticatravels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author Vishal Singh
 */
import java.sql.ResultSet;
import java.sql.SQLException;
public class RegistrationService {
     String driver="org.apache.derby.jdbc.ClientDriver";
        String url="jdbc:derby://localhost:1527/Exotica";
        String user="exotica", pass="exotica";
     
   // String url;
    String username,userid,password,address,state,country;
    
    // String query="insert into registration(userid,name,password,address,state,country) values(?,?,?,?,?,?)";
    
    
Exception e;
   /* public RegistrationService()
    {
    url="jdbc:derby://localhost:1527/Exotica";
    username="exotica";
    password="exotica";
    }*/
     public void addRegistration(Registration register)
    {
    String query="insert into Registration(userid,name,password,address,state,country) values(?,?,?,?,?,?)";
    String[] params=new String[6];
    params[0]=register.getUsername();
    params[1]=register.getUserid();
    params[2]=register.getPassword();
    params[3]=register.getAddress();
    params[4]=register.getState();
    params[5]=register.getCountry();
   // params[6]=register.getGroupname();
    try{
    RegistrationDAO dao=new RegistrationDAO(query,RegistrationDAO.UPDATE,params);
    int i=  dao.getRowsEffected();
    System.out.println(i);
    }
    catch(Exception e)
    {
    this.e=e;
    }
    }
    public java.util.List getAllRegistrations()
    {
    String query="select * from Registration";
    java.util.List <Registration>registrationlist=new java.util.LinkedList();
    try{
    RegistrationDAO dao=new RegistrationDAO(query,RegistrationDAO.SELECT,url,username,password,null);
    ResultSet result=dao.getResultSetBySelect();
    while(result.next())
    {
    Registration obj=new Registration(result.getString(0),result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6));
    registrationlist.add(obj);
    }
    }
    catch(Exception e)
    {
    this.e=e;
    }
    return registrationlist;
    }
    public Registration getRegistration(String userid)
    {
    try{
    String query="select * from Registration where userid='"+userid+"'";
    RegistrationDAO dao=new RegistrationDAO(query,RegistrationDAO.SELECT,url,username,password,null);
    ResultSet result=dao.getResultSetBySelect();
    String username=result.getString(1);
    //String Userid=result.getString(2);
    String password=result.getString(3);
    String address=result.getString(4);
    String state=result.getString(5);
    String country=result.getString(6);
    String groupname=result.getString(7);
    Registration obj=new Registration(username,userid,password,address,state,country,groupname);
    return obj;
    }
    catch(Exception e)
    {
    }
    return null;
    }
    public boolean deleteRegistration(String userid)
    {
    try{
    String query="delete from Registration where userid=?";
    String[] str=new String[1];
    str[0]=userid;
    RegistrationDAO dao=new RegistrationDAO(query,RegistrationDAO.UPDATE,url,username,password,str);
    int rows=dao.getRowsEffected();
    return true;
    }
    catch(Exception e)
    {
    return false;
    }
    }    

}

