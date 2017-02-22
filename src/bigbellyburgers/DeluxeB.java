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
public class DeluxeB extends Burger{
    public DeluxeB (String breadType, String meatType, double price, Extra add1, Extra add2)
    {
        super (breadType, meatType, price);
        limExtras=2;
        this.addExtra(add1);
        this.addExtra(add2);
    }
    public DeluxeB (String breadType, String meatType, double price,
            String name1, double price1, String name2, double price2)
    {
        super (breadType, meatType, price);
        limExtras=2;
        this.addExtra(name1, price1);
        this.addExtra(name2, price2);
    }
    @Override
    public void getTotal()
    {
        System.out.println("This is a Deluxe burger");
        super.getTotal();
    }
}
