package creational.demo.builder.car;

import creational.demo.builder.car.builders.GenericCarBuilder;
import creational.demo.builder.car.components.Engine;
import creational.demo.builder.car.components.Transmission;

public class Assembler {

    // TODO: Implement a GPS/Trip Computer model based on their interface
    public void constructSportsCar(GenericCarBuilder genericCarBuilder) {
        genericCarBuilder.setCarType(CarType.SPORT_CAR);
        genericCarBuilder.setSeats(2);
        genericCarBuilder.setEngine(new Engine(3.0, 0));
        genericCarBuilder.setTransmission(Transmission.SEMI_AUTOMATIC);
        //genericCarBuilder.setTripComputer(new TripComputer());
        //genericCarBuilder.setGps(new GPS());
    }

    public void constructCityCar(GenericCarBuilder genericCarBuilder) {
        genericCarBuilder.setCarType(CarType.POPULAR_CAR);
        genericCarBuilder.setSeats(2);
        genericCarBuilder.setEngine(new Engine(1.2, 0));
        genericCarBuilder.setTransmission(Transmission.AUTOMATIC);
        //genericCarBuilder.setTripComputer(new TripComputer());
        //genericCarBuilder.setGps(new GPS());
    }

    public void constructSUV(GenericCarBuilder genericCarBuilder) {
        genericCarBuilder.setCarType(CarType.SUV);
        genericCarBuilder.setSeats(4);
        genericCarBuilder.setEngine(new Engine(2.5, 0));
        //genericCarBuilder.setTransmission(Transmission.MANUAL);
        //genericCarBuilder.setGps(new GPS());
    }
}

