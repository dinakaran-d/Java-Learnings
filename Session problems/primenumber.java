import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        int n;
        int count=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        n = scanner.nextInt();
        
 if (n<2){
    System.out.println("Is not prime");
 }

   else {    for (int i=2; i<n; i++) {
            if (n%i==0) {
                count +=1;
            }
        }
        if (count>0) {
            System.out.println("Is not prime");
            
        }
    
        else {
        System.out.println("Is prime");
        }
    }

    }
    
}