import java.util.Scanner;
    public class studentsgrade {
        public static void main(String[] args) {
            int mark;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a mark (0-100)");
            mark = scanner.nextInt();

            if (mark >= 90 && mark <= 100)
            System.out.println("Your grade is A");
            else if (mark >= 80 && mark <= 89)
            System.out.println("Your grade is B");
            else if (mark >= 70 && mark <= 79)
            System.out.println("Your grade is C");
            else if (mark >= 60 && mark <= 69)
            System.out.println("Your grade is D");
            else
            System.out.println("Your grade is E");
        }
    }