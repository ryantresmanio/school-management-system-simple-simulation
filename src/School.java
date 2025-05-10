import java.util.*;

public class School {
    Scanner scanner = new Scanner(System.in);
    private List<Student> students;
    private List<Course> courses;
    public Set<Section> getListOfSections;



    School(){
        this.students = new ArrayList<>();
        courses = new ArrayList<>();
        initializeSubjects();
        initializeStudents();
    }

    public void addStudent() {
        String password = "password";
        System.out.print("Enter password to access this feature: ");
        String userInput = scanner.nextLine();

        if (userInput.equals(password)) {
            try {
                System.out.print("Enter student name: ");
                String studentName = scanner.nextLine();

                System.out.print("ID Number: ");
                int studentId = scanner.nextInt();
                scanner.nextLine(); // consume leftover newline

                for (Student student : students) {
                    if (studentId == student.getId()) {
                        System.out.print("A record containing this ID Number already exists! Press Enter key to exit.");
                        scanner.nextLine(); // wait for Enter
                        return;
                    }
                }

                System.out.print("Age: ");
                int studentAge = scanner.nextInt();
                scanner.nextLine(); // consume newline

                System.out.print("Grade Level: ");
                int studentGrade = scanner.nextInt();
                scanner.nextLine(); // consume newline

                System.out.print("Section: ");
                String studentSection = scanner.nextLine();

                students.add(new Student(studentName, studentId, studentAge, studentGrade, studentSection));
                System.out.println(studentName + " added to section " + studentSection);
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                scanner.nextLine(); // clear the invalid input from scanner
            }
            catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
        else {
            System.out.println("Wrong password!");
        }
    }


    public void initializeStudents() {
        students.add(new Student("Justin Bieber", 10000, 18, 12, "Coffee"));
        students.add(new Student("Arya Stark", 10020, 16, 10, "Winter Melon"));
        students.add(new Student("Ariana Grande", 10001, 18, 12, "Coffee"));
        students.add(new Student("Elena Gilbert", 10021, 17, 11, "Bloody Mary"));
        students.add(new Student("Ruel", 10002, 18, 12, "Coffee"));
        students.add(new Student("Taylor Swift", 10003, 17, 11, "Tea"));
        students.add(new Student("Ed Sheeran", 10004, 18, 12, "Juice"));
        students.add(new Student("Dustin Henderson", 10022, 15, 9, "Coca Cola"));
        students.add(new Student("Selena Gomez", 10005, 17, 11, "Milk"));
        students.add(new Student("Shawn Mendes", 10006, 16, 10, "Water"));
        students.add(new Student("Jon Snow", 10023, 18, 12, "Winter Melon"));
        students.add(new Student("Camila Cabello", 10007, 16, 10, "Soda"));
        students.add(new Student("Billie Eilish", 10008, 15, 9, "Smoothie"));
        students.add(new Student("Steve Harrington", 10024, 17, 11, "Coca Cola"));
        students.add(new Student("Olivia Rodrigo", 10009, 17, 11, "Lemonade"));
        students.add(new Student("Harry Styles", 10010, 18, 12, "Tea"));
        students.add(new Student("Zayn Malik", 10011, 17, 11, "Coffee"));
        students.add(new Student("Lauv", 10012, 16, 10, "Water"));
        students.add(new Student("Daenerys Targaryen", 10025, 17, 11, "Winter Melon"));
        students.add(new Student("Halsey", 10013, 15, 9, "Juice"));
        students.add(new Student("Khalid", 10014, 18, 12, "Milk"));
        students.add(new Student("Eleven", 10026, 15, 9, "Coca Cola"));
        students.add(new Student("Doja Cat", 10015, 17, 11, "Soda"));
        students.add(new Student("The Weeknd", 10016, 16, 10, "Smoothie"));
        students.add(new Student("Dua Lipa", 10017, 15, 9, "Lemonade"));
        students.add(new Student("Stefan Salvatore", 10027, 18, 12, "Bloody Mary"));
        students.add(new Student("Conan Gray", 10018, 17, 11, "Tea"));
        students.add(new Student("Sabrina Carpenter", 10019, 16, 10, "Coffee"));
        students.add(new Student("Mike Wheeler", 10028, 15, 9, "Winter Melon"));
        students.add(new Student("Katherine Pierce", 10029, 17, 11, "Bloody Mary"));
        students.add(new Student("Bran Stark", 10030, 16, 10, "Winter Melon"));
        students.add(new Student("Caroline Forbes", 10031, 17, 11, "Bloody Mary"));
    }

    public void showStudentLists() {
        if (students.isEmpty()) {
            System.out.print("\nNo student found. Press Enter to continue.");
            scanner.nextLine();
        }
        else {
            System.out.println(String.format("%-20s  %-12s %-6s  %-6s  %-15s", "Name", "ID Number", "Age", "Grade", "Section"));
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public void searchStudentByID() {
        try {
            System.out.print("Input student number (e.g 10000): ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline

            boolean found = false;

            for (Student student : students) {
                if (student.getId() == id) {
                    System.out.println(String.format("%-20s  %-12s %-6s  %-6s  %-15s", "Name", "ID Number", "Age", "Grade", "Section"));
                    System.out.println(student);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print("\nNo student found. Press Enter to continue.");
                scanner.nextLine(); // wait for Enter
            }

        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid student number.");
            scanner.nextLine(); // clear the invalid input
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }


    public void initializeSubjects() {
        courses.add(new Course("Fundamentals of Programming", "CC101", 3, "Prof. Cruz", "Basic programming concepts using Java"));
        courses.add(new Course("Object-Oriented Programming", "CC102", 3, "Prof. Santos", "Classes, objects, and OOP principles in Java"));
        courses.add(new Course("Data Structures and Algorithms", "CC201", 4, "Prof. Garcia", "Linked lists, stacks, queues, sorting, and searching"));
        courses.add(new Course("Web Development", "CC202", 3, "Prof. Dela Cruz", "Frontend and backend web technologies"));
        courses.add(new Course("Database Systems", "CC203", 3, "Prof. Reyes", "Relational databases and SQL"));
        courses.add(new Course("Software Engineering", "CC204", 3, "Prof. Mendoza", "Software development lifecycle and methodologies"));
        courses.add(new Course("Mobile App Development", "CC301", 3, "Prof. Villanueva", "Developing Android apps using Java or Kotlin"));
        courses.add(new Course("Computer Networks", "CC302", 3, "Prof. Javier", "Networking principles, protocols, and models"));
        courses.add(new Course("Operating Systems", "CC303", 3, "Prof. Santiago", "Process management, memory, and file systems"));
        courses.add(new Course("Capstone Project", "CC401", 5, "Prof. Bautista", "Team-based project applying programming skills"));
    }



    public void viewSubjects() {
        for (Course course : courses) {
            System.out.println(course);
        }

        boolean found = false;
        try {
            System.out.print("\nEnter Subject Code for more info: ");
            String response = scanner.nextLine();

            for (Course course : courses) {
                if (course.getCode().equalsIgnoreCase(response)) {
                    course.getDetails(response); // Assuming this prints the details
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("\nNo such course!");
            }
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }


    public void viewEnrolledStudents() {
        boolean found = false;

        try {
            System.out.print("Enter Subject Code: ");
            String response = scanner.nextLine();

            for (Course course : courses) {
                if (response.equalsIgnoreCase(course.getCode())) {
                    found = true;
                    List<Student> enrolled = course.getEnrolledStudents();

                    if (enrolled == null || enrolled.isEmpty()) {
                        System.out.println("No students enrolled");
                    }
                    else {
                        for (Student student : enrolled) {
                            System.out.println(student.getName());
                        }
                    }
                    break; // Exit loop once the course is found
                }
            }

            if (!found) {
                System.out.println("No course found with the provided code.");
            }

        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public void enrollStudent() {
        System.out.print("Enter student number (e.g 10025): ");
        int number = scanner.nextInt();
        scanner.nextLine();

        Student foundStudent = null;
        for (Student student : students){
            if (number == student.getId()){
                foundStudent = student;
                System.out.println("Student Name: " + foundStudent.getName());
                break;
            }

        }
        if (foundStudent == null){
            System.out.println("Student not found");
            return;
        }

        System.out.print("Enter Subject Code (e.g CC102): ");
        String subjCode = scanner.nextLine();

        Course foundCourse = null;
        for (Course course : courses){
            if (subjCode.equalsIgnoreCase(course.getCode())){
                foundCourse = course;
                System.out.println("Subject : " + foundCourse.getName());
                break;
            }
        }
        if (foundCourse == null){
            System.out.println("Subject not found");
            return;
        }

        System.out.print("Confirm enrolling " + foundStudent.getName() + " to " + foundCourse + "(Y/N) : ");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("Y")){
            foundCourse.enrollStudent(foundStudent);
            foundStudent.enrollToCourse(foundCourse);
            System.out.println(foundStudent.getName() + " officially enrolled in " + foundCourse);
        }
        else if (response.equalsIgnoreCase("N")){
            System.out.println("Enrolling cancelled");
            return;
        }
    }
    public void getListOfSections() {
        Set<String> uniqueSections = new HashSet<>();

        for (Student student : students) {
            uniqueSections.add(student.getSection());
        }

        System.out.println("List of sections:");
        for (String section : uniqueSections) {
            System.out.println(section);
        }
        viewStudentPerSection();
    }

    private Map<String, List<Student>> sectionMap = new HashMap<>();

    public void groupStudentsBySection() {
        sectionMap.clear(); // Clear old data if method is called again

        for (Student student : students) {
            String section = student.getSection().toLowerCase();
            sectionMap.computeIfAbsent(section, k -> new ArrayList<>()).add(student);
        }
    }
    public void viewStudentPerSection() {
        groupStudentsBySection();
        System.out.print("Enter Section Name to view list of students: ");
        String res = scanner.nextLine();
        String response = res.toLowerCase();
        List<Student> enrolled = sectionMap.get(response);

        if (enrolled == null || enrolled.isEmpty()) {
            System.out.println("No students found in that section.");
        } else {
            System.out.println("Students in section " + response + ":");
            for (Student student : enrolled) {
                System.out.println(student.getName());
            }
        }
    }
}


