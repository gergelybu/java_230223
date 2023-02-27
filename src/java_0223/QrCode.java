package java_0223;

import java.util.Random;

public class QrCode {

    private static final Random rnd = new Random();

    public static void main(String[] args) {
        qrGen();
        //konzolraKiir(qr(20, true));
        //konzolraKiir(qr(20));
        //qr(20, true);
    }

    private static void qrGen() {
        konzolraKiir(qr());
        konzolraKiir(qr(20));
        konzolraKiir(qr(true));
        konzolraKiir(qr(20, true));
    }

    private static void konzolraKiir(int[][] tomb) {
        int hosszi = tomb[0].length;
        int hosszj = tomb[1].length;
        for (int i = 0; i < hosszi; i++) {
            for (int j = 0; j < hosszj; j++) {
                if (tomb[i][j] == 1) {
                    System.out.print("\u001B[40m" + " ");
                } else if (tomb[i][j] == 2) {
                    System.out.print("\u001B[47m" + " ");
                } else {
                    System.out.print("\u001B[42m" + " ");
                }

            }
            System.out.println("");
        }
        System.out.println("");

    }

    private static int velSzam(int a, int b) {
        return rnd.nextInt(a, b);
    }

    private static int[][] qr() {
        boolean boo = false;
        int hossz = velSzam(10, 20);
        return qr(hossz, boo);
    }

    private static int[][] qr(int hossz) {
        boolean boo = false;
        return qr(hossz, boo);
    }

    private static int[][] qr(boolean boo) {
        int hossz = velSzam(10, 20);
        return qr(hossz, boo);
    }

    private static int[][] qr(int hossz, boolean boo) {
        int[][] tomb = new int[hossz][hossz];
        for (int i = 0; i < hossz; i++) {
            for (int j = 0; j < hossz; j++) {
                int szin = velSzam(1, 3);
                tomb[i][j] = szin;
                if (boo && i < 5 && j > hossz - 6) {
                    switch (i) {
                        case 0:
                        case 4:
                            tomb[i][j] = 3;
                            break;
                        case 1:
                        case 3:
                            if (j == hossz - 5 || j == hossz - 1) {
                                tomb[i][j] = 3;
                            } else {
                                tomb[i][j] = 2;
                            }
                            break;
                        case 2:
                            if (j == hossz - 5 || j == hossz - 1) {
                                tomb[i][j] = 3;
                            } else if (j == hossz - 3) {
                                tomb[i][j] = 3;
                            } else {
                                tomb[i][j] = 2;
                            }
                            break;
                        default:
                            break;
                    }

                }

            }
        }
        return tomb;
    }
}
