import java.util.ArrayList;

public class FinancialSystem {
    private ArrayList<Payment> payments = new ArrayList<>();

    // Record a student tuition fee payment
    public void payTuitionFee(Student student, double amount) {
        Payment p = new Payment(student.getId(), student.getName(), student.getRole(), amount, "Tuition Fee");
        payments.add(p);
        System.out.println(student.getName() + " has paid tuition fee of Rs. " + amount);
    }

    // Record faculty salary
    public void paySalary(Faculty faculty) {
        Payment p = new Payment(faculty.getId(), faculty.getName(), faculty.getRole(), faculty.getSalary(), "Salary");
        payments.add(p);
        System.out.println("Salary of Rs. " + faculty.getSalary() + " paid to " + faculty.getName());
    }

    // Record staff salary
    public void paySalary(Staff staff) {
        Payment p = new Payment(staff.getId(), staff.getName(), staff.getRole(), staff.getMonthlySalary(), "Salary");
        payments.add(p);
        System.out.println("Salary of Rs. " + staff.getMonthlySalary() + " paid to " + staff.getName());
    }

    // Display all transactions
    public void showAllPayments() {
        System.out.println("\n========== PAYMENT TRANSACTIONS ==========\n");
        if (payments.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (Payment p : payments) {
                p.displayPaymentDetails();
            }
        }
    }

    // Calculate total revenue (tuition fees)
    public double calculateTotalRevenue() {
        double total = 0;
        for (Payment p : payments) {
            if (p.getType().equals("Tuition Fee")) {
                total += p.getAmount();
            }
        }
        return total;
    }

    // Calculate total expenses (salaries)
    public double calculateTotalExpenses() {
        double total = 0;
        for (Payment p : payments) {
            if (p.getType().equals("Salary")) {
                total += p.getAmount();
            }
        }
        return total;
    }

    // Display summary
    public void showFinancialSummary() {
        double revenue = calculateTotalRevenue();
        double expenses = calculateTotalExpenses();
        double balance = revenue - expenses;

        System.out.println("\n========== FINANCIAL SUMMARY ==========");
        System.out.println("Total Tuition Revenue: Rs. " + revenue);
        System.out.println("Total Salary Expenses: Rs. " + expenses);
        System.out.println("Net Balance: Rs. " + balance);
        System.out.println("========================================\n");
    }
}
