import java.util.Scanner;
    public class firstnfibonacci {
        public static void main(String[] args) {
            Scanner Scanner = new Scanner(System.in);
            System.out.print("Enter a number of terms ");
            int n = Scanner.nextInt();
            int i;
            int first=0;  int second=1;
            System.out.print("Fibonacci sequence " + first +" " + second);
            for (i=3; i <= n; i++) {
                int next = first + second;
                System.out.print(" " +next);
                first = second;
                second = next;

            }
            
        }
        
    }