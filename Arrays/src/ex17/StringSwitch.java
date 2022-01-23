package ex17;

import java.util.Scanner; //если ставить *, то будут подключаться только файлы, без папок
//import on fly
public class StringSwitch {
    public static void main(String[] args) {
        do {
            Scanner in = new Scanner(System.in); //out и in - поля
            System.out.println("Enter the command: ");
            String command = in.nextLine();
            switch (command) {
                case "connect":
                    System.out.println("Набор операторов для выполнения команды \"Соединение\""); //экранирование с помощью слэша
                    break; //прерывает switch, но не цикл
                case "cancel":
                    System.out.println("Набор операторов для выполнения команды \"Отмена действия\"");
                    break;
                case "disconnect":
                    System.out.println("Набор операторов для выполнения команды \"Разъединение\"");
                    break;
                default:
                    System.out.println("Неверная команда!");
                    break;
            }
        } while (true); //цикл бесконечный
    }
}
