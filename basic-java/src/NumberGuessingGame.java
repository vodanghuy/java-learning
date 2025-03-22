import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int result = random.nextInt(1,100);
        int i = 1;
        int answer;
        do{
            System.out.println(result);
            System.out.printf("You have 8 turns! This is turn %d\n",i);
            System.out.print("Enter your answer: ");
            answer = scanner.nextInt();
            if(answer > result)
            {
                System.out.println("TOO HIGH! Try again");
            }
            if(answer < result)
            {
                System.out.println("TOO LOW! Try again");
            }
            i++;
        }while (i <= 8 && answer != result);
        if(answer == result)
        {
            System.out.printf("\nCongratulation! The answer %d is correct!", answer);
        }
        else
        {
            System.out.printf("\nYou losed! The correct answer is %d", result);
        }
        scanner.close();
    }
}
