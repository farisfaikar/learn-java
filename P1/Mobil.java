class Mobil {
    // property
    String merk;
    String pemilik;
    String warna;

    // method konstruktor
    Mobil() {
        merk = "Unknown";
        pemilik = "John Doe";
        warna = "Black";
    }

    Mobil(String pemilik, String warna) {
        this.merk = "Daihatsu";
        this.pemilik = pemilik;
        this.warna = warna;
    }

    // method biasa
    void setMerk(String merkBaru) {
        merk = merkBaru;
    }

    void lihatMerk() {
        System.out.println("Merk Mobilku: " + merk);
    }

    void lihatWarna() {
        System.out.println("Warna mobil " + merk + ": " + warna);
    }

    void lihatNamaPemilik() {
        System.out.println("Nama pemilik: " + pemilik);
    }

    public static void main(String[] aa) {
        Mobil mobilFaris = new Mobil("Faris Faikar Razannafi", "Navy");
        mobilFaris.lihatMerk(); // Daihatsu
        mobilFaris.setMerk("Pagani");
        mobilFaris.lihatMerk(); // Pagani
        mobilFaris.lihatNamaPemilik(); // Pagani

        Mobil mobilSyadu = new Mobil("Syadu Budi Kusuma", "Maroon");
        mobilSyadu.lihatMerk(); // Daihatsu
        mobilSyadu.setMerk("Maserati");
        mobilSyadu.lihatMerk(); // Maserati

        Mobil mobilDefault = new Mobil();
        mobilDefault.lihatMerk(); // Daihatsu
        mobilDefault.setMerk("Mclaren");
        mobilDefault.lihatMerk(); // Maserati
        mobilDefault.lihatWarna();
    }
}
