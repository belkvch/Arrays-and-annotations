package ex19;

public class Phone {
    public static void main(String[] args) {
        String[][] numbers = {
                {"Tom", "555-3322"},
                {"Mary", "555-8976"},
                {"Jon", "555-1037"},
                {"Rachel", "555-1400"}};
        int i = 0;
        if (args.length > 4) {
            System.out.println("Using: java Phone <name>");
        } else {
            for (;;) {
                for (i = 0; i < args.length; i++) {
                    System.out.println(numbers[i][0] + " : " + numbers[i][1]);
                }
                break;
            }
        }
    }
}
//сделать вывод больше одного
