

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dalto
 */
public class Customer {
    String customerid;
    String firstname;
    String lastname;
    String phonenumber;
    
    public Customer(){
        
    }
    
    public Customer(String cid, String fn, String ln, String pn){
        setCustomerID(cid);
        setFirstName(fn);
        setLastName(ln);
        setPhoneNumber(pn);
    }
    
    public void setCustomerID(String cid){
        this.customerid = cid;
    }
    public void setFirstName(String fn){
        this.firstname= fn;
    }
    public void setLastName(String ln){
        this.lastname = ln;
    }
    public void setPhoneNumber(String pn){
        this.phonenumber = pn;
    }
    
    public String getCustomerID(){
        return this.customerid;
    }
    public String getFirstName(){
        return this.firstname;
    }
    public String getLastName(){
        return this.lastname;
    }
    public String getPhoneNumber(){
        return this.phonenumber;
    }
    
    @Override
    public String toString(){
        return "Customer ID: " +getCustomerID()+ 
                "\nFirst Name: " +getFirstName()+ 
                "\nLast Name: " +getLastName()+ 
                "\nPhone Number: " +getPhoneNumber()+ "\n";
    }
}