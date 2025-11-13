package patterns.strategy;

import game.GameObject;
import java.util.List;

public class FancyRenderStrategy implements RenderStrategy {

    @Override
    public void render(List<GameObject> objects) {
        System.out.println("✨ Fancy Rendering ✨");
        for (GameObject obj : objects) {
            System.out.println("🎮 " + obj.getName() + " → position " + obj.getPosition());
        }
        System.out.println("🎬 Scene rendered with fancy effects!");
    }
}
