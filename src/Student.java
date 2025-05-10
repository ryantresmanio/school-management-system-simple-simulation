import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private int grade;
    private String section;
    private List<Course> enrolledSubjects;
    private List<Student> enrolledStudents;


    Student(String name, int id, int age, int grade, String section) {
        super(name, id, age);
        this.grade = grade;
        this.section = section;
        enrolledSubjects = new ArrayList<>();
        enrolledStudents = new ArrayList<>();
    }

    public int getGrade() {return grade;}

    public String getSection() {return section;}

    public void enrollToCourse(Course course){
        enrolledSubjects.add(course);
    }

    @Override
    public String toString(){
        return String.format("%-20s  %-12s %-6s  %-6s  %-15s",
                getName(), getId(), getAge(), grade, section);
    }
    public List<Student> getEnrolledStudents (){
        return enrolledStudents;
    }
}
