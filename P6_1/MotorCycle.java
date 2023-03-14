public class MotorCycle extends MotorVehicle {
    private int numGear;

    public MotorCycle() {
        this.numGear = 0;
    }

    public void setGearFoot(int numGear) {
        this.numGear = numGear;
    }

    public int getGearFoot() {
        return numGear;
    }

    public void printID(String id) {
        System.out.println("This motorcycle's ID is " + id);
    }
}
