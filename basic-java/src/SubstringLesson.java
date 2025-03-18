import java.util.Scanner;

public class SubstringLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();
        if(email.contains("@"))
        {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);
            System.out.println("Your username: "+username);
            System.out.println("Your domain: "+domain);
        }
        else
        {
            System.out.println("Email must contain @!");
        }
        scanner.close();
    }
}
