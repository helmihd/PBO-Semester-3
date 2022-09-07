import java.util.Scanner;

public class KonversiAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ketik nilai : ");
        int skor = scanner.nextInt();
        double angka = 0.0;
        String huruf;
        if (skor >= 85) {
            angka = 4.00;
            huruf = "A";
        } else if (skor >= 80 ) {
            angka = 3.70;
            huruf = "A-";
        } else if (skor >= 75) {
            angka = 3.30;
            huruf = "B+";
        } else if (skor >= 70) {
            angka = 3.00;
            huruf = "B";
        } else if (skor >= 65) {
            angka = 2.70;
            huruf = "C+";
        } else if (skor >= 60) {
            angka = 2.00;
            huruf = "C";
        } else if (skor >= 55) {
            angka = 1.00;
            huruf = "D";
        } else {
            angka = 0.00;
            huruf = "E";
        }

        System.out.println("Skor anda adalah : " + skor);
        System.out.println("Angka anda adalah : " + angka);
        System.out.println("Huruf anda adalah : " + huruf);
    }
}
