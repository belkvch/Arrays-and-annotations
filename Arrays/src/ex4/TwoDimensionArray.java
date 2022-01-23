package ex4;

import java.util.Scanner;

public class TwoDimensionArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row = scan.nextInt();
        System.out.print("Enter the number of collum: ");
        int collum = scan.nextInt();
        char[][] table = new char [row][collum];
        System.out.println("\nThe two dimension array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < collum; ++j) {
                table[i][j] =(char) (Math.random()*1054 - 10);
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
