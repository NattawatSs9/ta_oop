import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChatDemo implements ActionListener, WindowListener {
    private JFrame frame;
    private JTextArea area;
    private JTextField textField;
    private JButton submit, reset;
    private JPanel all, btnPanel, footPanel;

    public ChatDemo(){
        frame = new JFrame("ChatDemo");
        all = new JPanel(new BorderLayout());
        btnPanel = new JPanel();
        footPanel = new JPanel(new GridLayout(2,1));
        textField = new JTextField();
        area = new JTextArea();
        submit = new JButton("submit");
        reset = new JButton("reset");

        submit.addActionListener(this);
        reset.addActionListener(this);

        area.setEditable(false);
        all.add(area, BorderLayout.CENTER);

        btnPanel.add(submit);
        btnPanel.add(reset);
        footPanel.add(textField);
        footPanel.add(btnPanel);

        all.add(footPanel, BorderLayout.SOUTH);

        frame.addWindowListener(this);
        frame.add(all);
        frame.setSize(350, 350);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ChatDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(submit)){

            String message = textField.getText();
            String keep = area.getText();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String dateTime = dtf.format(LocalDateTime.now());

            String chat = keep + dateTime + " : " + message + "\n";
            area.setText(chat);
        }
        else if (e.getSource().equals(reset)){
            area.setText("");
            try (FileOutputStream fout = new FileOutputStream("ChatDemo.dat")){
                fout.flush();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        String message = "";
        try (FileInputStream fin = new FileInputStream("Chatdemo.dat")){
            int i = fin.read();
            while (i != -1){
                message += (char) i;
                i = fin.read();

            }
        } catch (IOException er) {
            System.out.println("File not found");
        }
        area.setText(message);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        String message = area.getText();
        try (FileOutputStream fout = new FileOutputStream("ChatDemo.dat")){
            for (int i = 0; i < message.length(); i++){
                fout.write(message.charAt(i));
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
