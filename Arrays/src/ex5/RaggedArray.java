package ex5;

public class RaggedArray {
    public static void main(String[] args) { //warning
        int[][] trips = new int[7][];
        //framework collections
        trips[0] = new int[10];
        trips[1] = new int[10];
        trips[2] = new int[10];
        trips[3] = new int[10];
        trips[4] = new int[10];
        trips[5] = new int[2];
        trips[6] = new int[2];
        System.out.println("The number of people for holiday: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                trips [i][j] = (int) (Math.random() * 10);
                System.out.print(trips[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nThe number of people for common day: ");
        for (int i = 5; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                trips [i][j] = (int) (Math.random() * 10);
                System.out.print(trips[i][j] + " ");
            }
            System.out.println();
        }
    }
}
