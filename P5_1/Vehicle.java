public class Vehicle {
    public double speed;
    public String color;

    public Vehicle() {
        speed = 0.0;
        color = "orange";
    }

    // Tidak ada di modul
    public Vehicle(double speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public void goStraight() {
        System.out.println("Maju..");
    }

    public void turnLeft() {
        System.out.println("Belok Kiri");
    }

    public void turnRight() {
        System.out.println("Belok Kanan");
    }
}
