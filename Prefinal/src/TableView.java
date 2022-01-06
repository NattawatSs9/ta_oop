import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class TableView {
    private JFrame frame;
    private JTable table;
    private DefaultTableModel model;
    private JMenuBar menuBar;
    private JMenu file;
    private JMenuItem newFile, saveFile, saveAsFile, openFile;
    public TableView(){
        frame = new JFrame("Student Table");

        menuBar = new JMenuBar();
        file = new JMenu("File");
        newFile = new JMenuItem("New");
        saveFile = new JMenuItem("Save");
        saveAsFile = new JMenuItem("Save As");
        openFile = new JMenuItem("Open");

        frame.setJMenuBar(menuBar);
        menuBar.add(file);
        file.add(newFile);
        file.add(openFile);
        file.addSeparator();
        file.add(saveFile);
        file.add(saveAsFile);

        model = new DefaultTableModel();
        table = new JTable(model);

        model.addColumn("ID");
        model.addColumn("First name");
        model.addColumn("Last name");

        JScrollPane sp = new JScrollPane(table);
        frame.add(sp);

        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }

    public void addDataToTable(Student s){
        Object[] data = new Object[3];
        data[0] = s.getID();
        data[1] = s.getFirst_name();
        data[2] = s.getLast_name();
        model.addRow(data);
    }

    public JMenuItem getNewFile() {
        return newFile;
    }

    public void setNewFile(JMenuItem newFile) {
        this.newFile = newFile;
    }

    public JMenuItem getSaveFile() {
        return saveFile;
    }

    public void setSaveFile(JMenuItem saveFile) {
        this.saveFile = saveFile;
    }

    public JMenuItem getSaveAsFile() {
        return saveAsFile;
    }

    public void setSaveAsFile(JMenuItem saveAsFile) {
        this.saveAsFile = saveAsFile;
    }

    public JMenuItem getOpenFile() {
        return openFile;
    }

    public void setOpenFile(JMenuItem openFile) {
        this.openFile = openFile;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
}
