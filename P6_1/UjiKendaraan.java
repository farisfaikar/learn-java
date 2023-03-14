public class UjiKendaraan {
    public static void main(String[] args) {
        Car car = new Car();
        MotorCycle motorcycle = new MotorCycle();
        Bicycle bicycle = new Bicycle();
        Vehicle vehicle = new Vehicle();
        
        // Dynamic Binding
        KendaraanMelaju(car);
        KendaraanMelaju(motorcycle);
        KendaraanMelaju(bicycle);
        KendaraanMelaju(vehicle);

        // Test methods
        car.setSeatBelt(true);
        System.out.println(car.getSeatBelt());
        motorcycle.setGearFoot(6);
        System.out.println(motorcycle.getGearFoot());
        
        // === Tidak ada di Modul ===
        // Parent Method
        vehicle.printID("5 UCK MUHD 1CK");
        // Overriding
        car.printID("K1 55 MY4R53");
        motorcycle.printID("5PR34D Y0 URCHK3 3K5");
        // Overloading
        bicycle.printID(698008);
    }

    static void KendaraanMelaju(Vehicle vehicle) {
        System.out.println("Kendaraan berwarna " + vehicle.color + " bergerak:");  // Tidak ada di modul
        vehicle.goStraight();
    }
}
