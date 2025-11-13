package game;

import patterns.strategy.RenderStrategy;
import patterns.strategy.SimpleRenderStrategy;

public class Renderer {
    private RenderStrategy strategy;

    public Renderer() {
        this.strategy = new SimpleRenderStrategy();
    }

    public void setStrategy(RenderStrategy strategy) {
        this.strategy = strategy;
    }

    public RenderStrategy getStrategy() {
        return strategy;
    }
}

