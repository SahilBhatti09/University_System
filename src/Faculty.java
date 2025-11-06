public class Faculty extends Person {
    private String department;
    private String designation;
    private double salary;

    public Faculty(String name, String email, String phone, String department, String designation, double salary) {
        super(IdGenerator.generateId(), name, email, phone);
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        salary += (salary * percentage / 100);
    }

    @Override
    public String getRole() {
        return "Faculty";
    }

    @Override
    public void displayInfo() {
        System.out.println("===============================");
        System.out.println("Role: " + getRole());
        System.out.println("System ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhone());
        System.out.println("Salary: " + salary);
        System.out.println("===============================");
    }
}
