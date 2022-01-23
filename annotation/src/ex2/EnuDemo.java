package ex2;

import ex1.Apple;

public class EnuDemo {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Koнcтaнты перечисляемого типа Apple: ");
        Apple[] allApples = Apple.values();
        for (Apple a : allApples) System.out.println(a);

        ap = Apple.valueOf("Winesap");
        System.out.println("Пepeмeннaя ар содержит " + ap);
    }
}
