import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {

        int balance = 100;
        int betAmount;
        String playAgain = "Y";
        int won = 0;

        System.out.println("**********************");
        System.out.println("Welcome to Java Slots");
        System.out.println("Symbols: 🍉 🍔 🍒 🧡 🎱");
        System.out.println("**********************");
        while (playAgain.equals("Y") && balance > 0) {
            System.out.printf("Current Balance: $%d\n", balance);
            do {
                System.out.print("Place your bet amount: ");
                betAmount = scanner.nextInt();
                scanner.nextLine();
                if (betAmount <= 0 || betAmount > balance) {
                    System.out.println("Bet amount must be > 0 and < balance");
                }
            } while (betAmount <= 0 || betAmount > balance);
            balance -= betAmount;
            System.out.println("Spinning...");
            String[] row = SpinRow();
            PrintRow(row);
            won = GetPayout(row, betAmount);
            if (won != 0) {
                System.out.println("You won $" + won);
                balance += won;
            } else {
                System.out.println("You lost this round");
            }
            do {
                System.out.print("Play again? (y/n): ");
                playAgain = scanner.nextLine().toUpperCase();
                if (!playAgain.equals("Y") && !playAgain.equals("N")) {
                    System.out.println("Invalid value! Try again.");
                }
            } while (!playAgain.equals("Y") && !playAgain.equals("N"));
            if(playAgain.equals("Y"))
            {
                if(balance < 0)
                {
                    System.out.println("Your balance is <= $0");
                    System.out.println("SEE YOU AGAIN!");
                    break;
                }
            }
        }
        System.out.println("SEE YOU AGAIN!");
        scanner.close();
    }

    static String[] SpinRow() {
        String[] symbols = {"🍉", "🍔", "🍒", "🧡", "🎱"};
        String[] row = new String[3];
        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    static void PrintRow(String[] row) {
        System.out.println("" + String.join("|", row));
    }

    static int GetPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍉" -> bet * 4;
                case "🍔" -> bet * 5;
                case "🍒" -> bet * 6;
                case "🧡" -> bet * 10;
                case "🎱" -> bet * 100;
                default -> 0;
            };
        } else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍉" -> bet * 2;
                case "🍔" -> bet * 3;
                case "🍒" -> bet * 4;
                case "🧡" -> bet * 5;
                case "🎱" -> bet * 10;
                default -> 0;
            };
        } else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍉" -> bet * 2;
                case "🍔" -> bet * 3;
                case "🍒" -> bet * 4;
                case "🧡" -> bet * 5;
                case "🎱" -> bet * 10;
                default -> 0;
            };
        } else if (row[0].equals(row[2])) {
            return switch (row[0]) {
                case "🍉" -> bet * 2;
                case "🍔" -> bet * 3;
                case "🍒" -> bet * 4;
                case "🧡" -> bet * 5;
                case "🎱" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}
