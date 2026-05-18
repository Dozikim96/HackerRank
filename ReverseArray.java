import java.util.*;
public class main{
    public static void main(String[] args){
        int[] arr = {14,5,6,9,8,0,2,3,4};
        int i = 0;
        int j = arr.length - 1;
        
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j--;
        }
        for(int ele : arr) System.out.print(ele +" ");
    }
}
