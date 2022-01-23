package ex18;

public class CLDemo {
    public static void main(String[] args) {
        System.out.println("Пpoгpaммe передано " + args.length + " аргументов командной строки.");
        System.out.println("Cписoк аргументов: ");
//        for (int i = 0; i < args.length; i++) {
//            System.out.print( args[i] + " ");
//        }
        for (String a:args) {
            System.out.print(a + " ");
        }
    }
}
//19 пример самой
//арность: унарный ++, бинарный +=, тернарный
// (условие)?действие для true: действие для false