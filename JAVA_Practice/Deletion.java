// Deletion At Spec Index:
public class Deletion{
    public static void main(String[]args){
        
        int[] arr={10,20,30,40,50};
        
        int position =2;
        
        int[] newArr=new int[arr.length-1];
        
        for(int i=0,j=0;i<arr.length;i++){
            
            if(i !=position){
                newArr[j++]=arr[i];
            }
        }
        System.out.println("After Deletion:");
        for(int num : newArr){
            System.out.print(num+" ");
        }
    }
}
