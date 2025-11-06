import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ===========================
        // 🧑‍🎓 STUDENTS (Undergraduate + Postgraduate)
        // ===========================
        UndergraduateStudent ug1 = new UndergraduateStudent(
                "Ali Khan", "ali@uni.edu", "0300-1112233", "BSCS", 1, 18);
        UndergraduateStudent ug2 = new UndergraduateStudent(
                "Hina Rehman", "hina@uni.edu", "0311-2233445", "BBA", 2, 18);

        PostgraduateStudent pg1 = new PostgraduateStudent(
                "Sara Malik", "sara@uni.edu", "0322-3344556", "MSCS", 1, "Machine Learning in Education");
        PostgraduateStudent pg2 = new PostgraduateStudent(
                "Usman Ahmed", "usman@uni.edu", "0333-4455667", "MBA", 2, "Digital Marketing Trends");

        // ===========================
        // 👨‍🏫 FACULTY MEMBERS
        // ===========================
        Faculty f1 = new Faculty("Dr. Ahmed", "ahmed@uni.edu", "0344-5566778",
                "Computer Science", "Professor", 150000);
        Faculty f2 = new Faculty("Ms. Hina", "hinaz@uni.edu", "0355-6677889",
                "Business", "Lecturer", 90000);

        // ===========================
        // 🧑‍💼 STAFF MEMBERS
        // ===========================
        Staff st1 = new Staff("Kamran Ali", "kamran@uni.edu", "0366-7788990",
                "Library", "Librarian", 60000);
        Staff st2 = new Staff("Nadia Iqbal", "nadia@uni.edu", "0377-8899001",
                "Finance", "Accountant", 70000);

        // ===========================
        // 📚 COURSES
        // ===========================
        Course c1 = new Course("CS101", "Introduction to Programming", 3);
        Course c2 = new Course("CS201", "Data Structures", 2);
        Course c3 = new Course("BBA101", "Business Fundamentals", 3);

        // Assign instructors
        c1.assignInstructor(f1);
        c2.assignInstructor(f1);
        c3.assignInstructor(f2);

        // ===========================
        // 📝 ENROLL STUDENTS INTO COURSES
        // ===========================
        c1.enrollStudent(ug1);
        c1.enrollStudent(pg1);
        c2.enrollStudent(ug1);
        c2.enrollStudent(pg2);
        c3.enrollStudent(ug2);

        // ===========================
        // 📊 ENROLLMENT RECORDS
        // ===========================
        Enrollment e1 = new Enrollment(ug1, c1);
        Enrollment e2 = new Enrollment(pg1, c1);
        Enrollment e3 = new Enrollment(ug1, c2);
        Enrollment e4 = new Enrollment(pg2, c2);
        Enrollment e5 = new Enrollment(ug2, c3);

        // ===========================
        // 📋 POLYMORPHISM DEMO — ONE LIST FOR ALL
        // ===========================
        ArrayList<Person> universityPeople = new ArrayList<>();
        universityPeople.add(ug1);
        universityPeople.add(ug2);
        universityPeople.add(pg1);
        universityPeople.add(pg2);
        universityPeople.add(f1);
        universityPeople.add(f2);
        universityPeople.add(st1);
        universityPeople.add(st2);

        // ===========================
        // 🔍 DISPLAY ALL PEOPLE IN UNIVERSITY
        // ===========================
        System.out.println("\n========== UNIVERSITY DIRECTORY ==========\n");
        for (Person person : universityPeople) {
            person.displayInfo(); // Each class has its own version of displayInfo()
        }

        // ===========================
        // 🧮 STUDENT GPA CALCULATIONS
        // ===========================
        ug1.setGrade("CS101", "A");
        ug1.setGrade("CS201", "B");
        ug2.setGrade("BBA101", "A");
        pg1.setGrade("CS101", "A");
        pg2.setGrade("CS201", "A");

        System.out.println("\n========== STUDENT GPAs ==========\n");
        System.out.println(ug1.getName() + " (" + ug1.getRollNumber() + ") GPA: " + ug1.calculateGPA());
        System.out.println(ug2.getName() + " (" + ug2.getRollNumber() + ") GPA: " + ug2.calculateGPA());
        System.out.println(pg1.getName() + " (" + pg1.getRollNumber() + ") GPA: " + pg1.calculateGPA());
        System.out.println(pg2.getName() + " (" + pg2.getRollNumber() + ") GPA: " + pg2.calculateGPA());

        System.out.println("\n========== STUDENT GPA & CGPA ==========\n");
        System.out.println(ug1.getName() + " (" + ug1.getRollNumber() + ") GPA: " + ug1.calculateGPA() + " | CGPA: " + ug1.calculateCGPA());
        System.out.println(ug2.getName() + " (" + ug2.getRollNumber() + ") GPA: " + ug2.calculateGPA() + " | CGPA: " + ug2.calculateCGPA());
        System.out.println(pg1.getName() + " (" + pg1.getRollNumber() + ") GPA: " + pg1.calculateGPA() + " | CGPA: " + pg1.calculateCGPA());
        System.out.println(pg2.getName() + " (" + pg2.getRollNumber() + ") GPA: " + pg2.calculateGPA() + " | CGPA: " + pg2.calculateCGPA());

        // ===========================
        // 💰 FACULTY SALARY TEST
        // ===========================
        System.out.println("\n========== FACULTY SALARY UPDATE ==========\n");
        System.out.println("Before Raise: " + f1.getName() + " = " + f1.getSalary());
        f1.increaseSalary(10);
        System.out.println("After 10% Raise: " + f1.getName() + " = " + f1.getSalary());

        // ===========================
        // 📖 COURSE DETAILS
        // ===========================
        System.out.println("\n========== COURSE DETAILS ==========\n");
        System.out.println("Instructor for " + c1.getCourseCode() + ": " + c1.getInstructor().getName());
        System.out.println("Instructor for " + c2.getCourseCode() + ": " + c2.getInstructor().getName());
        System.out.println("Instructor for " + c3.getCourseCode() + ": " + c3.getInstructor().getName());

        System.out.println();
        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
        c3.showEnrolledStudents();

        // ===========================
        // 🗂️ ENROLLMENT SUMMARY
        // ===========================
        System.out.println("\n========== ENROLLMENT RECORDS ==========\n");
        e1.showDetails();
        e2.showDetails();
        e3.showDetails();
        e4.showDetails();
        e5.showDetails();

        // ===========================
        // 💰 FINANCIAL SYSTEM
        // ===========================
                FinancialSystem finance = new FinancialSystem();

        // Students pay tuition fees
                finance.payTuitionFee(ug1, 75000);
                finance.payTuitionFee(ug2, 72000);
                finance.payTuitionFee(pg1, 90000);
                finance.payTuitionFee(pg2, 95000);

        // Faculty and staff receive salary
                finance.paySalary(f1);
                finance.paySalary(f2);
                finance.paySalary(st1);
                finance.paySalary(st2);

        // Show all transactions and summary
                finance.showAllPayments();
                finance.showFinancialSummary();

        System.out.println("\n========== END OF UNIVERSITY REPORT SUMMARY ==========");
        System.out.println("\n========== DEVELOPED BY: Sahil Bhatti ==========");
    }
}
