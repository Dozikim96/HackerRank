 import java.util.*;
 public class main{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the length of array: ");
         int n = sc.nextInt();
         int[] arr = new int[n];
         
         for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
         }
         System.out.println("The element present in array: ");
         print(arr);
         
         System.out.println("\nThe sorted array is:");
         Arrays.sort(arr);
         print(arr);
     }
     public static void print(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        
     }
 }
