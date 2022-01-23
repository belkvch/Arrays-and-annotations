package ex4;

public class Bubble {
    public static void main(String[] args) {
        int i, j, tempInt;
        final int SIZE = 10;
        int nums[] = new int[SIZE];
        System.out.println("The original array: ");
        for (i = 0; i < SIZE; i++) {
            nums[i] = (int) (Math.random()*40);
            System.out.print(" " + nums[i]);
        }
        //bubble sort
        for (i = 1; i < SIZE; i++) {
            for (j = SIZE - 1; j >= i; j--) {
                if (nums[j-1] > nums[j]) {
                    tempInt = nums[j-1]; //swap
                    nums[j-1] = nums[j];
                    nums[j] = tempInt;
                }
            }
        }
        System.out.println("\nThe sort array: ");
        for (i = 0; i < SIZE; i++)
            System.out.print(" " + nums[i]);
    }
}
