public class Tes {
    public static void main(String[] a) {
        Kaos k1 = new Kaos();
        k1.merk = "Nike";
        k1.setTulisanSablon("Just do it!");
        System.out.println(k1.getMerk());

        Kemeja k2 = new Kemeja();
        k2.setMerk("Polo");
        k2.setKancing(0);
        k2.setKancing(3);
        System.out.println(k2.getMerk());

        Kaos k3 = new Kaos(100);
        System.out.println(k3.getHarga());

    }
}
