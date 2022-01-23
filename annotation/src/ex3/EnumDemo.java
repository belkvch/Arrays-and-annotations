package ex3;

class EnumDemo {
    public static void main(String[] args) {
        System.out.println("Яблoкo сорта Winesap стоит "
                + Apple.Winesap.getPrice() + " рублей.");

        System.out.println("Цeны на все сорта яблок:");
        for (Apple apple : Apple.values()) {
            System.out.println("Килограмм яблок сорта \""
                    + apple + "\" стоит " + apple.getPrice() + " рублей.");
        }
    }
}
