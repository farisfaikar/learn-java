import java.util.ArrayList;

public class PetShop {
    ArrayList<Kucing> listKocheng;
    ArrayList<Adopter> listAdopter;

    PetShop() {
        listKocheng = new ArrayList<Kucing>();
        listAdopter = new ArrayList<Adopter>();
    }

    public void addKocheng(Kucing kocheng) {
        listKocheng.add(kocheng);
    }

    public void addAdopter(Adopter adopter) {
        listAdopter.add(adopter);
    }

    public void getAllKucing() {
        for (Kucing k : listKocheng) {
            System.out.println(k.getRas());
        }
    }

    public void getAllAdopter() {
        for (Adopter a : listAdopter) {
            System.out.println(a.getNama());
        }
    }

    public void adopsi(Adopter adopter, String rasKocheng) {
        boolean ketemu = false;
        for (Kucing k : listKocheng) {
            if (k.getRas() == rasKocheng) {
                ketemu = true;
                break;
            }
        }

        if (ketemu) {
            System.out.println("Mas/Mbak " + adopter + " telah menemukan kucing yang diinginkan");
        } else {
            System.out.println("Mbak/Mas " + adopter + " gagal menemukan kucing yang diinginkan");
        }
    }
}
