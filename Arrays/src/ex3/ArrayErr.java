package ex3;

public class ArrayErr {
    public static void main(String[] args) {
        final int SIZE = 10; //final for making const
        int sample[] = new int[SIZE];
       // for (int i = 0; i<100; i = i + 1) {sample[i] = 1;} //индекс выходит за границы массива
        //ошибка времени выполнения
        for (int i = 0; i<sample.length; i = i + 1) {
            sample[i] = 1;
            System.out.print(sample[i] + " ");
        }
    }
}
