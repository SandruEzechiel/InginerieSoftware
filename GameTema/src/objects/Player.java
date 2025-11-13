package objects;
import game.GameObject;

public class Player extends GameObject {
    public Player(int x, int y) {
        super("Player", x, y);
    }
    @Override
    public void update() {
        System.out.println(name + " is moving...");
    }
}

