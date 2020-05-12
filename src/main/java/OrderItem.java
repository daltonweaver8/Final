
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dalto
 */
public class OrderItem {
 int ordernumber;
    int linenumber;
    String productid;
    String productdesc;
    int quantity;
    double price;
    
    public OrderItem(){
    
    }
    
    public OrderItem(int on, int ln, String pid, String pdes, int q, double p){
        setOrderNumber(on);
        setLineNumber(ln);
        setProductID(pid);
        setProductDescription(pdes);
        setQuantity(q);
        setPrice(p);
    }
    
    public void setOrderNumber(int on){
        this.ordernumber = on;
    }
    public void setLineNumber(int ln){
        this.linenumber = ln;
    }
    public void setProductID(String pid){
        this.productid = pid;
    }
    public void setProductDescription(String pdes){
        this.productdesc = pdes;
    }
    public void setQuantity(int q){
        this.quantity = q;
    }
    public void setPrice(double p){
        this.price = p;
    }
    
    public int getOrderNumber(){
       return this.ordernumber;
    }
    public int getLineNumber(){
        return this.linenumber;
    }
    public String getProductID(){
        return this.productid;
    }
    public String getProductDescription(){
        return this.productdesc;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public double getPrice(){
        return this.price;
    }
    
    @Override
    public String toString(){
        return "Order Number: " +getOrderNumber()+ 
                "\nLine Number: " +getLineNumber()+ 
                "\nProduct ID: " +getProductID()+
                "\nProduct Description: " +getProductDescription()+
                "\nQuantity: " +getQuantity()+
                "\nPrice: " +getPrice()+ "\n";
    }
}