import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();

        while(true) {
            System.out.println("\n=== School Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. View All Subjects");
            System.out.println("4. Search student by student number");
            System.out.println("5. Enroll a student to a course");
            System.out.println("6. View enrolled students in course");
            System.out.println("7. View sections");

            try {
                System.out.print("\nEnter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice){
                    case 1:
                        school.addStudent();
                        break;
                    case 2:
                        school.showStudentLists();
                        break;
                    case 3:
                        school.viewSubjects();
                        break;
                    case 4:
                        school.searchStudentByID();
                        break;
                    case 5:
                        school.enrollStudent();
                        break;
                    case 6:
                        school.viewEnrolledStudents();
                        break;
                    case 7:
                        school.getListOfSections();
                        break;
                    case 8:
                        school.viewStudentPerSection();
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;

                }
            }
            catch (InputMismatchException e){
                System.out.print("\nEnter a valid choice. (1 - 9). Press Enter to continue.");
                scanner.nextLine();
                scanner.nextLine();
            }
        }
    }
}