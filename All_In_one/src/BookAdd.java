import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookAdd implements ActionListener {
    private JFrame addFrame;
    private JLabel addName, addPrice, addType;
    private JComboBox typeCb;
    private JTextField addNameTf, addPriceTf;
    private JButton insert;
    private BookView bookView;
    private JPanel dataPanel;

    public BookAdd(BookView bookView){
        this.bookView = bookView;
        addFrame = new JFrame();
        addName = new JLabel("Name");
        addPrice = new JLabel("Price");
        addType = new JLabel("Type");
        typeCb = new JComboBox();
        typeCb.addItem("General");
        typeCb.addItem("Computer");
        typeCb.addItem("Math&Sci");
        typeCb.addItem("Photo3");
        typeCb.setSelectedItem("General");
        addNameTf = new JTextField();
        addPriceTf = new JTextField();
        insert = new JButton("insert");
        dataPanel = new JPanel(new GridLayout(3,2));

        dataPanel.add(addName);
        dataPanel.add(addNameTf);
        dataPanel.add(addPrice);
        dataPanel.add(addPriceTf);
        dataPanel.add(addType);
        dataPanel.add(typeCb);

        addFrame.add(dataPanel, BorderLayout.CENTER);
        addFrame.add(insert, BorderLayout.SOUTH);

        addFrame.setSize(200,200);
        addFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        addFrame.setVisible(false);

        insert.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(insert)){
            System.out.println("Test");
            Book book = new Book();
            book.setName(addNameTf.getText());
            book.setPrice(Double.parseDouble(addPriceTf.getText()));
            book.setType((String) typeCb.getSelectedItem());
            this.bookView.getBookList().add(book);
            this.bookView.onStart();
            this.addFrame.setVisible(false);
        }
    }

    public JFrame getAddFrame() {
        return addFrame;
    }

    public void setAddFrame(JFrame addFrame) {
        this.addFrame = addFrame;
    }
}
