package patterns.strategy;
import game.GameObject;
import java.util.List;

public class SimpleRenderStrategy implements RenderStrategy {
    @Override
    public void render(List<GameObject> objects) {
        System.out.println("Rendering scene (simple):");
        for (GameObject obj : objects) {
            System.out.println("- " + obj.getName() + " at " + obj.getPosition());
        }
    }
}

