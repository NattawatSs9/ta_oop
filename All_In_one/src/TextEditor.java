import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class TextEditor implements ActionListener {
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem newItem, openItem, saveItem, closeItem;
    private JFrame jFrame;
    private JTextArea textArea;
    private String text = "";

    public TextEditor(){
        jFrame = new JFrame("My Text Editor");
        textArea = new JTextArea();
        menuBar = new JMenuBar();
        menu = new JMenu("File");
        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        closeItem = new JMenuItem("Close");

        jFrame.setJMenuBar(menuBar);
        menuBar.add(menu);
        menu.add(newItem);
        menu.add(openItem);
        menu.add(saveItem);
        menu.add(closeItem);

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        closeItem.addActionListener(this);

        jFrame.add(textArea);

        jFrame.setSize(500,400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TextEditor();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(newItem)){
            textArea.setText("");
        }
        else if (e.getSource().equals(openItem)){
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(jFrame);
            File f = fc.getSelectedFile();

            try (FileInputStream fin = new FileInputStream(f)){
                int i = fin.read();
                while (i != -1){
                    text += (char) i;
                    i = fin.read();
                }
                textArea.setText(text);
            } catch (IOException ex){
                System.out.println(ex);
            }
        }
        else if (e.getSource().equals(saveItem)){
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(jFrame);
            File f = fc.getSelectedFile();

            try (FileOutputStream f0ut = new FileOutputStream(f)){
                for (int i = 0; i < textArea.getText().length(); i++){
                    f0ut.write(textArea.getText().charAt(i));
                }
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        else if (e.getSource().equals(closeItem)){
            System.exit(0);
        }
    }
}
