import java.util.Scanner;

public class DayThreeOne {
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the value ");
            n = scanner.nextInt();
            System.out.println("Do you want to exit press 0 " );
        } while (n != 0);

    }
}
