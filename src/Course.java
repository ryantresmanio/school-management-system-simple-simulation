import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String code;
    private int unit;
    private String description;
    private String professor;
    private List<Student> enrolledStudents;

    Course(String name, String code, int unit, String professor, String description){
        this.name = name;
        this.code = code;
        this.unit = unit;
        this.professor = professor;
        this.description = description;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getName() {return name;}

    public String getCode() {return code;}

    public String getProfessor() {return professor;}

    @Override
    public String toString() {
        return name + " (" + code + ")";
    }

    public void getDetails(String code){
        System.out.println("\nSubject: " + name);
        System.out.println("Professor: " + professor);
        System.out.println("Units: " + unit);
        System.out.println("Description: " + description);
    }

    public void enrollStudent(Student student){
        enrolledStudents.add(student);
    }

    public List<Student> getEnrolledStudents (){
        return enrolledStudents;
    }


}
