package creational.demo.builder.car.concrete;

import creational.demo.builder.car.CarType;
import creational.demo.builder.car.components.Engine;
import creational.demo.builder.car.components.GPS;
import creational.demo.builder.car.components.Transmission;
import creational.demo.builder.car.components.TripComputer;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPS gps;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPS gps) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;

        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }

        this.gps = gps;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPS getGps() {
        return gps;
    }
}