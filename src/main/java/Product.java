
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dalto
 */
public class Product {
 String productid;
    String description;
    int quantity;
    double price;

    public Product(){
        
    }
    
    public Product(String pid, String desc, int q, double p){
        setProductID(pid);
        setDescription(desc);
        setQuantity(q);
        setPrice(p);
    }
    public void setProductID(String pid){
        this.productid = pid;
    }
    public void setDescription(String desc){
        this.description = desc;
    }
    public void setQuantity(int q){
        this.quantity = q;
    }
    public void setPrice(double p){
        this.price = p;
    }
    
    public String getProductID(){
        return this.productid;
    }
    public String getDescription(){
        return this.description;
    }    
    public int getQuantity(){
        return this.quantity;
    }
    public double getPrice(){
        return this.price;
    }
      @Override
    public String toString(){
        return  "Product ID: " +getProductID()+
                "\nProduct Description: " +getDescription()+
                "\nQuantity: " +getQuantity()+
                "\nPrice: " +getPrice()+ "\n";
    }
}