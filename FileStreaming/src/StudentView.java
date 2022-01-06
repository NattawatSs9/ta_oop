import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;

public class StudentView implements ActionListener, WindowListener {
    private JFrame frame;
    private JPanel inputPanel, btnPanel, all;
    private JLabel idL, nameL, moneyL;
    private JTextField idTf, nameTf, moneyTf;
    private JButton deposit, withdraw;

    public StudentView() {
        frame = new JFrame("");
        inputPanel = new JPanel();
        btnPanel = new JPanel();
        all = new JPanel();

        idL = new JLabel("ID : ");
        nameL = new JLabel("Name : ");
        moneyL = new JLabel("Money : ");

        idTf = new JTextField();
        nameTf = new JTextField();
        moneyTf = new JTextField("0");
        moneyTf.setEditable(false);

        deposit = new JButton("Deposit");
        deposit.addActionListener(this);
        withdraw = new JButton("Withdraw");
        withdraw.addActionListener(this);

        btnPanel.add(deposit);
        btnPanel.add(withdraw);

        inputPanel.setLayout(new GridLayout(3, 2));
        inputPanel.add(idL);
        inputPanel.add(idTf);
        inputPanel.add(nameL);
        inputPanel.add(nameTf);
        inputPanel.add(moneyL);
        inputPanel.add(moneyTf);

        all.setLayout(new BorderLayout());
        all.add(inputPanel, BorderLayout.NORTH);
        all.add(btnPanel, BorderLayout.SOUTH);

        frame.add(all);
        frame.addWindowListener(this);
        frame.setSize(300,150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new StudentView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (idTf.getText().length() != 0){
            if (e.getSource().equals(deposit)) {
                moneyTf.setText(String.valueOf(Integer.parseInt(moneyTf.getText()) + 100));
            } else if (e.getSource().equals(withdraw)) {
                moneyTf.setText(String.valueOf(Integer.parseInt(moneyTf.getText()) - 100));
            }
        }
        else {
            return;
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        Student obj;
        try (FileInputStream fin = new FileInputStream("StudentM.dat");
        ObjectInputStream in = new ObjectInputStream(fin)){
            obj = (Student) in.readObject();
            idTf.setText(String.valueOf(obj.getID()));
            nameTf.setText(String.valueOf(obj.getName()));
            moneyTf.setText(String.valueOf(obj.getMoney()));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("Class not match");
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        Student student = new Student(nameTf.getText(), Integer.parseInt(idTf.getText()), Integer.parseInt(moneyTf.getText()));
        try (FileOutputStream f0ut = new FileOutputStream("StudentM.dat");
            ObjectOutputStream oout = new ObjectOutputStream(f0ut)){

            oout.writeObject(student);

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
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
