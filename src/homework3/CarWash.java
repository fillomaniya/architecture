package homework3;

/**
 * Класс описывает мойку автомобиля
 */
public class CarWash implements Wiping {

    @Override
    public void wipMirrors() {
        System.out.println("Автомобилю протёрли зеркала");
    }

    @Override
    public void wipWindshield() {
        System.out.println("Автомобилю протёрли стекла");
    }

    @Override
    public void wipHeadLights() {
        System.out.println("Автомобилю протёрли фары");
    }

}
