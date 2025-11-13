package objects;
import game.GameObject;

public class Enemy extends GameObject {
    public Enemy(int x, int y) {
        super("Enemy", x, y);
    }
    @Override
    public void update() {
        System.out.println(name + " is attacking!");
    }
}

