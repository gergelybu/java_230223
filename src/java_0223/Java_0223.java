package java_0223;

public class Java_0223 {

    public static void main(String[] args) {
        kiiras("Az els? 10 szám összege: " + elso10SzamOsszege());
        int szam1 = 1;
        int szam2 = 2;
        int osszeg = osszead(szam1, szam2);
        kiiras("%d + %d = %d".formatted(szam1, szam2, osszeg));
        int szam3 = 3;
        int szam4 = 4;
        int osszeg2 = osszead(szam3, szam4);
        int vegosszeg = osszead(osszeg, osszeg2);
        kiiras("%d + %d + %d + %d = %d".formatted(szam1, szam2, szam3, szam4, vegosszeg));
    }

    private static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;

    }

    private static void kiiras(String szoveg) {
        System.out.println(szoveg);

    }

    private static int osszead(int a, int b) {
        return a + b;
    }
}
