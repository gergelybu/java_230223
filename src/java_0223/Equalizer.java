package java_0223;

import java.util.Random;

public class Equalizer {

    private static Random rnd = new Random();

    public static void main(String[] args) {
        ciklus();

    }

    private static void ciklus() {
        int i = 0;
        while (i < 5) {
            eq();
            i += 1;
        }
    }

    private static void eq() {
        int db = rnd.nextInt(3, 8);
        for (int i = 0; i < db; i++) {
            System.out.print("\u001B[45m" + " ");
        }
        System.out.println("");

    }
}
