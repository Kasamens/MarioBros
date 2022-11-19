package com.mosaic.mariobros.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mosaic.mariobros.MarioBros;
import com.mosaic.mariobros.Scenes.Hud;

public class PlayScreen implements Screen {

    private MarioBros game;
    private OrthographicCamera camera;
    private Viewport viewport;

    private Hud hud;

    Texture texture;
    public PlayScreen(MarioBros game) {
        this.game = game;
        texture = new Texture("badlogic.jpg");
        camera = new OrthographicCamera();
        viewport = new FitViewport(MarioBros.V_WIDTH,MarioBros.V_HEIGHT,camera);
        hud = new Hud(game.batch);
    }

    @Override
    public void show() {
        
    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(0,0,0,0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.stage.draw();

    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width,height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
