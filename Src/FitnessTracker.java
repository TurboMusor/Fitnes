public class FitnessTracker {
    public static void main(String[] args) {
        user user = new user("Alice", 1995, 7, 15,"alice@example.com", "1234567890");
        user.setSurname("Smith");
        user.setWeight(65.0);
        user.setBloodPressure("120/80");
        user.setStepsPerDay(8000);
        user.printAccountInfo();
    }
}

