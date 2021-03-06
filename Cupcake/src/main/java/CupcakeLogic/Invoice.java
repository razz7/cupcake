package CupcakeLogic;

import CupcakeLogic.Bottoms;
import CupcakeLogic.Toppings;
import CupcakeLogic.cupcake;
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rumle
 */
public class Invoice {

    private shoppingCart cart;
    private CupcakeLogic.User user;
    private LocalDate date;

    /**
     * Constructor for invoice takes a shoppingCart object, a user objet and a localDate object
     * 
     * @param cart
     * @param user
     * @param date 
     */
    public Invoice(shoppingCart cart, CupcakeLogic.User user, LocalDate date) {
        this.cart = cart;
        this.user = user;
        this.date = date;
    }

    /**
     * returns cart 
     * 
     * @return cart
     */
    public shoppingCart getCart() {
        return cart;
    }

    /**
     * sets cart 
     * 
     * @param cart 
     */  
    public void setCart(shoppingCart cart) {
        this.cart = cart;
    }

    /**
     * returns user
     * 
     * @return uzer
     */
    public CupcakeLogic.User getUser() {
        return user;
    }

    /**
     * sets user
     * 
     * @param user 
     */
    public void setUser(CupcakeLogic.User user) {
        this.user = user;
    }

    /**
     * returns date
     * 
     * @return date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * sets date
     * 
     * @param date 
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }   

    @Override
    public String toString() {
        return "Invoice: " + "cart: " + cart + ", user: " + user + ", date: " + date + '}' + "\n";
    } 
}