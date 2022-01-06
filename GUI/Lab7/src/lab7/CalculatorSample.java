/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author kpunv
 */
import javax.swing.*;
import java.awt.*;
public class CalculatorSample {
    private JFrame frame;
    private JPanel pane1, pane2;
    private JTextField tf;
    private JButton bn1,bn2,bn3,bn4,bn5,bn6,bn7,bn8,bn9,bn10,bn11,bn12,bn13,bn14,bn15,bn16;
    
    public CalculatorSample(){
        frame = new JFrame("My Calculator");
        pane1 = new JPanel();
        pane2 = new JPanel();
        tf = new JTextField();
        bn1 = new JButton("7");
        bn2 = new JButton("8");
        bn3 = new JButton("9");
        bn4 = new JButton("+");
        bn5 = new JButton("4");
        bn6 = new JButton("5");
        bn7 = new JButton("6");
        bn8 = new JButton("-");
        bn9 = new JButton("1");
        bn10 = new JButton("2");
        bn11 = new JButton("3");
        bn12 = new JButton("x");
        bn13 = new JButton("0");
        bn14 = new JButton("c");
        bn15 = new JButton("=");
        bn16 = new JButton("/");
        pane1.setLayout(new GridLayout(4,4));
        pane1.add(bn1);pane1.add(bn2);pane1.add(bn3);pane1.add(bn4);pane1.add(bn5);pane1.add(bn6);pane1.add(bn7);pane1.add(bn8);
        pane1.add(bn9);pane1.add(bn10);pane1.add(bn11);pane1.add(bn12);pane1.add(bn13);pane1.add(bn14);pane1.add(bn15);pane1.add(bn16);
        pane2.setLayout(new GridLayout(1,1));
        pane2.add(tf);
        frame.setLayout(new BorderLayout());
        frame.add(pane2, BorderLayout.NORTH);
        frame.add(pane1, BorderLayout.CENTER);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new CalculatorSample();
    }
}
