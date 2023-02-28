// Nama: Faris Faikar Razannafi
// NIM: 4611421092

import java.util.ArrayList;

public class GameEnvironment {
    // properties
    private double width;
    private double height;
    ArrayList<GamePlayer> arrPlayer;
    ArrayList<GameEnemy> arrEnemy;

    // constructors
    GameEnvironment() {
        width = 0;
        height = 0;
        arrPlayer = new ArrayList<GamePlayer>();
        arrEnemy = new ArrayList<GameEnemy>();
    }

    GameEnvironment(double width, double height) {
        this.width = width;
        this.height = height;
        this.arrPlayer = new ArrayList<GamePlayer>();
        this.arrEnemy = new ArrayList<GameEnemy>();
    }

    // methods
    public void addPlayer(GamePlayer player) {
        arrPlayer.add(player);
    }

    public void removePlayer(GamePlayer player) {
        arrPlayer.remove(player);
    }

    public void getAllPlayers() {
        System.out.println("All of Players: " + arrPlayer);
    }

    public void addEnemy(GameEnemy enemy) {
        arrEnemy.add(enemy);
    }

    public void removeEnemy(GameEnemy enemy) {
        arrEnemy.remove(enemy);
    }

    public void getAllEnemies() {
        System.out.println("All of Enemies: " + arrEnemy);

    }

    public void Interaction() {
        if (arrPlayer == null || arrEnemy == null) {
            System.out.println("Player or enemy not sets");
        }

        for (int i = 0; i < arrPlayer.size(); i++) {
            for (int j = 0; j < arrEnemy.size(); i++) {
                int playerY = arrPlayer.get(i).getY();
                int enemyY = arrEnemy.get(j).getY();
                if (playerY != enemyY) {
                    System.out.println("Player: " + arrPlayer.get(i) + " and Enemy: " + arrEnemy.get(j)
                            + " not in the same Y position");
                }
                int playerX = arrPlayer.get(i).getX();
                int enemyX = arrEnemy.get(j).getX();
                if (EuclideanDistance(playerX, playerY, enemyX, enemyY) < 2) {
                    System.out.println("Player: " + arrPlayer.get(i) + " Attacked");
                    System.out.println("Enemy: " + arrEnemy.get(j) + " loses");
                    removeEnemy(arrEnemy.get(j));
                } else {
                    System.out.println("==> Player " + arrPlayer.get(i));
                    arrPlayer.get(i).Run((int) Math.ceil(Math.random() * 10));
                    System.out.println("current x position = " + arrPlayer.get(i).getX() + " <==");
                }
            }
        }
    }

    public int EuclideanDistance(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return Math.round((float) distance);
    }
}