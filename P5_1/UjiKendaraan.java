public class UjiKendaraan {
    public static void main(String[] args) {
        Bicycle sepedah = new Bicycle();
        sepedah.color = "Violet";
        sepedah.speed = 69.00;
        sepedah.ringBell();
        sepedah.turnLeft();
        sepedah.turnRight();
        sepedah.goStraight();
        System.out.println(sepedah.speed);
        System.out.println(sepedah.color);

        MotorVehicle mobil = new MotorVehicle();
        System.out.println(mobil.getSizeofEngine());
        System.out.println(mobil.getLicencePlate());

        MotorVehicle motor = new MotorVehicle(4, "E4T MYAR53");
        System.out.println(motor.getSizeofEngine());
        System.out.println(motor.getLicencePlate());

        Bicycle sepedah2 = new Bicycle(15.69, "Biru");
        sepedah2.turnLeft();
        sepedah2.turnRight();
        sepedah2.goStraight();
    }
}
