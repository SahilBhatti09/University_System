public class IdGenerator {
    private static int counter = 1000;

    public static String generateId() {
        counter++;
        return "ID" + counter;
    }
}
