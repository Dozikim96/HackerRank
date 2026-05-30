import java.util.*;
public class ArrayInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        sc.close();

        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("The elements in the array are:");
        for (int i : arr) {
            System.out.print(i + " ");
        }  
    }
}
