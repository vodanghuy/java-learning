import java.util.Scanner;
public class ScannerLesson {
    public static void main(String[] args) {

        // Calculate area of rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = scanner.nextDouble();
        System.out.print("Enter height: ");
        height = scanner.nextDouble();
        area = width * height;
        System.out.print("The area is: "+area+" cm^2");
    }
}
