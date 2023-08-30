public class FitnessTracker {
    public static void main(String[] args) {
        User user = new User("Alice", 1995, 7, 15,"alice@example.com", "1234567890");
        user.setSurname("Smith");
        user.setWeight(65.0);
        user.setBloodPressure("120/80");
        user.setStepsPerDay(8000);
        user.printAccountInfo();
    }
}

class User {
    private final String name;
    private final int birthYear;
    private final int birthMonth;
    private final int birthDay;
    private final String email;
    private final String phone;
    private String surname;
    private double weight;
    private String bloodPressure;
    private int stepsPerDay;
    private final int age;

    public User(String name, int birthYear, int birthMonth, int birthDay, String email, String phone) {
        this.name = name;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.email = email;
        this.phone = phone;
        this.age = 2020 - birthYear; // Just a simple calculation for age
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public void printAccountInfo() {
        System.out.println("User Information:");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Steps Per Day: " + stepsPerDay);
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }
}
