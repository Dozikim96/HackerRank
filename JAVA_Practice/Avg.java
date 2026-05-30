import java.util.*;
public class Avg{
    public static void Average(int a, int b, int c){
        int Result  = (a+b+c)/3;
        System.out.println("The Average of All the number is:" +Result);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int a = sc.nextInt();
        System.out.print("Enter the value: ");
        int b = sc.nextInt();
        System.out.print("Enter the value: ");
        int c = sc.nextInt();
        sc.close();
       
        
        Average(a,b,c);
        
    }
}