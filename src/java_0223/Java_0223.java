package java_0223;

public class Java_0223 {

    public static void main(String[] args) {
        kiiras("Az első 10 szám összege: " + elso10SzamOsszege());
        kiiras("A két szám összege =" + osszead(1, 2));        
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