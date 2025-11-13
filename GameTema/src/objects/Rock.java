package objects;

import game.GameObject;

public class Rock extends GameObject {
    public Rock(int x, int y) {
        super("Rock", x, y);
    }

    @Override
    public void update() {
        System.out.println(name + " does nothing.");
    }
}
