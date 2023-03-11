package creational.demo.builder.car.builders;

import creational.demo.builder.car.CarType;
import creational.demo.builder.car.components.Engine;
import creational.demo.builder.car.components.GPS;
import creational.demo.builder.car.components.Transmission;
import creational.demo.builder.car.components.TripComputer;
import creational.demo.builder.car.concrete.Car;

public class CarBuilder implements GenericCarBuilder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPS gps;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGps(GPS gps) {
        this.gps = gps;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gps);
    }
}