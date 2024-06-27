import java.util.Scanner;
    public class sumof2numbers {
        public static void main(String[] args)  {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a first number ");
            int a; int b;
            a = scanner.nextInt();
            System.out.println("Enter a second number ");
            b = scanner.nextInt();
            int sum = (a+b);
            System.out.println("Sum of two numbers is " + sum);

        }
    }