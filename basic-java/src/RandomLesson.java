import java.util.Random;

public class RandomLesson {
    public static void main(String[] args) {

        Random random = new Random();

        Boolean isHeads;
        isHeads = random.nextBoolean();
        if(isHeads)
        {
            System.out.println("HEADS");
        }
        else {
            System.out.println("TAILS");
        }
        
    }
}
