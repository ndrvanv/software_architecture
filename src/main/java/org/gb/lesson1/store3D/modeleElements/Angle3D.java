package org.gb.lesson1.store3D.modeleElements;

public class Angle3D {

    //    region Construction
    public Angle3D(int degree) {
        this.degree = degree;
    }

    public Angle3D(){}
//    endregion

    // region Properties
    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }
    // endregion

    //    region Private Fields
    private int degree;
// endregion

}
