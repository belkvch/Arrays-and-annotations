package ex15;

public class StringArrays {
    public static void main(String[] args) {
        String[] strs = {"This", "string", "is", "the", "text."};
        System.out.println("The origin array: ");
        for (String s : strs) {
            System.out.print(s + " ");
        }
        System.out.println("\n");
        strs[2] = "also is";
        strs[3] = "text";
        strs[4] = "!";
        System.out.println("The new array: ");
        for (String s : strs) {
            System.out.print(s + " ");
        }
    }
}
