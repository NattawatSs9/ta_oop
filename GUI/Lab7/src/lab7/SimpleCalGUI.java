/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author kpunv
 */
public class SimpleCalGUI {
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
        
        pane1.setLayout(new FlowLayout());
        pane1.add(bn1);pane1.add(bn2);pane1.add(bn3);pane1.add(bn4);
        
        fr.setLayout(new GridLayout(4,1));
        fr.add(tf1);fr.add(tf2);fr.add(pane1);fr.add(tf3);
        
        fr.setSize(350,180);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new SimpleCalGUI();
    }
}
