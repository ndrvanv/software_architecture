package org.gb.lesson1.store3D.modeleElements;

public class Texture {

//    region Constructions
    public Texture(String name) {
        this.name = name;
    }
//    endregion

//    region Properties
public int getId() {
    return id;
}

    public String getName() {
        return name;
    }
    //    endregion

//    region Private Fields
    private int id;
    private String name;
//    endregion


}
