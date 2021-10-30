import java.util.ArrayList;

public class Student extends Person{
    //fields
    public String studentNumber;
    public String course;
    public ArrayList<String> enrolledSubjects = new ArrayList<String>();

    //methods
    public void enrollnSubject(String subject){
        this.enrolledSubjects.add(subject);
    }

    public void withdrawFromSubject(String subject){
        this.enrolledSubjects.remove(subject);
    }
}
