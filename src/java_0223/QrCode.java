package java_0223;

public class QrCode {

    public static void main(String[] args) {
        qrGen();
    }

    private static void qrGen() {
        konzolrakiir(qr());
        konzolrakiir(qr(20));
        konzolrakiir(qr(true));
        konzolrakiir(qr(20, true));
    }

    private static void qr() {
        boolean boo = false;
        int hossz = 0;
        qr(hossz, boo);
    }

    private static void qr(int hossz) {
        boolean boo = false;
        qr(hossz, boo);
    }

    private static void qr(boolean boo) {
        int hossz = 0;
        qr(hossz, boo);

    }

    private static void qr(int hossz, boolean boo) {

    }
}
