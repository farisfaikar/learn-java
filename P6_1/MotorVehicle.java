public class MotorVehicle extends Vehicle {
    public int sizeofEngine;
    public String licencePlate;

    public MotorVehicle() {
        super.speed = 42.0; // Tidak ada di modul
        super.color = "cyan"; // Tidak ada di modul
        sizeofEngine = 1;
        licencePlate = "H 1 IDN";
    }

    public MotorVehicle(int sizeofEngine, String lcPlate) {
        this.sizeofEngine = sizeofEngine;
        this.licencePlate = lcPlate;
    }

    public int getSizeofEngine() {
        return sizeofEngine;
    }

    public String getLicencePlate() {
        return licencePlate;
    }
}