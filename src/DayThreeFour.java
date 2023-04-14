import java.util.Scanner;
public class DayThreeFour {
    static int num1,num2;
  static   Scanner scanner;
    public static void main(String[] args) {
        int chh = 0,ch;
        scanner = new Scanner(System.in);
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
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    takeinput();
                    int sum =num1+num2;
                    System.out.println("SUM = "+sum);
                    break;
                case 2:
                    takeinput();
                    int sub =num1-num2;
                    System.out.println("SUB = "+sub);
                    break;
                case 3:
                    takeinput();
                    int mul =num1*num2;
                    System.out.println("MUL = "+mul);
                    break;
                case 4:
                    takeinput();
                    if(num2!=0)
                    {
                        int div =num1/num2;
                        System.out.println("DIV = "+div);
                    }else {
                        System.out.println("DIVIDE BY ZERO ERROR");
                    }
                    break;
                case 5:
                    System.out.println("5.****Factorial*****");
                    break;
                case 6:
                    takeoneinput();
                    num2=num1*(num1+1)/2;
                    System.out.println("***Sum of n *****"+num1+" = "+num2);
                    break;
                default:
                    do {
                        System.out.println("Do You Really Want To Exit.\n To exit press 9");
                        chh= (new Scanner(System.in).nextInt());//Different Approach
                    }while (chh!=9);
                    break;
            }
        } while (ch != 0);
    }
    private static void takeoneinput() {
        System.out.println("Enter the value of  number ");
        num1=scanner.nextInt();
    }
    private static void takeinput() {
        System.out.println("Enter the value of first number ");
        num1=scanner.nextInt();
        System.out.println("Enter the value of second number ");
        num2=scanner.nextInt();
    }
}

