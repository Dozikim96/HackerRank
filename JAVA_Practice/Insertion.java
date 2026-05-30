public class Insertion{
    public static void main(String[] args){
        
        int[] arr={10,20,30,40,50};
        
        int position=2;
        int value=99;
        
        int[] newArr=new int[arr.length+1];
        
        for(int i=0,j=0;i<newArr.length;i++){
            
            if(i==position){
                newArr[i]=value;
            } else{
                newArr[i]=arr[j++];
            }
        }
        System.out.println("After Insertion:");
        for(int num : newArr){
            System.out.print(num+" ");
        }
        
        
        }
    }

    