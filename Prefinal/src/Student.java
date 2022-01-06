import java.io.Serializable;

public class Student implements Serializable {
    private int ID;
    private String first_name;
    private String last_name;

    public Student(){
        this(0,"","");
    }
    public Student(int id, String fn, String ln){
        this.ID = id;
        this.first_name = fn;
        this.last_name = ln;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
