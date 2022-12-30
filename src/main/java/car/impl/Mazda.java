package car.impl;

import car.Car;

import java.awt.*;

public class Mazda extends Car {

    public Mazda(Color color) {
        super(color);
    }

    @Override
    public void drive() {
        System.out.println("I am driving Mazda");
    }
}
