public class VarargsLesson {
    public static void main(String[] args) {

        System.out.println(Average(1,2,3,4));
    }
    static double Average(int... numbers)
    {
        double average = 0;
        double sum = 0;
        for(int number : numbers)
        {
            sum += number;
        }
        average = sum / numbers.length;
        return average;
    }
}
