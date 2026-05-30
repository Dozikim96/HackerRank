import java.util.*;

class Main {

    Scanner sc = new Scanner(System.in);

    public void name() {
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Your name is: " + name);
    }

    public void add() {
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("The sum is: " + sum);
    }

    public void sub(int a, int b) {
        int sub = a - b;

        System.out.println("The difference is: " + sub);
    }

    public static void main(String[] args) {

        Main obj = new Main();

        obj.name();
        obj.add();
        obj.sub(10, 5);

        obj.sc.close();
    }
}