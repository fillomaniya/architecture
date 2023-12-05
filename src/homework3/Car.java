package homework3;

import java.awt.Color;

/**
 * Класс автомобиль
 */
public abstract class Car {

    public Car(String make, String model, Color color, FuelType fuelType) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
    }

    /** Метод отвечающий за движение автомобиля */
    public abstract void movement();

    /** Метод отвечающий за обслуживание автомобиля */
    public abstract void maintenance();

    /** Метод отвечающий за переключение коробки передач */
    public abstract boolean gearShifting();

    /** Метод отвечающий за включение фар */
    public abstract boolean switchHeadLights();

    /** Метод отвечающий за включение дворников */
    public abstract boolean swithWipers();

    /** Переключение противотуманных фар включено/выключено */
    public boolean switchFogLights() {
        fogLights = !fogLights;
        return fogLights;
    }

    protected void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

// Марка Aвтомобиля
    private String make;
// Модель автомобиля
    private String model;
// Цвет кузова
    private Color color;
// Тип кузова
    private CarType carType;
// Число колес
    private int wheelsCount;
// Тип топлива
    protected FuelType fuelType;
// Тип коробки передач
    private GearboxType gearboxType;
// Объем двигателя
    private double engineCapacity;
// Состояние противотуманных фар
    private boolean fogLights = false;
}
