//Given an array/list 'ARR' of integers and a position ‘M’. You have to reverse the array
// after that position.
//Aditya Pal

import java.util.Scanner;

public class arry4 {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int [] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the Index: ");
        int a=input.nextInt();
        int b=input.nextInt();
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        for(int i=0;i<num;i++){
            System.out.println(arr[i]);
        }



    }
    
}
