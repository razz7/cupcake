/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CupcakeLogic;

import CupcakeLogic.Invoice;
import CupcakeLogic.shoppingCart;
import CupcakeLogic.User;
import java.time.LocalDate;

/**
 *
 * @author Rasmus2
 */
public class transaction extends Invoice {

    /**
     * Creates an invoice
     * 
     * @param cart
     * @param user
     * @param date 
     */
    public transaction(shoppingCart cart, User user, LocalDate date) {
        super(cart, user, date);
    }
}
