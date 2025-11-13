package patterns.strategy;

import game.GameObject;
import java.util.List;

public interface RenderStrategy {
    void render(List<GameObject> objects);
}
