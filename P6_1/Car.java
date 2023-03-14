public class Car extends MotorVehicle {
    private boolean seatbelt;

    public Car() {
        this.seatbelt = false;
    }

    public void setSeatBelt(boolean seatbelt) {
        this.seatbelt = seatbelt;
    }

    public boolean getSeatBelt() {
        return seatbelt;
    }

    public void printID(String id) {
        System.out.println("This car's ID is " + id);
    }
}
