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
public class Calculator implements ActionListener {
    private JFrame frame;
    private JPanel pane1, pane2;
    private JTextField tf;
    private JButton bn1,bn2,bn3,bn4,bn5,bn6,bn7,bn8,bn9,bn0,bnplus,bnminus,bnmult,bndivide,bnequal,bnclear;
    private String blank = "";
    private String text= "";
    private boolean plus = false;
    private boolean minus = false;
    private boolean mult = false;
    private boolean divide = false;

    
    public Calculator(){
        frame = new JFrame("My Calculator");
        pane1 = new JPanel();
        pane2 = new JPanel();
        tf = new JTextField();
        bn1 = createBtn("1");
        bn2 = createBtn("2");
        bn3 = createBtn("3");
        bn4 = createBtn("4");
        bn5 = createBtn("5");
        bn6 = createBtn("6");
        bn7 = createBtn("7");
        bn8 = createBtn("8");
        bn9 = createBtn("9");
        bn0 = createBtn("0");
        bnplus = createBtn("+");
        bnminus = createBtn("-");
        bnmult = createBtn("x");
        bndivide = createBtn("/");
        bnequal = createBtn("=");
        bnclear = createBtn("c");
        
        //add actionListener
        
        pane1.setLayout(new GridLayout(4,4));
        pane1.add(bn7);pane1.add(bn8);pane1.add(bn9);pane1.add(bnplus);
        pane1.add(bn4);pane1.add(bn5);pane1.add(bn6);pane1.add(bnminus);
        pane1.add(bn1);pane1.add(bn2);pane1.add(bn3);pane1.add(bnmult);
        pane1.add(bn0);pane1.add(bnclear);pane1.add(bnequal);pane1.add(bndivide);
        pane2.setLayout(new GridLayout(1,1));
        pane2.add(tf);
        frame.setLayout(new BorderLayout());
        frame.add(pane2, BorderLayout.NORTH);
        frame.add(pane1, BorderLayout.CENTER);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(bn1)){
            blank += "1";
            tf.setText(blank);
        }
        else if (e.getSource().equals(bn2)){
            blank += "2";
            tf.setText(blank);
        }
        else if (e.getSource().equals(bn3)){
            blank += "3";
            tf.setText(blank);
        }
        else if (e.getSource().equals(bn4)){
            blank += "4";
            tf.setText(blank);
        }
        else if (e.getSource().equals(bn5)){
            blank += "5";
            tf.setText(blank);
        }
        else if (e.getSource().equals(bn6)){
            blank += "6";
            tf.setText(blank);
        }
        else if (e.getSource().equals(bn7)){
            blank += "7";
            tf.setText(blank);
        }
        else if (e.getSource().equals(bn8)){
            blank += "8";
            tf.setText(blank);
        }
        else if (e.getSource().equals(bn9)){
            blank += "9";
            tf.setText(blank);
        }
        else if (e.getSource().equals(bn0)){
            blank += "0";
            tf.setText(blank);
        }
        else if (e.getSource().equals(bnplus)){
            text = blank;
            blank = "";
            tf.setText(blank);
            plus = true;
            
        }
        else if (e.getSource().equals(bnminus)){
            text = blank;
            blank = "";
            tf.setText(blank);
            minus = true;
        }
        else if (e.getSource().equals(bnmult)){
            text = blank;
            blank = "";
            tf.setText(blank);
            mult = true;
        }
        else if (e.getSource().equals(bndivide)){
            text = blank;
            blank = "";
            tf.setText(blank);
            divide = true;
        }
        else if (e.getSource().equals(bnequal)){
            if (plus){
                Cal("+");
            }
            else if (minus){
                Cal("-");
            }
            else if (mult){
                Cal("*");
            }
            else if (divide){
                Cal("/");
            }
        }
        else if (e.getSource().equals(bnclear)){
            blank = "";
            text = "";
            tf.setText(blank);
        }
        
    }
    private JButton createBtn(String name){
            JButton btn = new JButton(name);
            btn.addActionListener(this);
            return btn;
        }
    private void Cal(String p){
        double num1 = Double.parseDouble(text);
        double num2 = Double.parseDouble(blank);
        if (p.equals("+")){
            blank = String.valueOf(num1 + num2);
            tf.setText(blank);
            text = "";
            System.out.println(blank);
            plus = false;
        }
        else if (p.equals("-")){
            blank = String.valueOf(num1 - num2);
            tf.setText(blank);
            text = "";
            System.out.println(blank);
            minus = false;
        }
        else if (p.equals("*")){
            blank = String.valueOf(num1 * num2);
            tf.setText(blank);
            text = "";
            System.out.println(blank);
            mult = false;
        }
        else if (p.equals("/")){
            if (num2 == 0){
                blank = "Error! Divider can't be Zero number";
                tf.setText(blank);
                text = "";
                System.out.println(blank);
                divide = false;
            }
            else {
                blank = String.valueOf(num1 / num2);
                tf.setText(blank);
                text = "";
                System.out.println(blank);
                divide = false;
            }
        }
    }

}