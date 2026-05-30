public class MaxNum {
    public static void main(String[] args) {
        int[] arr = {10,50,60,90,5,2,100};
        int max =  arr[0];
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.err.println("The Max Num is: "+max);
        System.err.println("The Min Num is: "+min);
    
    }
}