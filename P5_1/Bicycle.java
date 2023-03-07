public class Bicycle extends Vehicle {
    public Bicycle() {
    }

    public Bicycle(double speed, String color) {
        super(speed, color);
    }

    public void ringBell() {
        System.out.println("kring..kring..");
    }
}
