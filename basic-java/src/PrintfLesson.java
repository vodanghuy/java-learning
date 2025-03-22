public class PrintfLesson {
    public static void main(String[] args) {
        double price1 = 9000.99;
        double price2 = 123000.66;
        double price3 = -54000.3;
        System.out.printf("%,.2f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%,.2f\n", price3);
    }
}
