// Nama: Faris Faikar Razannafi
// NIM: 4611421092
// PBO: Kelompok 1

public class TestGame {
    // ===== DRIVER CODE =====
    public static void main(String[] args) {
        GamePlayer p1 = new GamePlayer();
        GamePlayer p2 = new GamePlayer(10, 20);
        GamePlayer p3 = new GamePlayer(30, 40, 50, 60);

        System.out.println("=== Player 1 ===");
        testGamePlayer(p1, 1, 2, 3, 4, 5);
        System.out.println("=== Player 2 ===");
        testGamePlayer(p2, 6, 7, 8, 9, 10);
        System.out.println("=== Player 3 ===");
        testGamePlayer(p3, 11, 12, 13, 14, 15);

        GameEnemy e1 = new GameEnemy();
        GameEnemy e2 = new GameEnemy(30, 40);
        GameEnemy e3 = new GameEnemy(30, 40, 50, 60);

        System.out.println("=== Enemy 1 ===");
        testGameEnemy(e1, 11, 22, 33, 44);
        System.out.println("=== Enemy 2 ===");
        testGameEnemy(e2, 55, 66, 77, 88);
        System.out.println("=== Enemy 3 ===");
        testGameEnemy(e3, 99, 11, 22, 33);
    }

    // static methods
    static void testGamePlayer(GamePlayer player, double width, double height, int positionX, int positionY,
            int incrementX) {
        // Testing GamePlayer class
        player.setDimension(width, height);
        player.setPosition(positionX, positionY);
        System.out.println("Player width is: " + player.getWidth());
        System.out.println("Player height is: " + player.getHeight());
        System.out.println("Player position X is: " + player.getX());
        System.out.println("Player position Y is: " + player.getY());
        player.Run();
        player.Run(incrementX);
        player.Run(incrementX);
    }

    static void testGameEnemy(GameEnemy enemy, double width, double height, int positionX, int positionY) {
        // Testing GameEnemy class
        enemy.setDimension(width, height);
        enemy.setPosition(positionX, positionY);
        System.out.println("Enemy width is: " + enemy.getWidth());
        System.out.println("Enemy height is: " + enemy.getHeight());
        System.out.println("Enemy position X is: " + enemy.getX());
        System.out.println("Enemy position Y is: " + enemy.getY());
        enemy.Run();
    }
}
