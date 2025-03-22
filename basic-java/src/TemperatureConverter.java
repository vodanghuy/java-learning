import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature;
        String choice;
        System.out.print("Enter temperature: ");
        temperature = scanner.nextDouble();
        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        choice = scanner.next().toUpperCase();
        double newTemperature = (choice.equals("C")) ? (temperature-32)* 5 / 9 : (temperature * 9/5) + 32;
        System.out.printf("%.1f độ %s", newTemperature, choice);
        scanner.close();
    }
}
