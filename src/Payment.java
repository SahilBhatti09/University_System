import java.time.LocalDate;

public class Payment {
    private String id;
    private String receiverName;
    private String role;
    private double amount;
    private String type; // "Tuition Fee" or "Salary"
    private LocalDate date;

    public Payment(String id, String receiverName, String role, double amount, String type) {
        this.id = id;
        this.receiverName = receiverName;
        this.role = role;
        this.amount = amount;
        this.type = type;
        this.date = LocalDate.now();
    }

    public void displayPaymentDetails() {
        System.out.println("-------------------------------------");
        System.out.println("Payment ID: " + id);
        System.out.println("Receiver: " + receiverName + " (" + role + ")");
        System.out.println("Amount: " + amount);
        System.out.println("Type: " + type);
        System.out.println("Date: " + date);
        System.out.println("-------------------------------------");
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}
