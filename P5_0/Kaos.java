public class Kaos extends Baju{
    String tulisanSablon;

    Kaos() {
        tulisanSablon = "Sablon";
    }

    Kaos(int harga) {
        super(harga);
    }

    void setTulisanSablon(String tulisanSablon) {
        this.tulisanSablon = tulisanSablon;
    }

    String getTulisanSablon() {
        return tulisanSablon;
    }
}
