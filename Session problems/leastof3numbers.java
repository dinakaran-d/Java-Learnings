import java.util.Scanner;
    public class leastof3numbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a; int b; int c;
            System.out.println("Enter a first number");
            a = scanner.nextInt();
            System.out.println("Enter a second number");
            b = scanner.nextInt();
            System.out.println("Enter a third number");
            c = scanner.nextInt();

            if (a<=b && a<=c)
            System.out.println("first number is smallest");
            else if (b<=c && b<=a)
            System.out.println("second number is smallest");
            else 
            System.out.println("third number is smallest");
            



        }
    }