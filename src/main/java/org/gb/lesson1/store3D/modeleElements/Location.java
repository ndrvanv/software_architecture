package org.gb.lesson1.store3D.modeleElements;

import java.util.Collection;

public class Location {

    //    region Constructions

    public Location(Collection<Point3D> point3DS) {
        this.point3DS = point3DS;
    }

//    endregion

    //    region Properties

    public Collection<Point3D> getPoint3DS() {
        return point3DS;
    }

    public void setPoint3DS(Collection<Point3D> point3DS) {
        this.point3DS = point3DS;
    }

//    endregion

    //    region Privates Fields


    private Collection<Point3D> point3DS;
//    endregion


}
