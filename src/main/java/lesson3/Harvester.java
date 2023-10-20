package lesson3;

import org.gb.lesson1.store3D.modeleElements.Color;

public class Harvester extends Car{

    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(6);
    }

    public void sweeping(){
        System.out.println("Автомобиль метает улицу");
    }

    private boolean fogLights = false;
    public boolean switchFogLights(){
        fogLights = !fogLights;
        return fogLights;
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
