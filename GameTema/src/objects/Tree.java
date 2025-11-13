package objects;

import game.GameObject;

public class Tree extends GameObject {
    public Tree(int x, int y) {
        super("Tree", x, y);
    }

    @Override
    public void update() {
        System.out.println(name + " stands still.");
    }
}
