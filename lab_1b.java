package Praneetha_adiga;

public class lab_1b {
    public static void main(String[] args) {

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0) {
                    System.out.print(" W ");
                } else {
                    System.out.print(" B ");
                }
            }
            System.out.println();
        }
    }
}
