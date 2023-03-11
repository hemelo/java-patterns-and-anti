package creational.demo.builder.car.builders;

import creational.demo.builder.car.CarType;
import creational.demo.builder.car.components.Engine;
import creational.demo.builder.car.components.GPS;
import creational.demo.builder.car.components.Transmission;
import creational.demo.builder.car.components.TripComputer;

public interface GenericCarBuilder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGps(GPS gps);
}
