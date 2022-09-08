public class LatihanVariabel {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.0;
        float c = 4.3f;

        // ubah variabel a dan c ke tipe data double
        double KonversiA = Double.valueOf(a);
        double KonversiC = Double.valueOf(c);

        // jumlahkan variabel a, b, dan c
        double d = KonversiA + b + KonversiC;

        // tampilkan hasil penjumlahan ketiga variabel
        System.out.println("Hasil a + b + c = " +d);
    }
}
