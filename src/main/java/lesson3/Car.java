package lesson3;

import org.gb.lesson1.store3D.modeleElements.Color;

public abstract class  Car{

    private CarService carService;
    private CarWash carWash;

    private Refuling refueling;

    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    public void setCarWash(CarWash carWash) {
        this.carWash = carWash;
    }

    public void setRefuelingStation(Refuling refuelingStation) {
        this.refueling = refuelingStation;
    }



    /**
     * Заправить автомобиль
     */

    public void fuel(){
        if (refueling != null)
        {
            refueling.fuel(fuelType);
        }
    }

    /**
     * Обслуживание
     */
//    public void service(){
//        if (carService != null){
//            carService.service();
//        }
//    }

// region Methods
    public abstract void movement();
    public abstract void maintenance();
    public abstract boolean gearShifting();
    public abstract boolean swichHeadlighets();
    public abstract boolean switchWipers();
//    endregion

    //    region Constructor

    public Car(String make, String model, Color color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }


//    endregion

    //    region Field Car
    private String make;
    private String model;
    private Color color;
    protected CarType type;
    private int wheelsCount;
    protected FuelType fuelType = FuelType.Diesel;
    private GearBoxType gearBoxType;
    private double energyCapacity;
    private boolean fogLighits = false;

//    endregion
protected void setWheelsCount(int wheelsCount) {
    this.wheelsCount = wheelsCount;
}

public int getWheelsCount(){return wheelsCount;}
}
