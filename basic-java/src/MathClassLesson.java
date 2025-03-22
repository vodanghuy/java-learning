import java.util.Scanner;

public class MathClassLesson {
    public static void main(String[] args) {
        // HYPOTENUSE (cạnh huyền) c = Math.sqrt(a^2 + b^2)
//        double a,b,c;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a: ");
//        a = scanner.nextDouble();
//        System.out.print("Enter b: ");
//        b = scanner.nextDouble();
//        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
//        System.out.println("hypotenuse c = " + c + " cm");
//        scanner.close();

        double r;
        double circumference;
        double area;
        double volume;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of radius: ");
        r = scanner.nextDouble();
        circumference = 2 * Math.PI * r;
        System.out.printf("Circumference is: %.1f cm\n",circumference);
        area = Math.PI * Math.pow(r,2);
        System.out.printf("Area is: %.1f cm^2\n",area);
        volume = (4/3) * Math.PI * Math.pow(r,3);
        System.out.printf("Volume is: %.1f cm^3",volume);
        scanner.close();
    }
}
