import java.util.Scanner;
public class largestof3numbers {
        public static void main(String[] args) {
                int a,b,c;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your first number");
                a = scanner.nextInt();
                System.out.println("Enter your second number");
                b = scanner.nextInt();
                System.out.println("Enter your third number");
                c = scanner.nextInt();

                if (a>=b & a>=c)
                System.out.println("Largest number is first one");
                else if (b>=c & b>=a)
                System.out.println("Largest number is second one");
                else if (c>=a & c>=b)
                System.out.println("Largest number is third one");

        }
}