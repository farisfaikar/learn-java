public class UjiKendaraan {
    public static void main(String[] args) {
        System.out.println("=== Test Sepedah #1 ===");
        Bicycle sepedah = new Bicycle();
        sepedah.color = "Violet";
        sepedah.speed = 69.00;
        sepedah.ringBell();
        sepedah.turnLeft();
        sepedah.turnRight();
        sepedah.goStraight();
        System.out.println(sepedah.speed);
        System.out.println(sepedah.color);
        
        System.out.println("=== Test Mobil ===");
        MotorVehicle mobil = new MotorVehicle();
        System.out.println(mobil.getSizeofEngine());
        System.out.println(mobil.getLicencePlate());
        System.out.println(mobil.speed);
        System.out.println(mobil.color);
        
        System.out.println("=== Test Motor ===");
        MotorVehicle motor = new MotorVehicle(4, "E4T MYAR53");
        System.out.println(motor.getSizeofEngine());
        System.out.println(motor.getLicencePlate());
        System.out.println("Motor Speed: " + motor.speed);
        

        System.out.println("=== Test Sepedah #2 ===");
        Bicycle sepedah2 = new Bicycle(15.69, "Biru");  // Tidak ada di modul
        sepedah2.turnLeft();
        sepedah2.turnRight();
        sepedah2.goStraight();
        
        System.out.println("=== Test Sepedah #3 ===");
        Bicycle sepedah3 = new Bicycle();
        System.out.println(sepedah3.speed);
        System.out.println(sepedah3.color);
    }
}
