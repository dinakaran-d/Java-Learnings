import java.util.Scanner;
    public class leapyear {
        public static void main(String[] args) {
            int n;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a year");
            n = scanner.nextInt();

            if (n %4 ==0 && n%100 !=0 || n%400==0 )
            System.out.println("It is a leap year");
            else
            System.out.println("It is not a leap year");
        }

    }