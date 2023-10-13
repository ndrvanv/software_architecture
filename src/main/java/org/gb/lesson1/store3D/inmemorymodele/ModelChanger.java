package org.gb.lesson1.store3D.inmemorymodele;

public interface ModelChanger {
    void notifyChange();
    void registerModelChanger(ModelChangeObserver o);
    void removeModelChanger(ModelChangeObserver o);
}
