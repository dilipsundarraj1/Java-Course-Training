package com.learnJava.inheritance;

public class VehicleClient {

    public static void main(String[] args) {

        Car car = new Car();
        car.setNoOfSeats(4);
        car.setOwner("ABC");
        car.setWheels(4);
        car.setYear(2017);
        car.setColor("black");
        car.setModel("camry");

        car.drive();

        MotorBike motorBike= new MotorBike();
        motorBike.setModel("HarleyDavidson");
        motorBike.setOwner("XYZ");
        motorBike.setWheels(2);
        motorBike.setYear(2018);
        motorBike.setColor("Red");

        motorBike.drive();

        ElectricCar electricCar = new ElectricCar(300);

        electricCar.setNoOfSeats(2);
        electricCar.setOwner("XYZ");
        electricCar.setWheels(3);
        electricCar.setYear(2017);
        electricCar.setColor("yellow");
        electricCar.setModel("tesla");

        Vehicle vehicle = new Car();

        vehicle.drive();




    }


}
