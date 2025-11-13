package patterns.factory;

import game.GameObject;
import objects.Player;
import objects.Enemy;
import objects.Tree;
import objects.Rock;

public class GameObjectFactory {

    // Factory Method - creează obiecte în funcție de tip
    public static GameObject createObject(ObjectType type, int x, int y) {
        switch (type) {
            case PLAYER:
                return new Player(x, y);
            case ENEMY:
                return new Enemy(x, y);
            case TREE:
                return new Tree(x, y);
            case ROCK:
                return new Rock(x, y);
            default:
                throw new IllegalArgumentException("Unknown object type: " + type);
        }
    }
}
