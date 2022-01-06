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
public class Plane extends Vehicle {
    public void showPlaneInfo(){
        System.out.println("Plane, detail is, Fuel is " +this.getFuel()+ " litre and Top Speed is "+this.getTopSpeed()+ " m/s");
    }
    public void setPlaneInfo(int s, String t){
        setFuel(s);
        setTopSpeed(t);
    }
    public void fly(){
        int x = getFuel();
        if(x >= 200){
            System.out.println("Fly.");
            setFuel(x - 200);
        }
        else{
            System.out.println("Please add fuel.");
        }
    }
}
