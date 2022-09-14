public class Latihan_1b {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 2; i <= 500; i += 2) {
            sum = sum + i;
        }
        System.out.println("Sum = " +sum);
    }
}