/*
Reverse the Array:
Ek integer N diya hoga (array size).
Next N numbers array ke elements honge.
Tumhe array ko reverse order me print karna hai.
made by: Aditya Pal
*/

import java.util.Scanner;

public class arry8 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
         System.out.println("Enter the size of the array: ");
       int N = input.nextInt();
       
         int[] arr = new int[N];
         System.err.println("Enter the elements of the array: ");
         for (int i = 0; i < N; i++) {
             arr[i] = input.nextInt();
         }
            System.out.println("The reverse of the array is: ");
            for (int i=0;i<N/2;i++){
                arr[i] = arr[i] + arr[N-i-1];
                arr[N-i-1] = arr[i] - arr[N-i-1];
                arr[i] = arr[i] - arr[N-i-1];
            }
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
    }
}
