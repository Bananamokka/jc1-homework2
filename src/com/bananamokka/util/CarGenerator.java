package com.bananamokka.util;

import com.bananamokka.domain.Car;
import com.bananamokka.domain.CarMarks;

public class CarGenerator implements CarMarks {

    public static Car[] generateCars() {

        int count = 10;
        String [] carModels = new String[] {"M3", "916", "Supra", "Aventador", "Rocket", "Flash"};
        String [] bodyTypes = new String[] {"sedan", "hatchback", "coupe", "roadster", "universal"};
        Car[] Cars = new Car[count];
        for (int i = 0; i < Cars.length; i++) {
            Cars[i] = new Car();
            Cars[i].setCarMark(CarMarks.CAR_MARKS[(int) (Math.random() * (CarMarks.CAR_MARKS.length - 1))]);
            Cars[i].setCarModel(carModels[(int) (Math.random() * (carModels.length - 1))]);
            Cars[i].setDoors((int) (Math.random() * 4 + 2));
            Cars[i].setEngineVolume((double) 2.3 + (Math.random() * 3.3));
            Cars[i].setYearOfCreation((int) (1990 + Math.random() * 11));
            Cars[i].setBodyType(bodyTypes[(int) (Math.random() * (bodyTypes.length - 1))]);
            Cars[i].setWheelDiameter((int) (Math.random() * 6 + 18));
        }
        return Cars;
    }
}
