/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author kpunv
 */
import java.awt.BorderLayout;
import javax.swing.*;
public class MmGUI extends JFrame {
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1,m2,m3,m4;
    private JMenuItem mi1, mi2, mi3, mi4, mi5;
    private JDesktopPane dp;
    private JInternalFrame fi1, fi2, fi3;


    
    public MmGUI(){
        fr = new JFrame("SubMenuItem Demo");
        mb = new JMenuBar();
        m1 = new JMenu("File");m2 = new JMenu("Edit");m3 = new JMenu("View");
        fr.setJMenuBar(mb);
        mb.add(m1);mb.add(m2);mb.add(m3);
        
        dp = new JDesktopPane();
        fi1 = new JInternalFrame("Application01", true, true, true,true);
        fi2 = new JInternalFrame("Application02", true, true, true,true);
        fi3 = new JInternalFrame("Application03", true, true, true,true);
        
        mi1 = new JMenuItem("Open");
        mi2 = new JMenuItem("Save");
        mi3 = new JMenuItem("Exit");
        m4 = new JMenu("New");
        mi4 = new JMenuItem("Window");mi5 = new JMenuItem("Message");
        
        m1.add(m4);
        m1.add(mi1);
        m1.addSeparator();
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        m4.add(mi4);
        m4.addSeparator();
        m4.add(mi5);
        
        fi1.getContentPane().add(new JLabel(""));
        fi1.setVisible(true);
        fi1.setLocation(50, 400);
        fi1.setSize(300,200);
        
        fi2.getContentPane().add(new JLabel(""));
        fi2.setVisible(true);
        fi2.setLocation(270, 100);
        fi2.setSize(290,250);
        
        fi3.getContentPane().add(new JLabel(""));
        fi3.setVisible(true);
        fi3.setLocation(600, 300);
        fi3.setSize(500,300);
        
        dp.add(fi1);
        dp.add(fi2);
        dp.add(fi3);
        
        fr.setLayout(new BorderLayout());
        fr.add(dp);
            
        fr.setVisible(true);
        fr.setSize(1200, 700);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> { MmGUI frame = new MmGUI(); });
        }
}
