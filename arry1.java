import java.util.Scanner;

/*
Write a java program to find Maximum and minimum of an array using minimum number
made by-Aditya Pal
*/

public class arry1 {
   

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=input.nextInt();
        int[] arry= new int [num];
        for(int i=0;i<num;i++){
            arry[i]=input.nextInt();
        }
        System.out.println("The Smallest element is "+min(arry,num));
        System.out.println("The Biggest element is "+max(arry,num));
       
    }
    static int min(int arr[],int n){
        int min=Integer.MAX_VALUE;
       
        for(int i=0;i<n;i++){
            if(min > arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    static int max(int arr[],int n){
        int max=Integer.MIN_VALUE;
       
        for(int i=0;i<n;i++){
            if(max < arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
