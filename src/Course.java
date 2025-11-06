import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String title;
    private int capacity;
    private Faculty instructor;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Course(String courseCode, String title, int capacity) {
        this.courseCode = courseCode;
        this.title = title;
        this.capacity = capacity;
    }

    // Assign a faculty member to this course
    public void assignInstructor(Faculty instructor) {
        this.instructor = instructor;
    }

    // Enroll a student in this course
    public boolean enrollStudent(Student student) {
        if (enrolledStudents.size() < capacity) {
            enrolledStudents.add(student);
            return true;
        } else {
            System.out.println("⚠️ Course " + courseCode + " is full!");
            return false;
        }
    }

    // Display all enrolled students
    public void showEnrolledStudents() {
        System.out.println("----- " + courseCode + " : " + title + " -----");
        if (enrolledStudents.isEmpty()) {
            System.out.println("No students enrolled yet.");
        } else {
            for (Student s : enrolledStudents) {
                System.out.println("- " + s.getName() + " (" + s.getRollNumber() + ")");
            }
        }
        System.out.println("----------------------------------------");
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getTitle() {
        return title;
    }

    public Faculty getInstructor() {
        return instructor;
    }

    public int getRemainingSeats() {
        return capacity - enrolledStudents.size();
    }
}
