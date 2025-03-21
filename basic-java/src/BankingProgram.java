import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double balance = 0;
        boolean isRunning = true;
        int choice;
        while(isRunning)
        {
            System.out.println("\n***********************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***********************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***********************");
            do{
                System.out.print("Enter your choice (1-4): ");
                choice = scanner.nextInt();
                if(choice <= 0 || choice > 4)
                {
                    System.out.println("Your choice is invalid! Try again.\n");
                }
            }while(choice <= 0 || choice > 4);
            switch (choice)
            {
                case 1 -> ShowBalance(balance);
                case 2 -> balance += Deposit();
                case 3 -> balance -= WithDraw(balance);
                case 4 -> {
                    System.out.println("Thank you!");
                    isRunning = false;
                }
            }
        }
        scanner.close();
    }
    static void ShowBalance(double balance)
    {
        System.out.printf("\nYour balance: $%.2f\n", balance);
    }
    static double Deposit ()
    {
        double inputMoney;
        do {
            System.out.print("Enter an amount to be deposited (> %10.00): ");
            inputMoney = scanner.nextDouble();
            if(inputMoney < 10)
            {
                System.out.println("Invalid amount! Try again");
            }
        }while (inputMoney < 10);
        System.out.println("\nDeposited successfully!");
        return inputMoney;
    }
    static double WithDraw(double balance)
    {
        double inputMoney;
        do{
            System.out.print("Enter an amout to be withdrawed (> $10.00): ");
            inputMoney = scanner.nextDouble();
            if(inputMoney > balance || inputMoney < 10)
            {
                System.out.println("Invalid amount! Try again");
            }
        }while (inputMoney > balance || inputMoney < 10);
        System.out.println("\nWithdrawed successfully!");
        return inputMoney;
    }
}
