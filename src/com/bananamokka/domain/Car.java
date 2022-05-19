package com.bananamokka.domain;

import com.bananamokka.domain.CarMovement;

public class Car implements CarMovement, Comparable<Car>{


    private String carMark;

    private String carModel;

    private int doors;

    private double engineVolume;

    private int yearOfCreation;

    private String bodyType;

    private double wheelDiameter;

    //Default constructor
    public Car() {

    }

    //Constructor with params
    public Car(String carMark, String carModel, int doors, double engineVolume, int yearOfCreation, String bodyType,
               double wheelDiameter) {
        this.carMark = carMark;
        this.carModel = carModel;
        this.doors = doors;
        this.engineVolume = engineVolume;
        this.yearOfCreation = yearOfCreation;
        this.bodyType = bodyType;
        this.wheelDiameter = wheelDiameter;
    }

    //Another one constructor with params
    public Car(String carMark, String carModel) {
        this.carMark = carMark;
        this.carModel = carModel;
    }

    //Getters & Setters
    public String getCarMark() {
        return carMark;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public double getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(double wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (doors != car.doors) return false;
        if (Double.compare(car.engineVolume, engineVolume) != 0) return false;
        if (yearOfCreation != car.yearOfCreation) return false;
        if (Double.compare(car.wheelDiameter, wheelDiameter) != 0) return false;
        if (carMark != null ? !carMark.equals(car.carMark) : car.carMark != null) return false;
        if (carModel != null ? !carModel.equals(car.carModel) : car.carModel != null) return false;
        return bodyType != null ? bodyType.equals(car.bodyType) : car.bodyType == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = carMark != null ? carMark.hashCode() : 0;
        result = 31 * result + (carModel != null ? carModel.hashCode() : 0);
        result = 31 * result + doors;
        temp = Double.doubleToLongBits(engineVolume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + yearOfCreation;
        result = 31 * result + (bodyType != null ? bodyType.hashCode() : 0);
        temp = Double.doubleToLongBits(wheelDiameter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carMark='" + carMark + '\'' +
                ", carModel='" + carModel + '\'' +
                ", doors=" + doors +
                ", engineVolume=" + engineVolume +
                ", yearOfCreation=" + yearOfCreation +
                ", bodyType='" + bodyType + '\'' +
                ", wheelDiameter=" + wheelDiameter +
                '}';
    }

    @Override
    public void run() {
        System.out.println("Car is moving!");
    }

    @Override
    public int move() {
        int kilometres = 50;
        System.out.println("Car moved " + kilometres + "km further");
        return kilometres;
    }


    @Override
    public int compareTo(Car o) {
        int result = 0;
        if (this.yearOfCreation > o.getYearOfCreation())
            result = 1;
        if (this.yearOfCreation < o.getYearOfCreation())
            result = -1;
        return result;
    }

}
