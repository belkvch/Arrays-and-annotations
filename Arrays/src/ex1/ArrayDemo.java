package ex1;

public class ArrayDemo {
    public static void main(String[] args) {
        //int arr[] - ссылка
        // new - оператор для динамического выделения памяти
        int sample[] = new int[10];
        for (int i = 0; i < 10; i++) { //инициализация, условие, модификация; итерация - один проход цикла
            sample[i] = i;
            System.out.println("The element [" + i + "] = " + sample[i]);
        }
    }
}
