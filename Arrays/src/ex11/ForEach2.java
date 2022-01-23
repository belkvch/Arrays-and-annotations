package ex11;

public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][5];
        for (int i = 0; i < 3; i++) { //строки
            for (int j = 0; j < 5; j++) { //столбцы
                nums[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int[] x : nums) { //получает ссылку на строки, поэтому используем массив
            for (int y : x) { //уже доступ к столбцам
                System.out.print(y + " ");
                sum += y;
            }
            System.out.println();
        }
        System.out.println("The sum is " + sum);
    }
}
