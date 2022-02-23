/*
Q.1-Write a program to reverse an array 
made by-Aditya Pal

*/

import java.util.*;
class arry0{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n=input.nextInt();
        int [] array=new int[n];
        for(int i=0;i<n;i++){
             array[i]=input.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }

    }
}