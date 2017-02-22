/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigbellyburgers;
import java.util.*;
/**
 *
 * @author Salvador
 */
public class Burger {
    private String breadType;
    private String meat;
    private ArrayList<Extra> extras;
    private double price;
    protected int limExtras;
    
    public Burger(String breadType, String meat, double cost)
    {
        this.breadType=breadType;
        this.meat=meat;
        this.extras=new ArrayList<Extra>();
        this.limExtras=4;
    }
    public boolean addExtra(String name, double cost)
    {
        if(this.extras.size()<=limExtras)
        {
            this.extras.add(new Extra(name, cost));
            return true;
        }
        return false;
    }
    public boolean addExtra(Extra extra)
    {
        if(this.extras.size()<=limExtras)
        {         
            return this.extras.add(extra);
        }
        return false;
    }
    public void removeExtra(String name)
    {
        for(Extra dummyExtra: this.extras)
        {
            
        }
    }
    public void getTotal()
    {
        double total=0;
        System.out.println("This is a traditional "+this.meat +" burguer" + "in " + this.breadType + 
                "and with a base price of "+this.price);
        total+=this.price;
        for(Extra dummyExtra : this.extras)
        {
            System.out.println(" plus"+dummyExtra.getExtra() + "at" + dummyExtra.getCost() );
            total+=dummyExtra.getCost();
        }
    }
}
