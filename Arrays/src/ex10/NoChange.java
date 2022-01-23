package ex10;

public class NoChange {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
            nums[i] *= 10;
        } //for - each не модифицирует элементы массива, а for может модифицировать
        System.out.println();
        for (int x : nums) {
            System.out.print(x + " ");
        }
    }
}
