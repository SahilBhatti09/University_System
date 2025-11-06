import java.time.Year;

public class RollNumberGenerator {
    private static int serial = 1;

    // Example format: 2025-BSCS-1-001
    public static String generateRollNumber(String program, int term) {
        int year = Year.now().getValue();
        String roll = String.format("%d-%s-%d-%03d", year, program.toUpperCase(), term, serial);
        serial++;
        return roll;
    }
}
