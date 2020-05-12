
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dalto
 */
public class Order {
     int ordernumber;
    String customerid;
    String date;
    public Order(){
        
    }
    
    public Order(int on, String cid, String d){
        setOrderNumber(on);
        setCustomerID(cid);
        setDate(d);
    }
    
    public void setOrderNumber(int on){
        this.ordernumber = on;
    }
    public void setCustomerID(String cid){
        this.customerid = cid;
    }
    public void setDate(String d){
        this.date = d;
    }
    
    public int getOrderNumber(){
        return this.ordernumber;
    }
    public String getCustomerID(){
        return this.customerid;
    }
    public String getDate(){
        return this.date;
    }
    @Override
    public String toString(){
        return "Customer ID: " +getCustomerID()+ 
                "\nOrder Number: " +getOrderNumber()+ 
                "\nDate: " +getDate()+ "\n";
    }
}