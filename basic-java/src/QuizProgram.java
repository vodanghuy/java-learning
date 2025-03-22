import java.util.Scanner;

public class QuizProgram {
    public static void main(String[] args) {
        String[] questions =
                {
                        "What is the main function of a router?",
                        "Which part of computer is considered the brain?",
                        "What year facebook launched?",
                        "Who is known as father of computer?",
                        "What was the first programming language?"
                };
        String[][] answers ={
                {"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. All 3 answers"},
                {"1. CPU", "2. Hard drive", "3. RAM", "4. GPU"},
                {"1. 2000", "2. 2004", "3. 1999", "4. 2006"},
                {"1. Steve Jobs", "2. Bill Gates", "3. Vo Dang Huy", "4. Charles Babbage"},
                {"1. Pascal", "2. C", "3. Fortran", "4. Assembly"},
        };
        int[] correctAnswers = {3,1,2,4,3};
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("********************");
        System.out.println("WELCOME TO QUIZ GAME");
        System.out.println("********************");

        for(int i = 0; i < questions.length; i++)
        {
            System.out.println(questions[i]);
            for(String answer : answers[i])
            {
                System.out.println(answer);
            }
            System.out.print("Enter your choice (1 - 4): ");
            int choice = scanner.nextInt();
            if(choice == correctAnswers[i])
            {
                score+=1;
            }
            System.out.println();
        }
        System.out.printf("Your score is: %d out of 5", score);
        scanner.close();
    }
}
