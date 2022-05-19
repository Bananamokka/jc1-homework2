package com.bananamokka;

import com.bananamokka.domain.Car;
import com.bananamokka.util.CarGenerator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //We'll generate cars
        Car Cars[] = CarGenerator.generateCars();
        for (int i = 0; i < Cars.length; i++) {
            System.out.println(Cars[i]);
        }

        //Now we'll sort our cars
        Arrays.sort(Cars);
        System.out.println("Cars, sorted by Year of Creation:");
        for (int i = 0; i < Cars.length; i++) {
            System.out.println(Cars[i]);
        }

        //Methods from Interface
        Cars[0].run();
        Cars[0].move();
    }
}
