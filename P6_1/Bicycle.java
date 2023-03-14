public class Bicycle extends Vehicle {
    public Bicycle() {
        super.speed = 10.0; // Tidak ada di modul
        super.color = "biru"; // Tidak ada di modul
    }

    // Tidak ada di modul
    public Bicycle(double speed, String color) {
        super(speed, color); 
    }

    public void ringBell() {
        System.out.println("kring..kring..");
    }

    public void printID(int id) {
        System.out.println("This bicycle's ID is: " + id);
    }
}
