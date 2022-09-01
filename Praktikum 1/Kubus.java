public class Kubus {
    int sisiKubus = 5;

    public Double hitungVolume() {
        Double volume = 0.0 + this.sisiKubus * this.sisiKubus * this.sisiKubus;
        return volume;
    }

    public int hitungLuasPermukaan() {
        int luasPermukaan = 0;
        luasPermukaan = this.sisiKubus * this.sisiKubus * 6;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        Double volume = kubus.hitungVolume();
        int luasPermukaan = kubus.hitungLuasPermukaan();

        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }
}