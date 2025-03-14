/*
 * Find the Majority Element:
Ek integer N diya hoga.
Tumhe aise element ka pata lagana hai jo N/2 se zyada baar aya ho.
Agar aisa element hai toh print karo, warna -1 print karo.
 */

import java.util.Scanner;

public class array14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int count = 1;
        int element = arr[0];
        for (int i=1;i<n;i++){
            if(arr[i] == element){
                count++;
            }
            else{
                count--;
            }
        }
        if(count>0){
            count = 0;
            for (int i=0;i<n;i++){
                if(arr[i] == element){
                    count++;
                }
            }
            if(count > n/2){
                System.out.println("Majority Element: "+element);
            }
            else{
                System.out.println("Majority Element: -1");
            }
        }
        else{
            System.out.println("Majority Element: -1");
        }
    }
}
