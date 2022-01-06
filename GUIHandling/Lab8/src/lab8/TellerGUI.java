package lab8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kpunv
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TellerGUI extends Account implements ActionListener{
    private JFrame fr;
    private JPanel pane1, pane2;
    private JLabel lb1, lb2;
    private JTextField tf1, tf2;
    private JButton bn1, bn2, bn3;
    
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        pane1 = new JPanel();
        pane2 = new JPanel();
        lb1 = new JLabel("  Balance");
        lb2 = new JLabel("  Amount");
        tf1 = new JTextField(String.valueOf(getBalance()));
        tf2 = new JTextField();
        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");
        
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);
        
        tf1.setEditable(false);
        lb1.setSize(150,60);
        lb2.setSize(150,60);
        tf1.setSize(150,60);
        tf2.setSize(150,60);
        pane1.setLayout(new GridLayout(2,2));
        pane1.add(lb1);pane1.add(tf1);pane1.add(lb2);pane1.add(tf2);
        pane2.setLayout(new FlowLayout());
        pane2.add(bn1);pane2.add(bn2);pane2.add(bn3);
        fr.setLayout(new GridLayout(2,1));
        fr.add(pane1);fr.add(pane2);
        fr.setVisible(true);
        fr.setSize(300,180);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource().equals(bn1)){
            double num = Double.parseDouble(tf2.getText());
            deposit(num);
            tf1.setText(String.valueOf(getBalance()));
            tf2.setText("");
        }
        else if(ae.getSource().equals(bn2)){
            double num = Double.parseDouble(tf2.getText());
            withdraw(num);
            tf1.setText(String.valueOf(getBalance()));
            tf2.setText("");
        }
    }
}
