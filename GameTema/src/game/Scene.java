package game;

import java.util.ArrayList;
import java.util.List;
import patterns.strategy.RenderStrategy;

public class Scene {
    private List<GameObject> objects;
    private RenderStrategy renderStrategy;

    public Scene(RenderStrategy renderStrategy) {
        this.objects = new ArrayList<>();
        this.renderStrategy = renderStrategy;
    }

    public void addObject(GameObject obj) {
        objects.add(obj);
    }

    public void removeObject(GameObject obj) {
        objects.remove(obj);
    }

    public void update() {
        for (GameObject obj : objects) {
            obj.update();
        }
    }

    public void render() {
        renderStrategy.render(objects);
    }

    public void setRenderStrategy(RenderStrategy renderStrategy) {
        this.renderStrategy = renderStrategy;
    }
}
