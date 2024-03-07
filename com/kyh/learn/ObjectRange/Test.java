package com.kyh.learn.ObjectRange;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] cars = new Car[3];

        for (int i = 0; i < cars.length; i++){
            String carBrand = sc.next();
            int carPrice = sc.nextInt();
            String carColor = sc.next();
            Car car = new Car(carBrand, carPrice, carColor);
            cars[i] = car;
        }
        
        for (int i = 0; i < cars.length; i ++){
            printInfo(cars[i]);
        }

        sc.close();
    }

    public static void printInfo(Car car){
        System.out.println("The car's info is " + car.getBrand() + " "
        + car.getPrice() + " " + car.getColor());
    }
}
