import java.util.Scanner;
public class WightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int option;
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Enter your option: ");
        option = scanner.nextInt();
        if(option == 1)
        {
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight / 2.20462;
            System.out.printf("The weight in kgs = %.2f", newWeight);
        }
        else if (option == 2)
        {
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The weight in lbs = %.2f", newWeight);
        }
        else
        {
            System.out.println("Not a valid choice");
        }
        scanner.close();
    }
}
