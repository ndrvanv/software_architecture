package org.gb.lesson1.store3D.inmemorymodele;

import org.gb.lesson1.store3D.modeleElements.Camera;
import org.gb.lesson1.store3D.modeleElements.Flash;
import org.gb.lesson1.store3D.modeleElements.PoligonalModel;
import org.gb.lesson1.store3D.modeleElements.Scene;

import java.util.ArrayList;
import java.util.Collection;

public class

ModelStore implements ModelChangeObserver, ModelChanger{

//    region private Fields
    private Collection<PoligonalModel> models;
    private Collection<Scene> scenes;
    private Collection<Flash> flashes;
    private Collection<Camera> cameras;
    private Collection<ModelChangeObserver> changeObservers = new ArrayList<>();
//    endregion

//    region Properties

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public void setModels(Collection<PoligonalModel> models) {
        this.models = models;
    }

    public Collection<Scene> getScenes() {
        return scenes;
    }

    public void setScenes(Collection<Scene> scenes) {
        this.scenes = scenes;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public void setFlashes(Collection<Flash> flashes) {
        this.flashes = flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(Collection<Camera> cameras) {
        this.cameras = cameras;
    }

    public Collection<ModelChangeObserver> getChangeObservers() {
        return changeObservers;
    }

    public void setChangeObservers(Collection<ModelChangeObserver> changeObservers) {
        this.changeObservers = changeObservers;
    }


//    endregion\

//    region Constructions
    public ModelStore(){}

//    endregion

//    region Methods
@Override
public void applyUpdateModel() {

}
    /**
     * Нотифицирует события
     */

    @Override
    public void notifyChange() {
        for (ModelChangeObserver observer: changeObservers ) {
            observer.applyUpdateModel();
        }

    }

    @Override
    public void registerModelChanger(ModelChangeObserver o) {
        changeObservers.add(o);
    }

    @Override
    public void removeModelChanger(ModelChangeObserver o) {
        changeObservers.remove(o);
    }

    public int getScene(int scene){
        return scene;
    }




//    endregion



}
