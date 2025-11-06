import java.util.HashMap;

public class Student extends Person {
    private String program;
    private int term; // 1 = Spring, 2 = Fall
    private String rollNumber;
    private HashMap<String, String> grades = new HashMap<>();

    public Student(String name, String email, String phone, String program, int term) {
        super(IdGenerator.generateId(), name, email, phone);
        this.program = program;
        this.term = term;
        this.rollNumber = RollNumberGenerator.generateRollNumber(program, term);
    }

    public String getProgram() {
        return program;
    }

    public int getTerm() {
        return term;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setGrade(String courseCode, String grade) {
        grades.put(courseCode, grade);
    }

    public double calculateGPA() {
        if (grades.isEmpty()) return 0.0;

        double total = 0;
        for (String grade : grades.values()) {
            switch (grade.toUpperCase()) {
                case "A": total += 4.0; break;
                case "B": total += 3.0; break;
                case "C": total += 2.0; break;
                case "D": total += 1.0; break;
                default: total += 0.0;
            }
        }
        return total / grades.size();
    }

    // GPA for specific term (if you later decide to record by semester)
    public double calculateGPAForTerm(int term) {
        // In a real system, you'd filter grades by term.
        // For now, let's just call the same logic.
        return calculateGPA();
    }

    // Cumulative GPA (CGPA) - across all completed courses
    public double calculateCGPA() {
        return calculateGPA();  // currently the same since we don't separate semesters
    }


    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public void displayInfo() {
        System.out.println("===============================");
        System.out.println("Role: " + getRole());
        System.out.println("System ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Roll Number: " + getRollNumber());
        System.out.println("Program: " + program);
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhone());
        System.out.println("===============================");
    }
}
