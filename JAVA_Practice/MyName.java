import java.util.*;
public class MyName{
    public static void CallName(String A){
        System.out.println("Good Morning " +A);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String A = sc.next();
        
        CallName(A);
        sc.close();
        
    }
    
}