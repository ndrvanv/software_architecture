package org.gb.lesson1.store3D.modeleElements;

import java.util.Collection;

public class Scene {
    //    region Constructions


    public Scene(int id, Collection<PoligonalModel> models, Collection<Flash> flashes, Collection<Camera> cameras) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public Scene(Collection<PoligonalModel> models, Collection<Flash> flashes, Collection<Camera> cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public Scene(Collection<Flash> flashes, Collection<Camera> cameras) {
        this.flashes = flashes;
        this.cameras = cameras;
    }
//    endregion

    //    region Properties


    public int getId() {
        return id;
    }

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }
//    endregion

    //    region Private Fields
    private int id;
    private Collection<PoligonalModel> models;
    private Collection<Flash> flashes;
    private Collection<Camera> cameras;

// endregion

    //    region Methods

    public Scene method1(Scene scene){

        return scene;
    }

    public Scene method2(Scene scene){
        return scene;
    }

//    endregion
}
