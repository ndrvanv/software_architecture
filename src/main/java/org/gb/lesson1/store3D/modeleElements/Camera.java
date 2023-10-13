package org.gb.lesson1.store3D.modeleElements;

import java.util.Collection;

public class Camera {
    //    region Constructions
    public Camera(Collection<Location> location, Collection<Angle3D> angle3D) {
        this.location = location;
        this.angle3D = angle3D;
    }

    public Camera(Collection<Location> location) {
        this.location = location;
    }
//    endregion

    //    region Properties

    public Collection<Location> getLocation() {
        return location;
    }

    public Collection<Angle3D> getAngle3D() {
        return angle3D;
    }
    //    endregion

    //    region Private Fields
    private Collection<Location> location;
    private Collection <Angle3D> angle3D;
// endregion

    //    region Methods

    public void rotate(Angle3D a){

    }
    public void point3D(Point3D p){

    }
//    endregion

}
