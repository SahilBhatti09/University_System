public class Staff extends Person {
    private String department;
    private String jobTitle;
    private double monthlySalary;

    public Staff(String name, String email, String phone, String department, String jobTitle, double monthlySalary) {
        super(IdGenerator.generateId(), name, email, phone);
        this.department = department;
        this.jobTitle = jobTitle;
        this.monthlySalary = monthlySalary;
    }

    public String getDepartment() {
        return department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double salary) {
        this.monthlySalary = salary;
    }

    @Override
    public String getRole() {
        return "Staff";
    }

    @Override
    public void displayInfo() {
        System.out.println("===============================");
        System.out.println("Role: " + getRole());
        System.out.println("System ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Department: " + department);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhone());
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("===============================");
    }
}
