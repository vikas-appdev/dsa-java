package in.engineeringhelp;

import java.util.Scanner;

public class ArrayOneD {
    public static void main(String[] args) {
        // Getting input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Reading Elements from array: ");
        // Reading Elements from array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array at index " + i + " is: " + arr[i]);
        }
        sc.close();
    }
}
