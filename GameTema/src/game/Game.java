package game;

import patterns.singleton.SceneManager;
import patterns.strategy.SimpleRenderStrategy;
import patterns.strategy.FancyRenderStrategy;
import patterns.factory.GameObjectFactory;
import patterns.factory.ObjectType;

public class Game {

    public void start() {
        System.out.println("Starting game...");

        // create scene
        Scene scene = new Scene(new SimpleRenderStrategy());
        SceneManager.getInstance().setCurrentScene(scene);

        // add some objects
        scene.addObject(GameObjectFactory.createObject(ObjectType.PLAYER, 1, 1));
        scene.addObject(GameObjectFactory.createObject(ObjectType.ENEMY, 5, 2));
        scene.addObject(GameObjectFactory.createObject(ObjectType.TREE, 2, 4));
        scene.addObject(GameObjectFactory.createObject(ObjectType.ROCK, 3, 3));

        // render scene (simple)
        scene.render();

        // switch to fancy rendering
        System.out.println("\nSwitching to fancy rendering...\n");
        scene.setRenderStrategy(new FancyRenderStrategy());
        scene.render();
    }
}
