import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght of array:");
        int n = sc.nextInt();
        int max = 0;
        
        int[] arr = new int[n];
        
        System.out.print("Enter the element:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The element are: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] );
        }
        System.out.println("The max number of array");
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("Maximum num is: " +max);
    }
}
