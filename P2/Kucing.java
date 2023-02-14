public class Kucing {
    // property
    private String ras;

    // konstruktor
    Kucing() {
        this.ras = "N/A";
    }

    Kucing(String ras) {
        this.ras = ras;
    }

    void setRas(String ras) {
        this.ras = ras;
    }

    String getRas() {
        return ras;
    }

    // method
    void printRas() {
        System.out.println(ras);
    }
}
