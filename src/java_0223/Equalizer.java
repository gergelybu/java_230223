package java_0223;

import java.util.Random;

public class Equalizer {

    private static final Random rnd = new Random();

    public static void main(String[] args) {
        eq();
        eq(8, true);
        eq(12);
        eq(true);
        eq();

    }

    /* private static void ciklus() {
        int i = 0;
        while (i < 5) {
            eq();
            i += 1;
        }
    }*/
    private static void eq() {
        int db = rnd.nextInt(3, 8);
        boolean boo = false;
        eq(db);
        eq(db, boo);
        eq(boo);

    }

    private static void eq(int db) {
        boolean boo = false;
        eq(db, boo);
        /*for (int i = 0; i < db; i++) {
            System.out.print("\u001B[45m" + " ");
        }
        System.out.println("");*/
    }

    private static void eq(int db, boolean boo) {
        for (int i = 0; i < db; i++) {
            System.out.print("\u001B[45m" + " ");
        }
        if (boo) {
            System.out.println("\u001B[0m(" + db + ")");
        }
    }

    private static void eq(boolean boo) {
        int db = rnd.nextInt(3, 8);
        eq(db, boo);
        /*for (int i = 0; i < db; i++) {
            System.out.print("\u001B[45m" + " ");
        }
        if (boo) {
            System.out.println("\u001B[0m(" + 4 + ")");
        }*/
    }
}
