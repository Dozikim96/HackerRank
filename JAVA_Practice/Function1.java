import java.util.*;

public class Function1{
    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first num: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second num: ");
        int b = sc.nextInt();
        
        int result=add(a,b);
        System.out.println("Multiplication is: " +result);
        sc.close();
    }
}