/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author kpunv
 */
public class SimpleCalGUI implements ActionListener {
    private JFrame fr;
    private JTextField tf1, tf2, tf3;
    private JButton bn1, bn2, bn3, bn4;
    private JPanel pane1;
    
    public SimpleCalGUI(){
        fr = new JFrame("เครื่องคิดเลข");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        bn1 = new JButton("บวก");
        bn2 = new JButton("ลบ");
        bn3 = new JButton("คูณ");
        bn4 = new JButton("หาร");
        pane1 = new JPanel();
        pane1 = new JPanel();
        
        //add actionListener
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);
        bn4.addActionListener(this);
        
        pane1.setLayout(new FlowLayout());
        pane1.add(bn1);pane1.add(bn2);pane1.add(bn3);pane1.add(bn4);
        
        fr.setLayout(new GridLayout(4,1));
        fr.add(tf1);fr.add(tf2);fr.add(pane1);fr.add(tf3);
        
        fr.setSize(700,500); //350,180
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(bn1)){
            String txt1 = tf1.getText();
            double num1 = Double.parseDouble(txt1);
            String txt2 = tf2.getText();
            double num2 = Double.parseDouble(txt2);
            String plusresult = String.valueOf(num1 + num2);
            tf3.setText(plusresult);
        }
        else if(ae.getSource().equals(bn2)){
            String txt1 = tf1.getText();
            double num1 = Double.parseDouble(txt1);
            String txt2 = tf2.getText();
            double num2 = Double.parseDouble(txt2);
            String plusresult = String.valueOf(num1 - num2);
            tf3.setText(plusresult);
        }
        else if(ae.getSource().equals(bn3)){
            String txt1 = tf1.getText();
            double num1 = Double.parseDouble(txt1);
            String txt2 = tf2.getText();
            double num2 = Double.parseDouble(txt2);
            String plusresult = String.valueOf(num1 * num2);
            tf3.setText(plusresult);
        }
        else if(ae.getSource().equals(bn4)){
            String txt1 = tf1.getText();
            double num1 = Double.parseDouble(txt1);
            String txt2 = tf2.getText();
            double num2 = Double.parseDouble(txt2);
            String plusresult = String.valueOf(num1 / num2);
            tf3.setText(plusresult);
        }
    }
}
