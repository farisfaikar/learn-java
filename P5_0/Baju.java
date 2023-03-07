public class Baju {
    protected String merk;
    protected int harga;

    public Baju() {
        merk = "N/A";
    }

    public Baju(int harga) {
        this.harga = harga;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }
}
