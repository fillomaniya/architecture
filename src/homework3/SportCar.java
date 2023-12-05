package homework3;

import java.awt.Color;

/**
 * Класс трицикла спорткара
 */
public class SportCar extends Car implements Fueling, Wiping {

    public SportCar(String make, String model, Color color, FuelType fuelType) {
        super(make, model, color, fuelType);
        setWheelsCount(3);
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

    private Refueling refueling;
    private Wiping wiping;
}
