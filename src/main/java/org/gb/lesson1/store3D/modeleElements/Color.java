package org.gb.lesson1.store3D.modeleElements;

public class Color {

//    region Construction
    public Color(String color) {
        this.color = color;
    }
//    endregion

    //    region Properties
    public int getId() {
        return id;
    }
    public String getColor() {
        return color;
    }
//    endregion

//    region Private Fields
    private int id;
    private String color;

//    endregion

}
