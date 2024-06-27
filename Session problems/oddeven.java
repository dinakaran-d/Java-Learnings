import java.util.Scanner;
    public class oddeven {
        public static void main(String[] args) {
            int n;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number");
            n = scanner.nextInt();

            if (n %2==0)
            System.out.println("It is a even number");
            else 
            System.out.println("It is a odd number");
        }
    }