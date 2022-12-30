package car.impl;

import car.Car;

import java.awt.*;

public class BMW extends Car {

    public BMW(Color color) {
        super(color);
    }

    @Override
    public void drive() {
        System.out.println("I am driving BMW");
    }
}
