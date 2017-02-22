/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigbellyburgers;

/**
 *
 * @author Salvador
 */
public class Extra {
    private String extra;
    private double cost;
    
    public Extra(String extra, double cost)
    {
        this.extra=extra;
        this.cost=cost;
    }
    //Getters and Setters
    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
}
