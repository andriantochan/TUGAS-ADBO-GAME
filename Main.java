package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.light.AmbientLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;
import com.jme3.terrain.Terrain;
import com.jme3.terrain.geomipmap.TerrainQuad;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 *
 * @author normenhansen
 */
public class Main extends SimpleApplication {

    private Spatial bird, bird2;

    private Spatial dessert;

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        flyCam.setMoveSpeed(50);
        dessert = assetManager.loadModel("Scenes/Dessert.j3o");
        dessert.setLocalScale(2f);
        
        rootNode.attachChild(dessert);

        bird = assetManager.loadModel("Models/Rham-Phorynchus/Rham-Phorynchus.j3o");
        rootNode.attachChild(bird);
        bird.setLocalTranslation(0, 10, 0);
        bird2 = assetManager.loadModel("Models/Rham-Phorynchus/Rham-Phorynchus.j3o");
        rootNode.attachChild(bird2);
        bird2.setLocalTranslation(10, 10, 100);
        /**
         * A white ambient light source.
         */
        AmbientLight ambient = new AmbientLight();
        ambient.setColor(ColorRGBA.White);
        rootNode.addLight(ambient);
    }

    @Override
    public void simpleUpdate(float tpf) {
        bird.move(0, 0, 0.01f);
        bird2.move(0,0,0.01f);
    }

    @Override
    public void simpleRender(RenderManager rm) {
        
    }
}
