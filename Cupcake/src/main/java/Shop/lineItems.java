
package Shop;

import Cupcake.cupcake;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ludvig
 */
public class lineItems {
    int quantity;
    double fullPrice;
    cupcake cc;
    
    public lineItems(int quantity, cupcake cc){
        this.quantity = quantity;
        this.cc = cc;
    }
    
    public void editQuantity(int cha){
        this.quantity = quantity + cha;
    }
    
    public cupcake getCup(){
        return this.cc;
    }
    
<<<<<<< HEAD
    public double getFullPrice(){
=======

    public double getQuantity(){
        return quantity;
    }
    
    

    public double getPrice(){

>>>>>>> b364da3fcf4ed35813666b53b94b338289d7b89d
        return quantity * cc.getPrice(cc.getBottom(), cc.getTop());
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Quantity: " + quantity + ", Cupcake: " + cc + ", FullPrice: " + getFullPrice();
=======
        return "Quantity: " + quantity + ", Cupcake: " + cc + ", FullPrice: " + getPrice();
>>>>>>> b364da3fcf4ed35813666b53b94b338289d7b89d
    }
    
    
}

