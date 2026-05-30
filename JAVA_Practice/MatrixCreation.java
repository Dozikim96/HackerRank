import java.util.*;
public class MatrixCreation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of Rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the no of column: ");
        int col = sc.nextInt();
        
        int[][] arr = new int[row][col];
        System.out.println("Enter the element of array: ");
        
        for(int i=0; i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Element of array is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();        
    }
}