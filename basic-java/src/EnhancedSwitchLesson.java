import java.util.Scanner;

public class EnhancedSwitchLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day;
        System.out.print("Enter the day of the week: ");
        day = scanner.nextLine();
        switch (day.toUpperCase()){
            case "MONDAY", "TUESDAY","WEDNESDAY","THURSDAY","FRIDAY" ->
                    System.out.println("It is a weekday!");
            case "SATURDAY", "SUNDAY" -> System.out.println("It is a weekend!");
            default -> System.out.println(day + " is not a day!");
        }
        scanner.close();
    }
}
