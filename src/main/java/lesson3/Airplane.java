package lesson3;

import org.gb.lesson1.store3D.modeleElements.Color;

public class Airplane extends Car{
    public Airplane(String make, String model, Color color) {
        super(make, model, color);
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean swichHeadlighets() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

}
