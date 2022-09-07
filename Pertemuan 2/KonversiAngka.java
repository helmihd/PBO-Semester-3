import java.util.Scanner;

public class KonversiAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ketik skor : ");
        int skor = scanner.nextInt();
        double angka = 0.0;
        String huruf;
        if (skor >= 85) {
            angka = 4.00;
            huruf = "A";
        } else if (skor >= 80 && skor <= 84) {
            angka = 3.70;
            huruf = "A-";
        } else if (skor >= 75 && skor <= 79) {
            angka = 3.30;
            huruf = "B+";
        } else if (skor >= 70 && skor <= 74) {
            angka = 3.00;
            huruf = "B";
        } else if (skor >= 65 && skor <= 69) {
            angka = 2.70;
            huruf = "C+";
        } else if (skor >= 60 && skor <= 64) {
            angka = 2.00;
            huruf = "C";
        } else if (skor >= 55 && skor <= 59) {
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
