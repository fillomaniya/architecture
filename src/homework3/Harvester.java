package homework3;

import java.awt.Color;

/**
 * Класс уборочная машина
 */
public class Harvester extends Car implements Fueling, Wiping {

    public Harvester(String make, String model, Color color, FuelType fuelType) {
        super(make, model, color, fuelType);
        setWheelsCount(6);
    }

    public void setRefuelingStation(RefuelingStation refuelingStation) {
        this.refueling = refuelingStation;
    }

    public void setWiping(Wiping wiping) {
        this.wiping = wiping;
    }

    @Override
    public void fuel() {
        if (refueling != null) {
            refueling.fuel(fuelType);
        }
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
    public boolean switchHeadLights() {
        return false;
    }

    @Override
    public boolean swithWipers() {
        return false;
    }

    /** Метод отвечающий за функцию автомобиля подметать улицу */
    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }

    @Override
    public void wipMirrors() {
        wiping.wipMirrors();
    }

    @Override
    public void wipWindshield() {
        wiping.wipWindshield();
    }

    @Override
    public void wipHeadLights() {
        wiping.wipHeadLights();
    }

    private Refueling refueling;
    private Wiping wiping;
}
