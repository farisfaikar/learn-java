import java.util.ArrayList;

public class Kelurahan {
    Kelurahan() {

    }

    // polymorphic method
    public void pendaftaran(Warga mawar) {
        if (mawar.getNama() != "N/A") {
            System.out.println(mawar.getNama() + " mendaftar");
        } else {
            System.out.println("pendaftaran gagal");
        }
    }

    public static <E> void printSemuaWarga(ArrayList<E> listWarga) {
        // Display array elements
        for (E warga : listWarga) {
            System.out.println(warga);
        }
    }
}
