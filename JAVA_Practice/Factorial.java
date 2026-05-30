import java.util.*;

public class Factorial {

    public static void fact(int n) {

        int fact = 1;

        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("The Factorial of given num is: " + fact);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number for factorial: ");
            int n = sc.nextInt();
            fact(n);
        }
    }
}