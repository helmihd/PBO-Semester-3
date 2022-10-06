import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {
        String NIM, nama, jenis_kelamin, alamat;
        Scanner keyboard = new Scanner(System.in).useDelimiter("\n");

        System.out.print("NIM: ");
        NIM = keyboard.next();
        System.out.print("nama: ");
        nama = keyboard.next();
        System.out.print("janis kelamin: ");
        jenis_kelamin = keyboard.next();
        System.out.print("alamat: ");
        alamat = keyboard.next();

        keyboard.close();
        System.out.println("\nDATA MAHASISWA YANG TERSIMPAN");
        System.out.println("NIM : " + NIM);
        System.out.println("nama : " + nama);
        System.out.println("jenis kelamin: " + jenis_kelamin);
        System.out.println("alamat : " + alamat);
    }
}
