/*
Count Even and Odd Numbers:
Ek integer N diya hoga.
Tumhe batana hai ki kitne even aur odd numbers hain.
 */

import java.util.Scanner;

public class arry10 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = input.nextInt();
        int arr[]=new int[N];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        int even=0;
        int odd=0;
        for (int i = 0; i < N; i++) {
            if (arr[i]%2==0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("The number of even elements in the array is: " + even);
        System.out.println("The number of odd elements in the array is: " + odd);
        
    }
}
