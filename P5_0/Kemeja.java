public class Kemeja extends Baju {
    int kancing;

    Kemeja() {
        kancing = 5;
    }

    void setKancing(int kancing) {
        if (kancing > 0)
            this.kancing = kancing;
        else
            System.out.println("What are you, a fucking idiot or something?");
    }

    int getKancing() {
        return kancing;
    }
}
