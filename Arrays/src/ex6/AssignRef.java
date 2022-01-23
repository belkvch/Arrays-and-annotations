package ex6;

public class AssignRef {
    public static void main(String[] args) {
        int[] nums1 = new int[10]; //nums1 - ссылка
        int[] nums2 = new int[10];
        System.out.println("The nums1: ");
        for (int i = 0; i < 10; i++) {
            nums1[i] = i;
            System.out.print(nums1[i] + " ");}
        System.out.println("\nThe nums2: ");
        for (int i = 0; i < 10; i++) {
            nums2[i] = -i;
            System.out.print(nums2[i] + " ");}
        nums2 = nums1;
        System.out.println("\nThe result for nums2: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(nums2[i] + " ");}
        nums2[3] = 99;
        System.out.println("\nThe result for nums1: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(nums1[i] + " ");}
    }
}

