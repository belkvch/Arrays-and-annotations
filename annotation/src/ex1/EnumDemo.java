package ex1;

class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println("Знaчeниe ар: " + ap + "\n");
        ap = Apple.GoldenDel;
        if (ap == Apple.GoldenDel)
            System.out.println("Пepeмeннaя ар содержит значение GoldenDel.\n");
        ap = Apple.Error;

        switch (ap) {
            case Jonathan:
                System.out.println("Copт Jonathan красный.");
                break;
            case GoldenDel:
                System.out.println("Copт GoldenDel желтый");
                break;
            case RedDel:
                System.out.println("Copт Red Delicious красный.");
                break;
            case Winesap:
                System.out.println("Copт Winesap красный.");
                break;
            case Cortland:
                System.out.println("Copт Cortland красный.");
                break;
            default:
                throw new AssertionError(ap.name());
        }
    }
}
