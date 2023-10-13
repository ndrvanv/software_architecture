package org.gb.lesson1.store3D.modeleElements;

import java.util.Collection;

public class Poligon {

//    region Private Fields


    private Collection<Point3D> points;
//    endregion

//    region Properties

    public Collection<Point3D> getPoints() {
        return points;
    }
    public void setPoints(Collection<Point3D> points) {
        this.points = points;
    }
//    endregion

//    region Collections



    public Poligon(Collection<Point3D> points) {
        this.points = points;
    }

    public Poligon(){}
//    endregion
}
