package lesson5;

import java.util.ArrayList;
import java.util.Collection;

public class Model3D{

    private static int counter = 10000;
    private int id;
    private Collection<Texture> textures = new ArrayList<>();
    public Model3D model3D;
    public Collection<Model3D> model3DS = new ArrayList<>();

    public Collection<Texture> getTextures() {
        if (textures == null){
            textures = new ArrayList<>();
        }
        return textures;
    }

    {
        id = ++counter;
    }

    public void addModel(Model3D model) {
        model3DS.add(model);
        System.out.println("Модель добавлена");
    }

    public void removeModel(Model3D model) {
        model3DS.remove(model);
        System.out.println("Модель удалена");
    }

    @Override
    public String toString() {
        return String.format("3DModel #%s", id);
    }

}
