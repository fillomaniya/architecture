package homework3;

public class RefuelingStation implements Refueling {
    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType) {
            case Diesel -> System.out.println("Автомобиль заправили дизельным топливом");
            case Gasoline -> System.out.println("Автомобиль заправили бензином");
        }
    }
}
