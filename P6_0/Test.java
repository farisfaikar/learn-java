import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Warga w1 = new Warga();
        // w1.setNama("Dante");
        System.out.println(w1.getNama());
        w1.printBeratBadan(140);
        
        WargaRT w2 = new WargaRT();
        w2.setNama("Michelle");
        System.out.println(w2.getNama());
        w2.printBeratBadan(40);
        
        WargaRW w3 = new WargaRW();
        w3.setNama("Xavier");
        System.out.println(w3.getNama());
        w3.printBeratBadan(69);

        System.out.println("=== Kelurahan ===");
        Kelurahan patemon = new Kelurahan();
        patemon.pendaftaran(w1);
        patemon.pendaftaran(w2);
        patemon.pendaftaran(w3);

        ArrayList<Warga> listWarga = new ArrayList<Warga>();
        listWarga.add(w1);
        listWarga.add(w2);
        listWarga.add(w3);
        Kelurahan.printSemuaWarga(listWarga);
    }
}
