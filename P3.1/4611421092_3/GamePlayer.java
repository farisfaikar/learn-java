public class GamePlayer {
    // property
    private double width;
    private double height;
    private int positionX;
    private int positionY;

    // constructor
    public GamePlayer() {
        width = 0;
        height = 0;
        positionX = 0;
        positionY = 0;
    }

    public GamePlayer(double width, double height) {
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
        System.out.println("Player is running");
    }

    public void Run(int incrementX) {
        positionX += incrementX;
        System.out.println("Player is running...current X position = " + positionX);
    }
}
