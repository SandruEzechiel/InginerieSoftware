package patterns.singleton;

import game.Scene;

public class SceneManager {
    private static SceneManager instance;
    private Scene currentScene;

    private SceneManager() {
        // private constructor (Singleton)
    }

    public static SceneManager getInstance() {
        if (instance == null) {
            instance = new SceneManager();
        }
        return instance;
    }

    public Scene getCurrentScene() {
        return currentScene;
    }

    public void setCurrentScene(Scene scene) {
        this.currentScene = scene;
    }
}
