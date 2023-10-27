package lesson5;

import java.util.ArrayList;
import java.util.Collection;

public class Texture{

    private static int counter = 50000;
    private int id;
    {
        id = ++counter;
    }
    private Collection <Texture> textures = new ArrayList<>();
    public void addTexture(Texture texture) {
        textures.add(texture);
        System.out.println("Текстура добавлена");
    }

    public void removeTexture(Texture texture) {
        textures.remove(texture);
        System.out.println("Текстура удалена");
    }

    @Override
    public String toString() {
        return String.format("Texture #%s", id);
    }


}
