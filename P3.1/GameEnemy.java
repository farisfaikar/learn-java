public class GameEnemy {
    // property
    private double width;
    private double height;
    private int positionX;
    private int positionY;

    // constructor
    public GameEnemy() {
        width = 0;
        height = 0;
        positionX = 0;
        positionY = 0;
    }

    public GameEnemy(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // methods
    public void setDimension(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public int getX() {
        return positionX;
    }

    public int getY() {
        return positionY;
    }

    public void Run() {
        System.out.println("Enemy is running");
    }
}
