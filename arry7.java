//Sum of Array Elements: 5
//made by:Aditya Pal

import java.util.Scanner;

public class arry7 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        System.out.println("Enter the size of the array:");
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of Array Elements: "+sum);
    }
}
