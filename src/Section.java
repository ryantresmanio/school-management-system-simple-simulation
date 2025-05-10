import java.util.ArrayList;
import java.util.List;

public class Section {
    private String name;
    private int numberOfStudents;
    private List<Student> studentPerSection;
    List<Student> students;

    Section(){
        studentPerSection = new ArrayList<>();
    }


}
