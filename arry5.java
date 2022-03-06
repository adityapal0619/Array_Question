import java.util.*;

public class arry5 {    
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int []arry=new int[num];
        for(int i=0;i<arry.length;i++){
            arry[i]=input.nextInt();
        }
        int find=input.nextInt();
       int element= binarry(arry,find);
       System.out.println(element);
    }

     static int binarry(int[] arr,int key) {
         int start=0;
         int end=arr.length-1;
         while(start<end){
             int mid=(start+end)/2;
             if(arr[mid] == key){
                 return mid;
             }
             if(arr[mid] < key){
                 start=mid+1;
             }
             else{
                 end=mid-1;
             }
         }
         return -1;
         
    }
    
}
