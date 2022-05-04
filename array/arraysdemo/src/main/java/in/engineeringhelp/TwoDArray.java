package in.engineeringhelp;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of row: ");
        int row = sc.nextInt();

        System.out.println("Enter size of column: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            System.out.println("Enter elements for row: " + i);
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Reading elements from array: ");
        System.out.println("Size of array " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
