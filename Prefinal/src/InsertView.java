import javax.swing.*;
import java.awt.*;

public class InsertView {
    private JFrame frame;
    private JPanel panel;
    private JLabel labelID, labelFirst, labelLast;
    private JTextField tfID, tfFirst, tfLast;
    private JButton checkBtn;

    public InsertView(){
        frame = new JFrame("Insert Student");
        panel = new JPanel(new GridLayout(3,2));
        labelID = new JLabel("ID");
        labelFirst = new JLabel("Firstname");
        labelLast = new JLabel("Lastname");
        tfID = new JTextField();
        tfFirst = new JTextField();
        tfLast = new JTextField();
        checkBtn = new JButton("Check");

        panel.add(labelID);
        panel.add(tfID);
        panel.add(labelFirst);
        panel.add(tfFirst);
        panel.add(labelLast);
        panel.add(tfLast);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(checkBtn, BorderLayout.SOUTH);

        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setLocation(100,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getLabelID() {
        return labelID;
    }

    public void setLabelID(JLabel labelID) {
        this.labelID = labelID;
    }

    public JLabel getLabelFirst() {
        return labelFirst;
    }

    public void setLabelFirst(JLabel labelFirst) {
        this.labelFirst = labelFirst;
    }

    public JLabel getLabelLast() {
        return labelLast;
    }

    public void setLabelLast(JLabel labelLast) {
        this.labelLast = labelLast;
    }

    public JTextField getTfID() {
        return tfID;
    }

    public void setTfID(JTextField tfID) {
        this.tfID = tfID;
    }

    public JTextField getTfFirst() {
        return tfFirst;
    }

    public void setTfFirst(JTextField tfFirst) {
        this.tfFirst = tfFirst;
    }

    public JTextField getTfLast() {
        return tfLast;
    }

    public void setTfLast(JTextField tfLast) {
        this.tfLast = tfLast;
    }

    public JButton getCheckBtn() {
        return checkBtn;
    }

    public void setCheckBtn(JButton checkBtn) {
        this.checkBtn = checkBtn;
    }
}
