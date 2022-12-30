package org.example;

import car.Car;
import car.impl.BMW;
import enums.Currency;
import human.Doctor;
import human.Human;
import human.Programmer;
import human.Worker;
import interfaces.Singable;

import java.awt.*;

public class Main {

    // static method
    public static void main(String[] args) {
        /*// instantiate of a new Human
//        Human humanInstance = new Human(-665, "bhfrbejhfbne"); // constructor

//        humanInstance.printAge();
//        humanInstance.setFirstName("bhcjrh$e");

//        Human anotherHuman = new Human("MALE", 78, "Petros", "Petrosyan", "fnretjnvf");
//        System.out.println(anotherHuman.getFirstName());
//        anotherHuman.walk(3);

        // 8 primitive types
        byte d;
        short e;
        int f = 98;
        long g;

        float h;
        double i;

        boolean j;

        char k;

//        Byte dd = Byte.valueOf("6"); // Wrapper
//        Short
        Integer in;
//        Long
//        Float
//        Double
//        Boolean
//        Character

//        System.out.println(dd);

//        d = (byte)dd;  // unboxing
        in = f;          // autoboxing

//        System.out.println(in);

        Human human = new Worker("MALE", 22, "Jack", "Daniels", "AR432922", "Abovyan 2");

        System.out.println("Doctor name: " + human.getFullName());
//        Worker worker = new Worker("MALE", 43, "JAMES", "BOND", "AR8438922", "Abovyan 1");
*/
//        Programmer programmer = new Programmer("MALE", 43, "JAMES", "BOND", "AR8438922", "Abovyan 1");

//        System.out.println("Programmer name: " + human.getFullName());

//        System.out.println(programmer.a);

        /*Doctor doctor = new Doctor("FEMALE", 56, "JAMES1", "BOND1", "AR8438922", "Abovyan 2");

        System.out.println(WeakDay.SUNDAY.dayName);
        System.out.println(WeakDay.SUNDAY.workingHours);*/
/*

        programmer.setSalary(1000);

        System.out.println(programmer.payDaily(Currency.AED));

        Payable p = new Doctor("FEMALE", 56, "JAMES1", "BOND1", "AR8438922", "Abovyan 2");
*/
/*
        System.out.println(Human.age);
        Human.printAge();

//        Worker doctor = new Worker("FEMALE", 56, "JAMES1", "BOND1", "AR8438922", "Abovyan 2");

        System.out.println(Worker.FIRST_HUMAN_EVER.getFullName());
        Worker.FIRST_HUMAN_EVER.setFirstName("Eva");
        System.out.println(Worker.FIRST_HUMAN_EVER.getFullName());*/

        Human human1;

        Doctor doctor = new Doctor("FEMALE", 56, "JAMES1_Dc", "BOND1_Dc", "AR8438922", "Abovyan 2");

//        System.out.println(human1.getFullName());

        human1 = new Programmer("FEMALE", 56, "JAMES1_Pr", "BOND1_Pr", "AR8438922", "Abovyan 2");;

        System.out.println(human1.getFullName());

//        Human human2 = new Human();

//        human1 = human2;

//        human2.setFirstName("aaaa");

//        System.out.println(human1.getFirstName());


//        Worker.FIRST_HUMAN_EVER = human1;


        doctor.print(Currency.AFN, 3);

        Car car = new BMW(Color.BLACK);
        car.drive();

        Singable singable = new Doctor("FEMALE", 56, "JAMES1_Dc", "BOND1_Dc", "AR8438922", "Abovyan 2");
    }
}