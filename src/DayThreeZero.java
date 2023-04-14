import java.util.Scanner;

public class DayThreeZero {
    public DayThreeZero() {
        System.out.println("FACTORIAL is 1");
    }

    int fact_value;

    public DayThreeZero(int fact_value) {
        this.fact_value = fact_value;
        int fact = 1;
        while (fact_value != 1) {
            fact = fact * fact_value;
            fact_value--;
        }
        System.out.println("FACTORIAL IS = " + fact);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n for factorial ::");
        int i = scanner.nextInt();
        long test=3;
        System.out.println("LONG - "+Long.SIZE);

        double test1=13;
        System.out.println("Double - "+Double.SIZE);
        System.out.println("Value of n = " + i);
        if (i == 0) {
            System.out.println("i Size"+Integer.SIZE);
            DayThreeZero dayOneFour = new DayThreeZero();
        } else {
            System.out.println("i Size = "+Integer.SIZE);
            DayThreeZero dayOneFour1 = new DayThreeZero(i);
        }

    }
}