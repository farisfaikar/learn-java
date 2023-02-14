public class UjiKucing {
    public static void main(String[] aa) {
        // latihan1();
        latihan2();
    }

    static void latihan1() {
        Kucing muffin = new Kucing();
        muffin.printRas();

        Kucing pierre = new Kucing("Chartreux");
        pierre.printRas();
    }

    static void latihan2() {
        System.out.println("==== Kucing #1 ====");
        Kucing hazel = new Kucing();
        System.out.println(hazel.getRas()); // N/A
        hazel.setRas("Turkish Angora");
        System.out.println(hazel.getRas()); // Turkish Angora

        System.out.println("==== Kucing #2 ====");
        Kucing ragdoll = new Kucing();
        System.out.println(ragdoll.getRas()); // N/A
        ragdoll.setRas("Ragmuffin");
        System.out.println(ragdoll.getRas()); // Ragmuffin
    }
}
