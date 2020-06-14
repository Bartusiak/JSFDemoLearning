import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {

    private List<Student> students;

    public StudentDataUtil(){
        loadSampleData();
    }

    public void loadSampleData(){
        students = new ArrayList<>();

        students.add(new Student("Mary","Joe","mary@gmail.com"));
        students.add(new Student("Johyn","Peanut","john@tester.com"));
        students.add(new Student("Arya","Smile","arya@publicmail.com"));

    }

    public List<Student> getStudents(){
        return students;
    }

}
