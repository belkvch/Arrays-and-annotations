package ex2;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        //int[] nums = {99, -10, 100123, 18, -978, 5623, 463, 9, 287, 49}; - числа задаем сами

//       Мы знаем кол-во элементов:
//        System.out.print("The random array: ");
//        int[] nums = new int[10];
//        for (int i = 0; i < 10; i++) {
//            nums[i] = ((int)(Math.random() * 31) - 15);
//            System.out.print(nums[i] + " ");
//        }

//        Мы не знаем кол-во элементов
        System.out.println("Enter the length of array: ");
        Scanner input = new Scanner(System.in);
        int numberOfElements = input.nextInt();
        System.out.print("The random array: ");
        int[] nums = new int[numberOfElements];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ((int) (Math.random() * 31) - 15);
            System.out.print(nums[i] + " ");
        }

        int min, max;
        min = max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("\nmin and max: " + min + " " + max);
    }
}

