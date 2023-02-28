// Nama: Faris Faikar Razannafi
// NIM: 4611421092
// PBO: Kelompok 1

public class Manusia {
    private String nama;
    private boolean punyaTV;

    public Manusia() {
        nama = "noname";
        punyaTV = false;
    }

    public Manusia(String nama) {
        this.nama = nama;
    }

    public String namaSaya() {
        return nama;
    }

    public void beliTV(TV tiviku) {
        punyaTV = true;
    }

    public void jualSemuaTV() {
        punyaTV = false;
    }

    public boolean cekTV() {
        return punyaTV;
    }
}
