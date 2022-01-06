/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author kpunv
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalculatorSample implements ActionListener {
    private JFrame frame;
    private JPanel pane1, pane2;
    private JTextField tf;
    private JButton bn1,bn2,bn3,bn4,bn5,bn6,bn7,bn8,bn9,bn10,bn11,bn12,bn13,bn14,bn15,bn16;
    private String blank = "";
    private boolean plus;
    private boolean minus;
    private boolean mult;
    private boolean divide;
    private double num1;
    private double num2;
    private String result = "";
    private double cal;
    
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
        
        //add actionListener
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);
        bn4.addActionListener(this);
        bn5.addActionListener(this);
        bn6.addActionListener(this);
        bn7.addActionListener(this);
        bn8.addActionListener(this);
        bn9.addActionListener(this);
        bn10.addActionListener(this);
        bn11.addActionListener(this);
        bn12.addActionListener(this);
        bn13.addActionListener(this);
        bn14.addActionListener(this);
        bn15.addActionListener(this);
        bn16.addActionListener(this);
        
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
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(bn1)){
            blank += "7";
            tf.setText(blank);
        }
        else if(ae.getSource().equals(bn2)){
            blank += "8";
            tf.setText(blank);
        }
        else if(ae.getSource().equals(bn3)){
            blank += "9";
            tf.setText(blank);
        }
        
        //Plus
        else if(ae.getSource().equals(bn4)){
            if (tf.getText().equals("")){
                num1 = 0;
                tf.setText(blank);
                cal += num1;
                plus = true;
            }
            else{
                String txt1 = tf.getText();
                blank = "";
                num1 = Double.parseDouble(txt1);
                tf.setText(blank);
                cal += num1;
                plus = true;
            }
        }
        
        
        else if(ae.getSource().equals(bn5)){
            blank += "4";
            tf.setText(blank);
        }
        else if(ae.getSource().equals(bn6)){
            blank += "5";
            tf.setText(blank);
        }
        else if(ae.getSource().equals(bn7)){
            blank += "6";
            tf.setText(blank);
        }
        
        //Minus
        else if(ae.getSource().equals(bn8)){
            if (tf.getText().equals("") && num1 == 0){
                blank += "-";
                tf.setText(blank);
            }
            else if(tf.getText().equals("") && num1 != 0){
                num1 = 0;
                tf.setText(blank);
                cal -= num1;
                minus = true;
            }
            else{
                String txt1 = tf.getText();
                blank = "";
                num1 = Double.parseDouble(txt1);
                tf.setText(blank);
                cal -= num1;
                minus = true;
            }
            
        }
        
        
        else if(ae.getSource().equals(bn9)){
            blank += "1";
            tf.setText(blank);
        }
        else if(ae.getSource().equals(bn10)){
            blank += "2";
            tf.setText(blank);
        }
        else if(ae.getSource().equals(bn11)){
            blank += "3";
            tf.setText(blank);
        }
        
        //Multiple
        else if(ae.getSource().equals(bn12)){
            if (tf.getText().equals("")){
                num1 = 1;
                tf.setText(blank);
                if (cal == 0){
                    cal = 1;
                }
                cal *= num1;
                mult = true;
            }
            else{
                String txt1 = tf.getText();
                blank = "";
                num1 = Double.parseDouble(txt1);
                tf.setText(blank);
                if (cal == 0){
                    cal = 1;
                }
                cal *= num1;
                mult = true;
            }
        }
        
        //Divide
        else if(ae.getSource().equals(bn16)){

        }
        
        
        else if(ae.getSource().equals(bn13)){
            blank += "0";
            tf.setText(blank);
        }
        else if(ae.getSource().equals(bn14)){
            num1 = 0;
            num2 = 0;
            result = "";
            blank = "";
            cal = 0;
            tf.setText(blank);
        }
        else if(ae.getSource().equals(bn15)){
            if(plus == true){
                String txt2 = tf.getText();
                blank = "";
                num2 = Double.parseDouble(txt2);
                tf.setText(blank);
                cal += num2;
                plus = false;
                System.out.println(cal);
            }
            else if(minus == true){
                String txt2 = tf.getText();
                blank = "";
                num2 = Double.parseDouble(txt2);
                if (num1 < 0 && num2 < 0){
                    cal += num2;
                }
                else{
                  tf.setText(blank);
                    cal -= num2;
                    minus = false;  
                }
                
                System.out.println(cal);
            }
            else if(mult == true){
                String txt2 = tf.getText();
                blank = "";
                num2 = Double.parseDouble(txt2);
                tf.setText(blank);
                cal *= num2;
                mult = false; 
                System.out.println(cal);
            }
            else if(divide == true){
                
            }
            num1 = cal;
        }
    }
}
