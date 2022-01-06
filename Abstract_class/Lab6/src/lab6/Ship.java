/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author kpunv
 */
public class Ship extends Vehicle {
    public Ship(){
        super(0.0);
    }
    public Ship(double fuel){
        super(fuel);
    }
    public void move(){
        fl0at();
    }
    public void move(int distance){
        for (double i = 0; i < distance; i++){
            if (fuel < 50){
                System.out.println("Fuel is not enough.");
                break;
            }
            else{
                fl0at();
            }
        }
    }
    public void fl0at(){
        double ff = getfuel();
        if (ff >= 50){
            ff -= 50;
            System.out.println("Ship moves");
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    public void startEngine(){
        double ff = getfuel();
        if (ff >= 10){
            ff -= 10;
            System.out.println("Engine starts");
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    public void stopEngine(){
        System.out.println("Engine stops");
    }
    public void honk(){
        System.out.println("Shhhh");
    }
}
