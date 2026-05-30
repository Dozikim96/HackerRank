import java.util.Scanner;
class Function {

    Scanner sc = new Scanner(System.in);

    public void Add() {
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter another number: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("The sum is: " + sum);
    }

    public void Name() {
        sc.nextLine(); // clears leftover newline

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Your name is: " + name);
    }

    public static void main(String[] args) {

        Function obj = new Function();

        obj.Add();
        obj.Name();

        obj.sc.close();
    }
}