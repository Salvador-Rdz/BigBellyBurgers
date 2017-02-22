/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigbellyburgers;

import java.util.ArrayList;

/**
 *
 * @author Salvador
 */
public class HealthyB extends Burger {

    public HealthyB(String meatType, double price)
    {
        super("Brown Rye", meatType,price);
        limExtras=6;
    }
    
    @Override
    public void getTotal()
    {
        System.out.println("This is a Healthy Burger");
        super.getTotal();
    }
}
