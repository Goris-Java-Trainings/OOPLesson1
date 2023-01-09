package car;

import java.awt.*;

public abstract class Car {

    private Color color;

    public Car(){}

    public Car(Color color) {
        this.color = color;
    }

    public void stop() {
        //
        //
        //
        //
    }

    public void work() {
        System.out.println("I am working");
    }

    public abstract void drive();
}
