public class Kucing {
    // property
    private String ras;
    private String nama;

    // konstruktor
    Kucing() {
        this.ras = "N/A";
        this.nama = "Nameless";
    }

    Kucing(String ras, String nama) {
        this.ras = ras;
        this.nama = nama;
    }

    void setRas(String ras) {
        this.ras = ras;
    }

    String getRas() {
        return ras;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    String getNama() {
        return nama;
    }

    // method
    void printRas() {
        System.out.println(ras);
    }

    void printNama() {
        System.out.println(nama);
    }
}
