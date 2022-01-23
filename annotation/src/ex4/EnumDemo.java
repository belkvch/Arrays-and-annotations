package ex4;

import ex1.Apple;

class EnumDemo {
    public static void main(String[] args) {
        Apple ap1, ap2, ap3;

        System.out.println("Bce константы сортов яблок " +
                " и их порядковые значения: ");
        for (Apple apple : Apple.values())
            System.out.println(apple + " " + apple.ordinal());
        System.out.println();

        ap1 = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;
        if (ap1.compareTo(ap2) < 0)
            System.out.println(ap1 + " предшествует " + ap2);
        if (ap1.compareTo(ap2) > 0)
            System.out.println(ap2 + " предшествует " + ap1);
        if (ap1.compareTo(ap3) == 0)
            System.out.println(ap1 + " равно " + ap3);
        System.out.println();

        if (ap1.equals(ap2))
            System.out.println("Oшибкa ! ");
        if (ap1.equals(ap3))
            System.out.println(ap1 + " равно " + ap3);
        if (ap1 == ap3)
            System.out.println(ap1 + " == " + ap3);
    }
}
