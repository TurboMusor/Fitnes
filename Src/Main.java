public class Main {
    public static void main(String[] args) {
        user user1 = new user("Alice", 1995, 7, 15, "alice@example.com", "1234567890");
        user1.setSurname("Smith");
        user1.setWeight(65.0);
        user1.setBloodPressure("120/80");
        user1.setStepsPerDay(8000);

        user user2 = new user("Bob", 1988, 5, 20, "bob@example.com", "9876543210");
        user2.setWeight(75.5);
        user2.setBloodPressure("130/90");
        user2.setStepsPerDay(10000);

        user user3 = new user("Eve", 2000, 3, 10, "eve@example.com", "5555555555");
        user3.setSurname("Johnson");
        user3.setWeight(58.7);
        user3.setBloodPressure("115/75");
        user3.setStepsPerDay(7000);

        user1.printAccountInfo();
        System.out.println("--------------------------");
        user2.printAccountInfo();
        System.out.println("--------------------------");
        user3.printAccountInfo();
    }
}
