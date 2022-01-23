package ex8;

import java.util.Arrays;
public class UseArrays {
    public static void main(String[] args) {
        System.out.println("The work with array: ");
        float[] numbers = {1562.25f, -2, 14.4f, 99.5f, 24, 62, 43.5f,241.5f,10,-2};

        float[] numbersCopy = Arrays.copyOf(numbers,numbers.length); //метод для копирования массива, 2 аргумента
        //float[] numbers 1 = new float [numbers.length];
        //for (int i = 0; i < numbers.length; i++)
        //   numbers1[i]=numbers[i];

        System.out.println(Arrays.toString(numbersCopy)); //вывод скопированного массива
        Arrays.sort(numbers); //сортировка оригинального массива
        System.out.println(Arrays.toString(numbers));
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        } //вывод отсортированного
        System.out.println();

        numbersCopy = Arrays.copyOfRange(numbers,2,6); //копируем по границе, 6 не включается
        System.out.println(Arrays.toString((numbersCopy))); //вывод скопированного
        System.out.println(numbers.equals(numbersCopy)); //проверка схож ли исходный массив со скопированным

        System.out.println("\nThe work with matrix: ");
        int[][] numbers2D = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] numbers2DCopy = Arrays.copyOf(numbers2D,numbers2D.length); //копируем
        System.out.println("Do that matrixes equal?");
        System.out.println(Arrays.deepEquals(numbers2D,numbers2DCopy)); //сравнение двух массивов
        System.out.println(Arrays.deepToString((numbers2DCopy))); //вывод скопированного
    }
}
