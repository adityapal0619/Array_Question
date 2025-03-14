//Array Input & Output: Write a program to input 10 integer elements in an array and display them.
// Made by aditya pal

import java.util.Scanner;

public class arry6 {
   public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       int[] arry= new int [10];
       for(int i=0;i<10;i++){
              System.out.print("Enter the Number: ");
           arry[i]=input.nextInt();
       }
       System.out.println("The elements are: ");
       for(int i=0;i<10;i++){
           System.out.println(arry[i]);
       }
   }
    
}
