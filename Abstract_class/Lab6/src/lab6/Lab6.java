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
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*onepointone();*/
        twopointone();
        threepointone();
    }
    /*public static void onepointone(){
        Flyable f1 = new Flyable();
        Floatable f2 = new Floatable();
        Dieselable d = new Dieselable();
    }*/
    public static void twopointone(){
        Pigeon p1 = new Pigeon(10,15,20);
        System.out.println(p1);
        p1.takeOff();
        System.out.println(p1);
        p1.fly();
        System.out.println(p1);
        p1.landing();
        System.out.println(p1);
        p1.eat("seed");
        System.out.println(p1);
        Pigeon p3 = new Pigeon();
        System.out.println(p3);

    }
    public static void threepointone(){
        Plane p1 = new Plane(200,"IT Airline","FX-747");
        Ship s1 = new Ship(200);

        System.out.println("=== plane ===");
        p1.startEngine();
        p1.takeOff();
        p1.fly();
        p1.fly();
        p1.honk();
        p1.landing();
        p1.stopEngine();

        System.out.println("=== ship ===");
        s1.startEngine();
        s1.move(2);
        s1.honk();
        s1.stopEngine();

    }
}
