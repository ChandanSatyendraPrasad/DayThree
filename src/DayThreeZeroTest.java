import java.util.Scanner;

public class DayThreeZeroTest {
    public DayThreeZeroTest() {
        System.out.println("FACTORIAL is 1");
    }

    int fact_value;

    public DayThreeZeroTest(int fact_value) {
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

        switch (i) {
            case 0:
                System.out.println("i Size" + Integer.SIZE);
                DayThreeZero dayOneFour = new DayThreeZero();
                break;
            case 8:
                System.out.println("i Size = " + Integer.SIZE);
                DayThreeZero dayOneFour1 = new DayThreeZero(i);
                break;
            case 5:
                System.out.println("i Size = " + Integer.SIZE);
                DayThreeZero dayOneFour2 = new DayThreeZero(i);
                break;
            default:
                System.out.println("i Size = " + Integer.SIZE);
                DayThreeZero dayOneFour3 = new DayThreeZero(i);
                break;

        }
    /*    if (i == 0) {
            System.out.println("i Size" + Integer.SIZE);
            DayThreeZero dayOneFour = new DayThreeZero();
        } else {
            System.out.println("i Size = " + Integer.SIZE);
            DayThreeZero dayOneFour1 = new DayThreeZero(i);
        }*/

    }
}
