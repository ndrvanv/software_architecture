package org.gb.lesson1.store3D.modeleElements;

import java.util.Collection;

public class Flash {

    //    region Construction
    public Flash(Collection<Point3D> point3DS, Collection<Angle3D> angle3DS, Collection<Color> colors, Collection<Power> powers) {
        this.point3DS = point3DS;
        this.angle3DS = angle3DS;
        this.colors = colors;
        this.powers = powers;
    }

    public Flash(Collection<Point3D> point3DS, Collection<Color> colors, Collection<Power> powers) {
        this.point3DS = point3DS;
        this.colors = colors;
        this.powers = powers;
    }
//    endregion

    //    region Properties

    public Collection<Point3D> getPoint3DS() {
        return point3DS;
    }

    public Collection<Angle3D> getAngle3DS() {
        return angle3DS;
    }

    public Collection<Color> getColors() {
        return colors;
    }

    public Collection<Power> getPowers() {
        return powers;
    }
//    endregion

    //    region Private Field
    private Collection<Point3D> point3DS;
    private Collection<Angle3D> angle3DS;
    private Collection<Color> colors;
    private Collection<Power> powers;
//  endregion

    //    region Methods
    private void rotate3d(Angle3D a) {

    }
    private void move(Point3D p) {

    }
//    endregion
}
