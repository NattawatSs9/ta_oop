/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author kpunv
 */
public class Vehicle {
    private int fuel;
    private String topSpeed;
    protected void setFuel(int i){
        fuel = i;
    }
    protected void setTopSpeed(String n){
        topSpeed = n;
    }
    protected int getFuel(){
        return fuel;
    }
    protected String getTopSpeed(){
        return topSpeed;
    }
    public void showInfo(){
        System.out.println("Fuel is "+fuel+" litre and Top Speed is "+topSpeed+" m/s.");
    }
    
}

