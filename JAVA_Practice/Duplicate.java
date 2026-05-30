import java.util.*;
public class Duplicate{
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,10,20};
        System.err.println("Original Array: " + Arrays.toString(arr));
        Same(arr);
    }
    public static void Same(int [] arr){
        Set<Integer> set = new HashSet<>();
        System.out.println("Duplicate elements in the array:");
        for (int i : arr) {
            if (!set.add(i)) {
                System.out.println(i + " ");
            }
        }
        System.err.println("Unique elements in the array:");
        for (int i : set) {
            System.out.print(i + " ");
        }
        System.err.println();
    }
}