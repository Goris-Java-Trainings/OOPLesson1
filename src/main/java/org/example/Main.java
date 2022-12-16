package org.example;

import human.Human;

public class Main {
    public static void main(String[] args) {
        // instantiate of a new Human
        Human humanInstance = new Human(-665, "bhfrbejhfbne"); // constructor

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

        System.out.println(in);
    }
}