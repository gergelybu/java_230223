package java_0223;

public class Java_0223 {

    public static void main(String[] args) {
        /*kiiras("Az elsõ 10 szám összege: " + elso10SzamOsszege());
        int szam1 = 1;
        int szam2 = 2;
        int osszeg = osszead(szam1, szam2);
        kiiras("%d + %d = %d".formatted(szam1, szam2, osszeg));
        int szam3 = 3;
        int szam4 = 4;
        osszeg += osszead(szam3, szam4);
        kiiras("%d + %d + %d + %d = %d".formatted(szam1, szam2, szam3, szam4, osszeg));
        osszeg = osszead(szam2, szam3);
        osszeg = osszead(osszeg, szam4);
        double gyok = Math.sqrt(osszeg);
        kiiras("A gyök érték: " + gyok);*/
        meghivo();
    }

    private static void elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        kiiras("Az elsõ 10 szám összege: " + osszeg);

    }

    private static void kiiras(String szoveg) {
        System.out.println(szoveg);

    }

    private static int osszead(int a, int b) {
        return a + b;
    }

    private static void meghivo(){
        elso10SzamOsszege();
        ketszamosszad();
        negyosszead();
        gyokeskiir();
}
    private static void negyosszead() {
        int szam1 = 1;
        int szam2 = 2;
        int szam3 = 3;
        int szam4 = 4;
        int osszeg = osszead(szam1, szam2);
        osszeg += osszead(szam3, szam4);
        kiiras("%d + %d + %d + %d = %d".formatted(szam1, szam2, szam3, szam4, osszeg));
    }
    
     private static void ketszamosszad() {
        int szam1 = 1;
        int szam2 = 2;
        int osszeg = osszead(szam1, szam2);
        kiiras("%d + %d = %d".formatted(szam1, szam2, osszeg));
    }

    private static void gyokeskiir() {
        int szam2 = 2;
        int szam3 = 3;
        int szam4 = 4;
        int osszeg = osszead(szam2, szam3);
        osszeg = osszead(osszeg, szam4);
        double gyok = Math.sqrt(osszeg);
        kiiras("A gyök érték: " + gyok);
    }

}
