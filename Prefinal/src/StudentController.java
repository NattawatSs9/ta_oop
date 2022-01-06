import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.util.ArrayList;

public class StudentController implements ActionListener, MouseListener {
    private ArrayList<Student> students;
    private InsertView insertView;
    private TableView tableView;
    private TimeCountCheck timeCountCheck;
    private Thread thread;
    private boolean paused;
    private File file;

    public StudentController(){
        students = new ArrayList<>();
        insertView = new InsertView();
        tableView = new TableView();
        timeCountCheck = new TimeCountCheck();
        timeCountCheck.addMouseListener(this);
        thread = new Thread(timeCountCheck);
        thread.start();
        insertView.getCheckBtn().addActionListener(this);
        tableView.getNewFile().addActionListener(this);
        tableView.getOpenFile().addActionListener(this);
        tableView.getSaveFile().addActionListener(this);
        tableView.getSaveAsFile().addActionListener(this);

    }
    public void addStudent() throws NotTimeToCheckListException{
        if (!paused){
            Student student = new Student(Integer.parseInt(insertView.getTfID().getText()), insertView.getTfFirst().getText(), insertView.getTfLast().getText());
            students.add(student);
            tableView.addDataToTable(student);
        }
        else {
            throw new NotTimeToCheckListException("It's not time to check list");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(insertView.getCheckBtn())){
            try {
                this.addStudent();
            }
            catch (NotTimeToCheckListException ex){
                System.out.println(ex);
            }
        }
        else if (e.getSource().equals(tableView.getNewFile())){
            tableView.getModel().setRowCount(0);
            students.clear();
        }
        else if (e.getSource().equals(tableView.getOpenFile())){
            tableView.getModel().setRowCount(0);
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(tableView.getFrame()); // fr คือ ตัวแปรออปเจ็ค JFrame
            file = fc.getSelectedFile();
            try (FileInputStream fileInput = new FileInputStream(file);
                 ObjectInputStream objInput = new ObjectInputStream(fileInput);) {
                students = (ArrayList<Student>) objInput.readObject();

                for (Student student : students){
                    tableView.addDataToTable(student);
                }

            } catch (Exception exception){
                System.out.println("Error");
            }

        }
        else if (e.getSource().equals(tableView.getSaveFile())){
            try (FileOutputStream fileOut = new FileOutputStream(file); ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {
                objOut.writeObject(students);

            }
            catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
            catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        else if (e.getSource().equals(tableView.getSaveAsFile())){
            System.out.println("Save As");
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(tableView.getFrame());
            file = fc.getSelectedFile();
            try (FileOutputStream fileOut = new FileOutputStream(file); ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {
                    objOut.writeObject(students);

            }
            catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
            catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(timeCountCheck)){
            if (timeCountCheck.getPaused()){
                timeCountCheck.resumeThread();
                paused = false;
            }
            else{
                timeCountCheck.pauseThread();
                paused = true;
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
