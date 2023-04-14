import java.util.Scanner;

public class DayThreeTwo {
    public static void main(String[] args) {
        int ch=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*****Menu*****");
            System.out.println("1.****Sum*****");
            System.out.println("2.***Sub*****");
            System.out.println("3.***Mul*****");
            System.out.println("4.***Div*****");
            System.out.println("5.***Factorial*****");
            System.out.println("6.***Sum of n*****");
            System.out.println("0.***Exit*****");
            System.out.println("Enter Your Choice = ");
            ch=scanner.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("1.****Sum*****");
                    break;
                case 2:
                    System.out.println("2.***Sub*****");
                    break;
                case 3:
                    System.out.println("3.***Mul*****");
                    break;
                case 4:
                    System.out.println("4.***Div*****");
                    break;
                case 5:
                    System.out.println("5.***Factorial*****");

                    break;
                case 6:
                    System.out.println("6.***Sum of n*****");
                    break;
                default:
                    System.out.println("Na Na Munna Na");
                    break;
            }
        }while (ch!=0);


    }
}
