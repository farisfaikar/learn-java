import javax.print.event.PrintJobListener;

class Mobil {
    // property
    String merk;
    String _pemilik;
    String _warna;

    // method konstruktor
    Mobil(String pemilik, String warna) {
        merk = "Daihatsu";
        _pemilik = pemilik;
        _warna = warna;
    }

    // method biasa
    void setMerk(String merkBaru) {
        merk = merkBaru;
    }

    void lihatMerk() {
        System.out.println("Merk Mobilku: " + merk);
    }

    void lihatWarna() {
        System.out.println("Warna mobil " + merk + ": " + _warna);
    }

    void lihatNamaPemilik() {
        System.out.println("Nama pemilik: " + _pemilik);
    }

    public static void main(String[] aa) {
        // System.out.println("Hello World");
        Mobil mobilFaris = new Mobil("Faris Faikar Razannafi", "Navy");
        mobilFaris.lihatMerk(); // Daihatsu
        mobilFaris.setMerk("Pagani");
        mobilFaris.lihatMerk(); // Pagani
        mobilFaris.lihatNamaPemilik(); // Pagani

        Mobil mobilSyadu = new Mobil("Syadu Budi Kusuma", "Maroon");
        mobilSyadu.lihatMerk(); // Daihatsu
        mobilSyadu.setMerk("Maserati");
        mobilSyadu.lihatMerk(); // Maserati

        mobilSyadu.lihatWarna();
    }
}
