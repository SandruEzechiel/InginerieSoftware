package game;

import utils.Position;

public abstract class GameObject {
    protected String name;
    protected Position position;

    public GameObject(String name, int x, int y) {
        this.name = name;
        this.position = new Position(x, y);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public abstract void update();
}
