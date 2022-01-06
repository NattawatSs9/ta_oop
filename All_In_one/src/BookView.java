import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.util.ArrayList;

public class BookView implements ActionListener, WindowListener {
    private JFrame frame;
    private JLabel name, price, type;
    private JTextField nameTf, priceTf, amountTf;
    private JButton left, right, add, update, delete;
    private JComboBox typeCb;
    private JPanel gridPanel, amountPanel, btnPanel, botPanel;
    private ArrayList<Book> bookList;
    private BookAdd bookAdd;

    public BookView(){
        frame = new JFrame();
        name = new JLabel("Name");
        price = new JLabel("Price");
        type = new JLabel("Type");
        nameTf = new JTextField();
        priceTf = new JTextField();
        amountTf = new JTextField("0", 3);
        left = new JButton("<<");
        left.addActionListener(this);
        right = new JButton(">>");
        right.addActionListener(this);
        add = new JButton("Add");
        add.addActionListener(this);
        update = new JButton("Update");
        update.addActionListener(this);
        delete = new JButton("Delete");
        delete.addActionListener(this);
        typeCb = new JComboBox();
        gridPanel = new JPanel(new GridLayout(3,2));
        amountPanel = new JPanel();
        btnPanel = new JPanel();
        botPanel = new JPanel(new GridLayout(2,1));
        bookAdd = new BookAdd(this);
        bookList = new ArrayList<>();

        typeCb.addItem("General");
        typeCb.addItem("Computer");
        typeCb.addItem("Math&Sci");
        typeCb.addItem("Photo3");
        typeCb.setSelectedItem("General");

        gridPanel.add(name);
        gridPanel.add(nameTf);
        gridPanel.add(price);
        gridPanel.add(priceTf);
        gridPanel.add(type);
        gridPanel.add(typeCb);

        amountPanel.add(left);
        amountPanel.add(amountTf);
        amountTf.setSize(50,20);
        amountPanel.add(right);

        btnPanel.add(add);
        btnPanel.add(update);
        btnPanel.add(delete);

        botPanel.add(amountPanel);
        botPanel.add(btnPanel);

        frame.add(gridPanel, BorderLayout.CENTER);
        frame.add(botPanel, BorderLayout.SOUTH);

        frame.addWindowListener(this);

        frame.setVisible(true);
        frame.setSize(250,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BookView();
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(left)){
            int value = Integer.parseInt(amountTf.getText()) - 1;
            onStart(value);
        }
        else if (e.getSource().equals(right)){
            int value = Integer.parseInt(amountTf.getText()) + 1;
            onStart(value);
        }
        else if (e.getSource().equals(add)){
            bookAdd.getAddFrame().setVisible(true);
        }
        else if (e.getSource().equals(update)){

        }
        else if (e.getSource().equals(delete)){

        }
    }
    public void onStart(){
        try {
            nameTf.setText(bookList.get(0).getName());
            priceTf.setText(String.valueOf(bookList.get(0).getPrice()));
            typeCb.setSelectedItem(bookList.get(0).getType());
            amountTf.setText("1");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            nameTf.setText("");
            priceTf.setText("");
            typeCb.setSelectedItem("General");
            amountTf.setText("0");
        }
    }
    public void onStart(int index){
        try {
            nameTf.setText(bookList.get(index).getName());
            priceTf.setText(String.valueOf(bookList.get(index).getPrice()));
            typeCb.setSelectedItem(bookList.get(index).getType());
            amountTf.setText(String.valueOf(index+1));
        }
        catch (ArrayIndexOutOfBoundsException ex){
            nameTf.setText("");
            priceTf.setText("");
            typeCb.setSelectedItem("General");
            amountTf.setText("0");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        try (FileInputStream fin = new FileInputStream("Book.dat");
             ObjectInputStream ois = new ObjectInputStream(fin)){
            ArrayList<Book> booksList = (ArrayList<Book>) ois.readObject();
            this.bookList = booksList;
            this.onStart();

        } catch (IOException | ClassNotFoundException ex){
            this.bookList = new ArrayList<>();
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try (FileOutputStream f0ut = new FileOutputStream("Book.dat");
             ObjectOutputStream oos = new ObjectOutputStream(f0ut)){
            oos.writeObject(bookList);
        }
        catch (IOException ex){
            System.out.println(ex);
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
