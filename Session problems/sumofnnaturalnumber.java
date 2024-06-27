import java.util.Scanner;
    public class sumofnnaturalnumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number of  term");
            int n;
            n = scanner.nextInt();
            int sum =0;
            for (int i=1; i<=n; i++) {
            sum +=i;
            }
            System.out.print(sum);
            
        }
    }