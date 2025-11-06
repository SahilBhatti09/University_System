public class UndergraduateStudent extends Student {
    private int creditLimit;  // e.g., max 18 credits per semester

    public UndergraduateStudent(String name, String email, String phone, String program, int term, int creditLimit) {
        super(name, email, phone, program, term);
        this.creditLimit = creditLimit;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public String getRole() {
        return "Undergraduate Student";
    }

    @Override
    public void displayInfo() {
        System.out.println("===============================");
        System.out.println("Role: " + getRole());
        System.out.println("System ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Roll Number: " + getRollNumber());
        System.out.println("Program: " + getProgram());
        System.out.println("Term: " + getTerm());
        System.out.println("Credit Limit: " + creditLimit);
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhone());
        System.out.println("===============================");
    }
}
