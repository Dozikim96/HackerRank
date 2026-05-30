import java.util.*;
public class SumOfOddNum {
    public static void Sum(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            if(i%2!=0){
                sum = sum + i;
            }
        }
        System.out.println("The Sum is:" +sum);
    }
    public static void main(String[] args) {
        Scanner ni = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = ni.nextInt();
        ni.close();
        Sum(n);
    }
}
