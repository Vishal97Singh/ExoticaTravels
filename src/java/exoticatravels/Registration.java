/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exoticatravels;
/**
 *
 * @author Vishal Singh
 */
public class Registration 
{
    private String username,userid,password,address,state,country,groupname;
  
    public Registration(String username, String userid, String password, String address, String state, String country, String groupname)
    {
        this.username = username;
        this.userid = userid;
        this.password = password;
        this.address = address;
        this.state = state;
        this.country = country;
        this.groupname = groupname;
    }

    public String getUsername() {
        return username;
    }

    public String getUserid() {
        return userid;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setUsername(String Username) {
        this.username = Username;
    }

    public void setUserid(String Userid) {
        this.userid = Userid;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }

    public void setAddress(String Address) {
        this.address = Address;
    }

    public void setState(String State) {
        this.state = State;
    }

    public void setCountry(String Country) {
        this.country = Country;
    }

    public void setGroupname(String Groupname) {
        this.groupname = Groupname;
    }
}
