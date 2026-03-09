import java.util.Scanner;

public class EchancedSwitch {
    public static void main(String[] args) {
        // Enhanced switch = A replacement to many else if statements(JAVA14 Feature)

        Scanner scanner = new Scanner(System.in);

        String day;
        System.out.print("Enter the day of the week: ");
        day = scanner.nextLine().toLowerCase();

        switch (day) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("It is a Weekday 🙁");
            case "saturday", "sunday" -> System.out.println("It is a weekend ☀️😎");
            default -> System.out.printf("%s is not a day", day);
        }

        scanner.close();
    }
}
